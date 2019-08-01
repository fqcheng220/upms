package com.fqcheng220.dao;

import com.fqcheng220.dto.ProductSkuAttrValueSelfDto;
import com.fqcheng220.model.ProductSkuAttrValue;
import com.fqcheng220.model.ProductSkuAttrValueExample;

import java.util.List;

public interface ProductSkuAttrValueMapper extends IBaseMapper<ProductSkuAttrValue,ProductSkuAttrValueExample>{
    List<ProductSkuAttrValueSelfDto> listEnhancedSelf();
}