package com.fqcheng220.common.constants;

public interface RequestConstants {
    //业务功能号相关
    //用户操作
    public static final int TYPE_UPMS_USER_ADD = 0;
    public static final int TYPE_UPMS_USER_DEL = 1;
    public static final int TYPE_UPMS_USER_UPDATE = 2;
    public static final int TYPE_UPMS_USER_LIST = 3;
    public static final int TYPE_UPMS_USER_UPDATE_SELF = 4;
    public static final int TYPE_UPMS_USER_LIST_SELF = 5;

    //角色操作
    public static final int TYPE_UPMS_ROLE_ADD = 6;
    public static final int TYPE_UPMS_ROLE_DEL = 7;
    public static final int TYPE_UPMS_ROLE_UPDATE = 8;
    public static final int TYPE_UPMS_ROLE_LIST = 9;

    //用户-角色操作
    public static final int TYPE_UPMS_USERROLE_ADD = 10;
    public static final int TYPE_UPMS_USERROLE_DEL = 11;
    public static final int TYPE_UPMS_USERROLE_UPDATE = 12;
    public static final int TYPE_UPMS_USERROLE_LIST = 13;

    //权限操作
    public static final int TYPE_UPMS_PERMISSION_ADD = 14;
    public static final int TYPE_UPMS_PERMISSION_DEL = 15;
    public static final int TYPE_UPMS_PERMISSION_UPDATE = 16;
    public static final int TYPE_UPMS_PERMISSION_LIST = 17;
}
