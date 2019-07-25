package com.fqcheng220.dao;

import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.model.ProductSku;
import com.fqcheng220.model.ProductSkuExample;

import java.util.List;

public interface ProductSkuMapper extends IBaseMapper<ProductSku,ProductSkuExample>{
    List<ProductSkuDto> listEnhanced();
}