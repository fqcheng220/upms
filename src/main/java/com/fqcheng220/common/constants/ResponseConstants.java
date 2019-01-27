package com.fqcheng220.common.constants;

public interface ResponseConstants {
    public static final int STATUS_SUC = 0;
    public static final int STATUS_FAIL_SQL_HANDLE = 1;
    public static final int STATUS_FAIL_REQ_VAL = 2;
    public static final int STATUS_FAIL_UNKOWN = 3;
    public static final int STATUS_FAIL_AUTHC_FAIL = 4;
    public static final int STATUS_FAIL_AUTHR_FAIL = 5;
    public static final int STATUS_FAIL_TOKEN_NOT_COMPATIABLE_WITH_USER = 6;
    public static final int STATUS_FAIL_REQ_ARGS = 7;

    public static String MSG_ERROR_SQL_HANDLE = "数据库操作失败";
    public static String MSG_ERROR_AUTHC = "用户认证失败";
    public static String MSG_ERROR_AUTHR = "没有访问权限";
    public static String MSG_ERROR_TOKEN_NOT_COMPATIABLE_WITH_USER = "普通token用户不能操作非本人数据";
    public static String MSG_ERROR_REQ_ARGS = "请求参数错误";
    public static String MSG_ERROR_LOGIN = "未知错误";

    public static String MSG_SUC_LOGIN = "登录成功";
    public static String MSG_SUC_UPDATE= "更新用户成功";
    public static String MSG_SUC_LIST= "查询用户成功";
    public static String MSG_SUC_ADD= "添加用户成功";
    public static String MSG_SUC_DEL= "删除用户成功";
}
