package com.fqcheng220.service.product.spu;

import com.fqcheng220.dto.ProductSpuImgDtoNew;
import com.fqcheng220.model.ProductSpu;
import com.fqcheng220.model.ProductSpuExample;
import com.fqcheng220.service.IBaseService;

import java.util.List;

public interface IProductSpuService extends IBaseService<ProductSpu,ProductSpuExample> {
    List<ProductSpuImgDtoNew> listEnhanced();
}
