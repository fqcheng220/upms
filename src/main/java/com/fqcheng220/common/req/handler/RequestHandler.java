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
