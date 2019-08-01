package com.fqcheng220.dao;

import com.fqcheng220.dto.ProductSkuSpecValueSelfDto;
import com.fqcheng220.model.ProductSkuSpecValue;
import com.fqcheng220.model.ProductSkuSpecValueExample;

import java.util.List;

public interface ProductSkuSpecValueMapper extends IBaseMapper<ProductSkuSpecValue,ProductSkuSpecValueExample>{
    List<ProductSkuSpecValueSelfDto> listEnhancedSelf();
}