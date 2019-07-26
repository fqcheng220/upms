package com.fqcheng220.service.product.sku;

import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.model.ProductSku;
import com.fqcheng220.model.ProductSkuExample;
import com.fqcheng220.service.IBaseService;

import java.util.List;

public interface IProductSkuService extends IBaseService<ProductSku,ProductSkuExample> {
    List<ProductSkuDto> listEnhanced();
    List<ProductSkuDto> listEnhancedBySpec();
    List<ProductSkuDto> listEnhancedByAttr();

    List<ProductSkuDto> listEnhancedByAttrSimpleValuesList();
    List<ProductSkuDto> listEnhancedByAttrSimpleValue();
}
