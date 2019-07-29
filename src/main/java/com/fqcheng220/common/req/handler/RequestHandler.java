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

        /**
         * ***********************商品子系统***********************
         */
        //分类
        sTypeMap.put(RequestConstants.TYPE_CATEGORY_ADD,UrlPathConstants.PRODUCT_CATEGORY_ADD);
        sTypeMap.put(RequestConstants.TYPE_CATEGORY_DEL,UrlPathConstants.PRODUCT_CATEGORY_DEL);
        sTypeMap.put(RequestConstants.TYPE_CATEGORY_UPDATE,UrlPathConstants.PRODUCT_CATEGORY_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_CATEGORY_LIST,UrlPathConstants.PRODUCT_CATEGORY_LIST_ALL);
        sTypeMap.put(RequestConstants.TYPE_CATEGORY_LIST_CHILD,UrlPathConstants.PRODUCT_CATEGORY_LIST_CHILD);
        sTypeMap.put(RequestConstants.TYPE_CATEGORY_LIST_ATTR,UrlPathConstants.PRODUCT_CATEGORY_LIST_ATTR);
        sTypeMap.put(RequestConstants.TYPE_CATEGORY_LIST_SPEC,UrlPathConstants.PRODUCT_CATEGORY_LIST_SPEC);
        //属性
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_ATTR_ADD,UrlPathConstants.PRODUCT_ATTR_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_ATTR_DEL,UrlPathConstants.PRODUCT_ATTR_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_ATTR_UPDATE,UrlPathConstants.PRODUCT_ATTR_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_ATTR_LIST_ALL,UrlPathConstants.PRODUCT_ATTR_LIST_ALL);
        //属性值
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_ATTRVALUE_ADD,UrlPathConstants.PRODUCT_ATTRVALUE_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_ATTRVALUE_DEL,UrlPathConstants.PRODUCT_ATTRVALUE_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_ATTRVALUE_UPDATE,UrlPathConstants.PRODUCT_ATTRVALUE_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_ATTRVALUE_LIST_ALL,UrlPathConstants.PRODUCT_ATTRVALUE_LIST_ALL);
        //规格
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPEC_ADD,UrlPathConstants.PRODUCT_SPEC_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPEC_DEL,UrlPathConstants.PRODUCT_SPEC_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPEC_UPDATE,UrlPathConstants.PRODUCT_SPEC_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPEC_LIST_ALL,UrlPathConstants.PRODUCT_SPEC_LIST_ALL);
        //规格值
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPECVALUE_ADD,UrlPathConstants.PRODUCT_SPECVALUE_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPECVALUE_DEL,UrlPathConstants.PRODUCT_SPECVALUE_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPECVALUE_UPDATE,UrlPathConstants.PRODUCT_SPECVALUE_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPECVALUE_LIST_ALL,UrlPathConstants.PRODUCT_SPECVALUE_LIST_ALL);

        //货品SPU
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_ADD,UrlPathConstants.PRODUCT_SPU_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_DEL,UrlPathConstants.PRODUCT_SPU_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_UPDATE,UrlPathConstants.PRODUCT_SPU_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_LIST_ALL,UrlPathConstants.PRODUCT_SPU_LIST_ALL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_ENHANCED_LIST_ALL,UrlPathConstants.PRODUCT_SPU_ENHANCED_LIST_ALL);
        //货品SPU 图片
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_IMG_ADD,UrlPathConstants.PRODUCT_SPU_IMG_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_IMG_DEL,UrlPathConstants.PRODUCT_SPU_IMG_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_IMG_UPDATE,UrlPathConstants.PRODUCT_SPU_IMG_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_IMG_LIST_ALL,UrlPathConstants.PRODUCT_SPU_IMG_LIST_ALL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_IMG_LIST_BY_SPU,UrlPathConstants.PRODUCT_SPU_IMG_LIST_BY_SPU);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_IMG_UPDATE_ENHANCED,UrlPathConstants.PRODUCT_SPU_IMG_UPDATE_ENHANCED);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SPU_IMG_DEL_ENHANCEDD,UrlPathConstants.PRODUCT_SPU_IMG_DEL_ENHANCED);
        //商品SKU
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ADD,UrlPathConstants.PRODUCT_SKU_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_DEL,UrlPathConstants.PRODUCT_SKU_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_UPDATE,UrlPathConstants.PRODUCT_SKU_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_UPDATE_ENHANCED,UrlPathConstants.PRODUCT_SKU_UPDATE_ENHANCED);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_LIST_ALL,UrlPathConstants.PRODUCT_SKU_LIST_ALL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ENHANCED_LIST_ALL,UrlPathConstants.PRODUCT_SKU_ENHANCED_LIST_ALL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ENHANCED_COMB_LIST_ALL,UrlPathConstants.PRODUCT_SKU_ENHANCED_COMB_LIST_ALL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ENHANCED_COMB_NEW_LIST_ALL,UrlPathConstants.PRODUCT_SKU_ENHANCED_COMB_NEW_LIST_ALL);

        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ENHANCED_ATTR_LIST_ALL,UrlPathConstants.PRODUCT_SKU_ENHANCED_ATTR_LIST_ALL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ENHANCED_SPEC_LIST_ALL,UrlPathConstants.PRODUCT_SKU_ENHANCED_SPEC_LIST_ALL);
        //商品SKU属性值
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ATTRVALUE_ADD,UrlPathConstants.PRODUCT_SKU_ATTRVALUE_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ATTRVALUE_DEL,UrlPathConstants.PRODUCT_SKU_ATTRVALUE_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ATTRVALUE_UPDATE,UrlPathConstants.PRODUCT_SKU_ATTRVALUE_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ATTRVALUE_UPDATE_ENHANCED,UrlPathConstants.PRODUCT_SKU_ATTRVALUE_UPDATE_ENHANCED);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_ATTRVALUE_LIST_ALL,UrlPathConstants.PRODUCT_SKU_ATTRVALUE_LIST_ALL);
        //商品SKU规格值
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_SPECVALUE_ADD,UrlPathConstants.PRODUCT_SKU_SPECVALUE_ADD);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_SPECVALUE_DEL,UrlPathConstants.PRODUCT_SKU_SPECVALUE_DEL);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_SPECVALUE_UPDATE,UrlPathConstants.PRODUCT_SKU_SPECVALUE_UPDATE);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_SPECVALUE_UPDATE_ENHANCED,UrlPathConstants.PRODUCT_SKU_SPECVALUE_UPDATE_ENHANCED);
        sTypeMap.put(RequestConstants.TYPE_PRODUCT_SKU_SPECVALUE_LIST_ALL,UrlPathConstants.PRODUCT_SKU_SPECVALUE_LIST_ALL);

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
