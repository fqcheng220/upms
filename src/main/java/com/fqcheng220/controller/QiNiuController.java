package com.fqcheng220.controller;

import com.fqcheng220.common.constants.Constants;
import com.fqcheng220.common.constants.QiNiuConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.qiniu.QiNiuUploadReqBean;
import com.fqcheng220.common.resp.qiniu.QiNiuUploadRespBean;
import com.fqcheng220.common.resp.qiniu.QiNiuUploadTokenInfoRespBean;
import com.qiniu.util.Auth;
import com.qiniu.util.Base64;
import com.qiniu.util.StringMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

/**
 * @Title QiNiuController
 * @Description TODO
 * @Author fqcheng220
 * @Date 2019/5/11 0011 21:06
 * @Version 1.0
 */
@RestController
public class QiNiuController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    @RequestMapping(path = UrlPathConstants.QINIU_GET_UPLOADTOKEN,method = RequestMethod.GET)
    @CrossOrigin
    @ResponseBody
    public QiNiuUploadTokenInfoRespBean getUploadToken(@RequestParam(value = "target") Integer target,
                                                       @RequestParam(value = "id") String id) {
        Auth auth = Auth.create(QiNiuConstants.ACCESS_KEY, QiNiuConstants.SECRET_KEY);
        String key = "";
        switch (target) {
            case QiNiuConstants.BUCKET_CHILD_CATEGORY_USER_AVATER:
                key = "user/avater/" + id;
                break;
            case QiNiuConstants.BUCKET_CHILD_CATEGORY_PRODUCT:
                key = "product/category/icon/" + id;
                break;
            default:
                key = "imgTest.jpg";
        }
        StringMap putPolicy = new StringMap();
        putPolicy.put("callbackUrl", Constants.DEPLOY_DOMAIN + UrlPathConstants.QINIU_CALLBACK_UPLOAD);
        String callbackBody = String.format("{\"key\":\"$(key)\",\"bucket\":\"$(bucket)\",\"domain\":\"%s\",\"target\":\"%d\"}",
                QiNiuConstants.DOMAIN,
                target);
        mLogger.debug("callbackBody="+callbackBody);
        putPolicy.put("callbackBody",callbackBody);
        putPolicy.put("callbackBodyType","application/json");
        long expires = 3600;
        QiNiuUploadTokenInfoRespBean resp = new QiNiuUploadTokenInfoRespBean();
        resp.key = key;
        resp.token = auth.uploadToken(QiNiuConstants.BUCKET,key,expires,putPolicy);
        return resp;
    }

    @RequestMapping(path = UrlPathConstants.QINIU_CALLBACK_UPLOAD,method = RequestMethod.POST)
    @ResponseBody
    //如果请求的body不是json串会报错
    public QiNiuUploadRespBean callbackUpload(@RequestBody QiNiuUploadReqBean req) {
        QiNiuUploadRespBean resp = new QiNiuUploadRespBean();
        resp.mStatusCode = 0;
        resp.mMsg = "suc:" + req.toString();
        resp.domain = req.domain;
        resp.key = req.key;
        resp.bucket = req.bucket;
        resp.target = req.target;
        return resp;
    }

    @RequestMapping(path = UrlPathConstants.QINIU_GET_DOWNLOADTOKEN,method = RequestMethod.GET)
    @CrossOrigin
    public String getDownloadToken(@RequestParam(value = "expires", required = false) Long expires,
                                   @RequestParam(value = "domain") String domain,
                                   @RequestParam(value = "key") String key) {
        Auth auth = Auth.create(QiNiuConstants.ACCESS_KEY, QiNiuConstants.SECRET_KEY);
        String baseUrl = domain + key;
//        try {
//            baseUrl = domain + new String(Base64.encode(key.getBytes("UTF-8"),Base64.DEFAULT),"UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        if(baseUrl != null){
            return auth.privateDownloadUrl(baseUrl, expires);
        }else{
            return "";
        }
    }
}
