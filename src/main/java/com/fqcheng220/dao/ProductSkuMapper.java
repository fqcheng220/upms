package com.fqcheng220.dao;

import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.dto.ProductSkuSelfDto;
import com.fqcheng220.model.ProductSku;
import com.fqcheng220.model.ProductSkuExample;

import java.util.List;

public interface ProductSkuMapper extends IBaseMapper<ProductSku,ProductSkuExample>{
    List<ProductSkuSelfDto> listEnhancedSelf();
    List<ProductSkuDto> listEnhanced();
    List<ProductSkuDto> listEnhancedBySpec();
    List<ProductSkuDto> listEnhancedBySpec(long skuId);
    List<ProductSkuDto> listEnhancedByAttr();
    List<ProductSkuDto> listEnhancedByAttr(long skuId);

    List<ProductSkuDto> listEnhancedByAttrSimpleValuesList();
    List<ProductSkuDto> listEnhancedByAttrSimpleValue();
}