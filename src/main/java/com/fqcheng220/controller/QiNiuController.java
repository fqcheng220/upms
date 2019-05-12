package com.fqcheng220.controller;

import com.fqcheng220.common.constants.QiNiuConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.qiniu.QiNiuUploadReqBean;
import com.fqcheng220.common.resp.qiniu.QiNiuUploadRespBean;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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
    public String getUploadToken(@RequestParam(value = "target") Integer target,
                                 @RequestParam(value = "userId") String userId) {
        Auth auth = Auth.create(QiNiuConstants.ACCESS_KEY, QiNiuConstants.SECRET_KEY);
        String key = "";
        switch (target) {
            case QiNiuConstants.BUCKET_CHILD_CATEGORY_USER_AVATER:
                key = "user/avater/" + userId;
                break;
            case QiNiuConstants.BUCKET_CHILD_CATEGORY_PRODUCT:
            default:
                key = "user/avater/testUser";
        }
        StringMap putPolicy = new StringMap();
        putPolicy.put("callbackUrl",UrlPathConstants.QINIU_CALLBACK_UPLOAD);
        String callbackBody = String.format("{\"key\":\"$(key)\",\"bucket\":\"$(bucket)\",\"domain\":%s,\"target\":%d}",
                QiNiuConstants.DOMAIN,
                target);
        mLogger.debug("callbackBody="+callbackBody);
        putPolicy.put("callbackBody",callbackBody);
        putPolicy.put("callbackBodyType","application/json");
        long expires = 3600;
        return auth.uploadToken(QiNiuConstants.BUCKET,key,expires,putPolicy);
    }

    @RequestMapping(path = UrlPathConstants.QINIU_CALLBACK_UPLOAD,method = RequestMethod.POST)
    @ResponseBody
    public QiNiuUploadRespBean callbackUpload(@RequestBody QiNiuUploadReqBean req) {
        QiNiuUploadRespBean resp = new QiNiuUploadRespBean();
        resp.mStatusCode = 0;
        resp.mMsg = "suc:" + req.toString();
        return resp;
    }
}
