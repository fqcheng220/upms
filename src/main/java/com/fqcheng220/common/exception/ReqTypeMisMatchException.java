package com.fqcheng220.common.exception;

public class ReqTypeMisMatchException  extends Exception{
    public ReqTypeMisMatchException() {
        super("功能号不匹配");
    }
}
