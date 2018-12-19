package com.fqcheng220.common.exception;

public class ReqTokenAuthException  extends Exception{
    public ReqTokenAuthException() {
        super("请求token认证失败");
    }
}
