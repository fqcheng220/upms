package com.fqcheng220.dto;

import com.fqcheng220.model.*;

import java.util.List;

public class ProductSkuDto {
    public ProductSku mProductSku;

    public List<ProductCategoryAttrDto> mProductCategoryAttrDtoList;

    public List<ProductCategorySpecDto> mProductCategorySpecDtoList;

//    public Long tbProductSkuId;

    public Long tbProductSpuId;

    public String tbProductSpuName;

    public Long tbProductCategoryId;

    public String tbProductCategoryName;

    public static class ProductCategoryAttrDto{
        public ProductAttr mProductAttr;
        public List<ProductAttrValue> mProductAttrValueList;
        public ProductAttrValue mProductAttrValue;
    }

    public static class ProductCategorySpecDto{
        public ProductSpec mProductSpec;
        public List<ProductSpecValue> mProductSpecValueList;
        public ProductSpecValue mProductSpecValue;
    }
}
