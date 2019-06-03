package com.fqcheng220.common.req.handler;

import com.fqcheng220.common.constants.RequestConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.exception.ReqTypeMisMatchException;
import com.fqcheng220.common.req.BaseRequestBody;

import java.util.HashMap;
import java.util.Map;

public class RequestHandler {
    private static Map<Integer,String> sTypeMap = new HashMap<>();
    static {
        //用户
        sTypeMap.put(RequestConstants.TYPE_UPMS_USER_ADD,UrlPathConstants.USER_ADD);
        sTypeMap.put(RequestConstants.TYPE_UPMS_USER_DEL,UrlPathConstants.USER_DEL);
        sTypeMap.put(RequestConstants.TYPE_UPMS_USER_UPDATE,UrlPathConstants.USER_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_UPMS_USER_UPDATE_SELF,UrlPathConstants.USER_UPDATE_SELF);
        sTypeMap.put(RequestConstants.TYPE_UPMS_USER_LIST,UrlPathConstants.USER_LIST);
        //角色
        sTypeMap.put(RequestConstants.TYPE_UPMS_ROLE_ADD,UrlPathConstants.ROLE_ADD);
        sTypeMap.put(RequestConstants.TYPE_UPMS_ROLE_DEL,UrlPathConstants.ROLE_DEL);
        sTypeMap.put(RequestConstants.TYPE_UPMS_ROLE_UPDATE,UrlPathConstants.ROLE_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_UPMS_ROLE_LIST,UrlPathConstants.ROLE_LIST);
        //用户-角色
        sTypeMap.put(RequestConstants.TYPE_UPMS_USERROLE_ADD,UrlPathConstants.USERROLE_ADD);
        sTypeMap.put(RequestConstants.TYPE_UPMS_USERROLE_DEL,UrlPathConstants.USERROLE_DEL);
        sTypeMap.put(RequestConstants.TYPE_UPMS_USERROLE_UPDATE,UrlPathConstants.USERROLE_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_UPMS_USERROLE_LIST,UrlPathConstants.USERROLE_LIST);
        //权限
        sTypeMap.put(RequestConstants.TYPE_UPMS_PERMISSION_ADD,UrlPathConstants.PERMISSION_ADD);
        sTypeMap.put(RequestConstants.TYPE_UPMS_PERMISSION_DEL,UrlPathConstants.PERMISSION_DEL);
        sTypeMap.put(RequestConstants.TYPE_UPMS_PERMISSION_UPDATE,UrlPathConstants.PERMISSION_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_UPMS_PERMISSION_LIST,UrlPathConstants.PERMISSION_LIST);
        //角色-权限
        sTypeMap.put(RequestConstants.TYPE_UPMS_ROLEPERMISSION_ADD,UrlPathConstants.ROLEPERMISSION_ADD);
        sTypeMap.put(RequestConstants.TYPE_UPMS_ROLEPERMISSION_DEL,UrlPathConstants.ROLEPERMISSION_DEL);
        sTypeMap.put(RequestConstants.TYPE_UPMS_ROLEPERMISSION_UPDATE,UrlPathConstants.ROLEPERMISSION_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_UPMS_ROLEPERMISSION_LIST,UrlPathConstants.ROLEPERMISSION_LIST);
    }
    public static void handle(String pathUrl, BaseRequestBody baseRequestBody) throws Exception{
        //功能号判断
        if(!sTypeMap.containsKey(baseRequestBody.mType)
                || sTypeMap.get(baseRequestBody.mType) == null
                || !sTypeMap.get(baseRequestBody.mType).equals(pathUrl)){
            throw new ReqTypeMisMatchException();
        }
        //token认证
    }
}
