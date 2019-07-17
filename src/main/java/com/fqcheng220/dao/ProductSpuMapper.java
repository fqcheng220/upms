package com.fqcheng220.dao;

import com.fqcheng220.dto.ProductSpuImgDtoNew;
import com.fqcheng220.model.ProductSpu;
import com.fqcheng220.model.ProductSpuExample;

import java.util.List;

public interface ProductSpuMapper extends IBaseMapper<ProductSpu,ProductSpuExample>{
    List<ProductSpuImgDtoNew> listEnhanced();
}