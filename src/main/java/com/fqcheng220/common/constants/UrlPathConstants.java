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


    /**
     * ***********************商品子系统***********************
     */
    //分类
    public static final String PRODUCT_CATEGORY_ADD = "/product/category/add";
    public static final String PRODUCT_CATEGORY_DEL = "/product/category/del";
    public static final String PRODUCT_CATEGORY_UPDATE = "/product/category/update";
    public static final String PRODUCT_CATEGORY_LIST_ALL = "/product/category/list/all";
    public static final String PRODUCT_CATEGORY_LIST_CHILD = "/product/category/list/{parentId}";
    public static final String PRODUCT_CATEGORY_LIST_ATTR = "/product/category/attr/list/{categoryId}";
    public static final String PRODUCT_CATEGORY_LIST_SPEC = "/product/category/spec/list/{categoryId}";
    //属性
    public static final String PRODUCT_ATTR_ADD = "/product/attr/add";
    public static final String PRODUCT_ATTR_DEL = "/product/attr/del";
    public static final String PRODUCT_ATTR_UPDATE = "/product/attr/update";
    public static final String PRODUCT_ATTR_LIST = "/product/attr/list/{categoryId}";
    public static final String PRODUCT_ATTR_LIST_ALL = "/product/attr/list/all";

    //属性值
    public static final String PRODUCT_ATTRVALUE_ADD = "/product/attrvalue/add";
    public static final String PRODUCT_ATTRVALUE_DEL = "/product/attrvalue/del";
    public static final String PRODUCT_ATTRVALUE_UPDATE = "/product/attrvalue/update";
    public static final String PRODUCT_ATTRVALUE_LIST = "/product/attrvalue/list/{attrId}";
    public static final String PRODUCT_ATTRVALUE_LIST_ALL = "/product/attrvalue/list/all";
    //规格
    public static final String PRODUCT_SPEC_ADD = "/product/spec/add";
    public static final String PRODUCT_SPEC_DEL = "/product/spec/del";
    public static final String PRODUCT_SPEC_UPDATE = "/product/spec/update";
    public static final String PRODUCT_SPEC_LIST = "/product/spec/list";
    public static final String PRODUCT_SPEC_LIST_ALL = "/product/spec/list/all";
    //规格值
    public static final String PRODUCT_SPECVALUE_ADD = "/product/specvalue/add";
    public static final String PRODUCT_SPECVALUE_DEL = "/product/specvalue/del";
    public static final String PRODUCT_SPECVALUE_UPDATE = "/product/specvalue/update";
    public static final String PRODUCT_SPECVALUE_LIST = "/product/specvalue/list";
    public static final String PRODUCT_SPECVALUE_LIST_ALL = "/product/specvalue/list/all";

    //货品SPU
    public static final String PRODUCT_SPU_ADD = "/product/spu/add";
    public static final String PRODUCT_SPU_DEL = "/product/spu/del";
    public static final String PRODUCT_SPU_UPDATE = "/product/spu/update";
    public static final String PRODUCT_SPU_LIST_ALL = "/product/spu/list/all";
    public static final String PRODUCT_SPU_ENHANCED_LIST_ALL = "/product/spu-enhanced/list/all";
    //货品SPU 图片
    public static final String PRODUCT_SPU_IMG_ADD = "/product/spu/img/add";
    public static final String PRODUCT_SPU_IMG_DEL = "/product/spu/img/del";
    public static final String PRODUCT_SPU_IMG_DEL_ENHANCED = "/product/spu/img/delEnhanced";
    public static final String PRODUCT_SPU_IMG_UPDATE = "/product/spu/img/update";
    public static final String PRODUCT_SPU_IMG_UPDATE_ENHANCED = "/product/spu/img/updateEnhanced";
    public static final String PRODUCT_SPU_IMG_LIST_ALL = "/product/spu/img/list/all";
    public static final String PRODUCT_SPU_IMG_LIST_BY_SPU = "/product/spu/img/listEnhanced/{spuId}";
    //商品SKU
    public static final String PRODUCT_SKU_ADD = "/product/sku/add";
    public static final String PRODUCT_SKU_DEL = "/product/sku/del";
    public static final String PRODUCT_SKU_DEL_ENHANCED  = "/product/sku/del-enhanced";
    public static final String PRODUCT_SKU_UPDATE = "/product/sku/update";
    public static final String PRODUCT_SKU_UPDATE_ENHANCED  = "/product/sku/update-enhanced";
    public static final String PRODUCT_SKU_LIST_ALL = "/product/sku/list/all";
    public static final String PRODUCT_SKU_ENHANCED_SELF_LIST_ALL = "/product/sku-enhanced-self/list/all";
    public static final String PRODUCT_SKU_ENHANCED_LIST_ALL = "/product/sku-enhanced/list/all";
    public static final String PRODUCT_SKU_ENHANCED_COMB_LIST_ALL = "/product/sku-enhanced-comb/list/all";
    public static final String PRODUCT_SKU_ENHANCED_COMB_NEW_LIST_ALL = "/product/sku-enhanced-comb-new/list/all";
    public static final String PRODUCT_SKU_ENHANCED_ATTR_LIST_ALL = "/product/sku-enhanced-attr/list/all";
    public static final String PRODUCT_SKU_ENHANCED_SPEC_LIST_ALL = "/product/sku-enhanced-spec/list/all";
    //商品SKU属性值
    public static final String PRODUCT_SKU_ATTRVALUE_ADD = "/product/sku/attrvalue/add";
    public static final String PRODUCT_SKU_ATTRVALUE_DEL = "/product/sku/attrvalue/del";
    public static final String PRODUCT_SKU_ATTRVALUE_UPDATE = "/product/sku/attrvalue/update";
    public static final String PRODUCT_SKU_ATTRVALUE_UPDATE_ENHANCED = "/product/sku/attrvalue/update-enhanced";
    public static final String PRODUCT_SKU_ATTRVALUE_LIST_ALL = "/product/sku/attrvalue/list/all";
    public static final String PRODUCT_SKU_ATTRVALUE_ENHANCED_SELF_LIST_ALL = "/product/sku/attrvalue-enhanced-self/list/all";
    //商品SKU规格值
    public static final String PRODUCT_SKU_SPECVALUE_ADD = "/product/sku/specvalue/add";
    public static final String PRODUCT_SKU_SPECVALUE_DEL = "/product/sku/specvalue/del";
    public static final String PRODUCT_SKU_SPECVALUE_UPDATE = "/product/sku/specvalue/update";
    public static final String PRODUCT_SKU_SPECVALUE_UPDATE_ENHANCED = "/product/sku/specvalue/update-enhanced";
    public static final String PRODUCT_SKU_SPECVALUE_LIST_ALL = "/product/sku/specvalue/list/all";
    public static final String PRODUCT_SKU_SPECVALUE_ENHANCED_SELF_LIST_ALL = "/product/sku/specvalue-enhanced-self/list/all";
}
