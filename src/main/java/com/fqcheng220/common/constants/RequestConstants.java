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

    //角色-权限操作
    public static final int TYPE_UPMS_ROLEPERMISSION_ADD = 18;
    public static final int TYPE_UPMS_ROLEPERMISSION_DEL = 19;
    public static final int TYPE_UPMS_ROLEPERMISSION_UPDATE = 20;
    public static final int TYPE_UPMS_ROLEPERMISSION_LIST = 21;

    /**
     * ***********************商品子系统***********************
     */
    //分类
    public static final int TYPE_CATEGORY_ADD = 222;
    public static final int TYPE_CATEGORY_DEL = 223;
    public static final int TYPE_CATEGORY_UPDATE = 224;
    public static final int TYPE_CATEGORY_LIST = 225;

    //属性
    public static final int TYPE_PRODUCT_ATTR_ADD = 226;
    public static final int TYPE_PRODUCT_ATTR_DEL = 227;
    public static final int TYPE_PRODUCT_ATTR_UPDATE = 228;
    public static final int TYPE_PRODUCT_ATTR_LIST_ALL = 229;
    //属性值
    public static final int TYPE_PRODUCT_ATTRVALUE_ADD = 230;
    public static final int TYPE_PRODUCT_ATTRVALUE_DEL = 231;
    public static final int TYPE_PRODUCT_ATTRVALUE_UPDATE = 232;
    public static final int TYPE_PRODUCT_ATTRVALUE_LIST_ALL = 233;
    //规格
    public static final int TYPE_PRODUCT_SPEC_ADD = 234;
    public static final int TYPE_PRODUCT_SPEC_DEL = 235;
    public static final int TYPE_PRODUCT_SPEC_UPDATE = 236;
    public static final int TYPE_PRODUCT_SPEC_LIST_ALL = 237;
    //规格值
    public static final int TYPE_PRODUCT_SPECVALUE_ADD = 238;
    public static final int TYPE_PRODUCT_SPECVALUE_DEL = 239;
    public static final int TYPE_PRODUCT_SPECVALUE_UPDATE = 240;
    public static final int TYPE_PRODUCT_SPECVALUE_LIST_ALL = 241;

    public static final int TYPE_CATEGORY_LIST_CHILD = 242;
    public static final int TYPE_CATEGORY_LIST_ATTR= 243;
    public static final int TYPE_CATEGORY_LIST_SPEC= 244;

    //货品SPU
    public static final int TYPE_PRODUCT_SPU_ADD = 300;
    public static final int TYPE_PRODUCT_SPU_DEL = 301;
    public static final int TYPE_PRODUCT_SPU_UPDATE = 302;
    public static final int TYPE_PRODUCT_SPU_LIST_ALL = 303;
    //货品SPU
    public static final int TYPE_PRODUCT_SPU_IMG_ADD = 304;
    public static final int TYPE_PRODUCT_SPU_IMG_DEL = 305;
    public static final int TYPE_PRODUCT_SPU_IMG_UPDATE = 306;
    public static final int TYPE_PRODUCT_SPU_IMG_LIST_ALL = 307;
    public static final int TYPE_PRODUCT_SPU_IMG_LIST_BY_SPU = 308;

    public static final int TYPE_PRODUCT_SPU_ENHANCED_LIST_ALL = 309;
    public static final int TYPE_PRODUCT_SPU_IMG_UPDATE_ENHANCED = 310;
    public static final int TYPE_PRODUCT_SPU_IMG_DEL_ENHANCEDD = 311;
    //商品SKU
    public static final int TYPE_PRODUCT_SKU_ADD = 312;
    public static final int TYPE_PRODUCT_SKU_DEL = 313;
    public static final int TYPE_PRODUCT_SKU_UPDATE = 314;
    public static final int TYPE_PRODUCT_SKU_LIST_ALL = 315;
    public static final int TYPE_PRODUCT_SKU_ENHANCED_LIST_ALL = 316;
    //商品SKU属性值
    public static final int TYPE_PRODUCT_SKU_ATTRVALUE_ADD = 317;
    public static final int TYPE_PRODUCT_SKU_ATTRVALUE_DEL = 318;
    public static final int TYPE_PRODUCT_SKU_ATTRVALUE_UPDATE = 319;
    public static final int TYPE_PRODUCT_SKU_ATTRVALUE_LIST_ALL = 320;
    //商品SKU规格值
    public static final int TYPE_PRODUCT_SKU_SPECVALUE_ADD = 321;
    public static final int TYPE_PRODUCT_SKU_SPECVALUE_DEL = 322;
    public static final int TYPE_PRODUCT_SKU_SPECVALUE_UPDATE = 323;
    public static final int TYPE_PRODUCT_SKU_SPECVALUE_LIST_ALL = 324;

    public static final int TYPE_PRODUCT_SKU_ENHANCED_ATTR_LIST_ALL = 325;
    public static final int TYPE_PRODUCT_SKU_ENHANCED_SPEC_LIST_ALL = 326;
    public static final int TYPE_PRODUCT_SKU_ENHANCED_COMB_LIST_ALL = 327;
    public static final int TYPE_PRODUCT_SKU_ENHANCED_COMB_NEW_LIST_ALL = 328;
    public static final int TYPE_PRODUCT_SKU_ATTRVALUE_UPDATE_ENHANCED = 329;
    public static final int TYPE_PRODUCT_SKU_SPECVALUE_UPDATE_ENHANCED = 330;
    public static final int TYPE_PRODUCT_SKU_UPDATE_ENHANCED = 331;
    public static final int TYPE_PRODUCT_SKU_DEL_ENHANCED = 332;
}
