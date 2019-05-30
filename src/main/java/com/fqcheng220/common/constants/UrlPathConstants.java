package com.fqcheng220.common.constants;

public interface UrlPathConstants {

    //用户
    public static final String USER_ADD = "/user/add";
    public static final String USER_DEL = "/user/del";
    public static final String USER_UPDATE = "/user/update";
    public static final String USER_UPDATE_SELF = "/user/updateSelf";
    public static final String USER_LIST = "/user/list/all";
    public static final String USER_LIST_SELF = "/user/listSelf";

    public static final String USER_LOGIN= "/user/login";
    public static final String USER_LOGINOUT= "/user/loginOut";

    public static final String QINIU_GET_UPLOADTOKEN= "/uploadToken";
    public static final String QINIU_CALLBACK_UPLOAD= "/callback/upload";
    public static final String QINIU_GET_DOWNLOADTOKEN= "/downloadToken";

    //角色
    public static final String ROLE_ADD = "/role/add";
    public static final String ROLE_DEL = "/role/del";
    public static final String ROLE_UPDATE = "/role/update";
    public static final String ROLE_LIST = "/role/list/all";
}
