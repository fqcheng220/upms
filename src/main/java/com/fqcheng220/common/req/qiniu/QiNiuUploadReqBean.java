package com.fqcheng220.common.req.qiniu;

/**
 * @Title QiNiuUploadReqBean
 * @Description TODO
 * @Author fqcheng220
 * @Date 2019/5/11 0011 22:25
 * @Version 1.0
 */
public class QiNiuUploadReqBean {
    public String key;
    public String bucket;
    public String domain;
    public Integer target;

    @Override
    public String toString() {
        return "key="+key
                +",bucket="+bucket
                +",domain="+domain
                +",target="+target;
    }
}
