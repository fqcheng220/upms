package com.fqcheng220.common.constants;

public interface ResponseConstants {
    public static final int STATUS_SUC = 0;
    public static final int STATUS_FAIL_SQL_HANDLE= 1;
    public static final int STATUS_FAIL_REQ_VAL= 2;
    public static final int STATUS_FAIL_UNKOWN= 3;
    public static final int STATUS_FAIL_TOKEN_FAIL=4;

    public static String MSG_ERROR_SQL_HANDLE = "数据库操作失败";
}