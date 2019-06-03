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

    //用户-角色
    public static final String USERROLE_ADD = "/userrole/add";
    public static final String USERROLE_DEL = "/userrole/del";
    public static final String USERROLE_UPDATE = "/userrole/update";
    public static final String USERROLE_LIST = "/userrole/list/all";

    //权限
    public static final String PERMISSION_ADD = "/permission/add";
    public static final String PERMISSION_DEL = "/permission/del";
    public static final String PERMISSION_UPDATE = "/permission/update";
    public static final String PERMISSION_LIST = "/permission/list/all";

    //角色-权限
    public static final String ROLEPERMISSION_ADD = "/rolepermission/add";
    public static final String ROLEPERMISSION_DEL = "/rolepermission/del";
    public static final String ROLEPERMISSION_UPDATE = "/rolepermission/update";
    public static final String ROLEPERMISSION_LIST = "/rolepermission/list/all";
}
