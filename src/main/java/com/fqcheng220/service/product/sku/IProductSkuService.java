package com.fqcheng220.service.product.sku;

import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.dto.ProductSkuSelfDto;
import com.fqcheng220.model.ProductSku;
import com.fqcheng220.model.ProductSkuExample;
import com.fqcheng220.service.IBaseService;

import java.util.List;

public interface IProductSkuService extends IBaseService<ProductSku,ProductSkuExample> {
    List<ProductSkuSelfDto> listEnhancedSelf();
    List<ProductSkuDto> listEnhanced();

    List<ProductSkuDto> listEnhancedCombAll();
    List<ProductSkuDto> listEnhancedCombAll(long skuId);
    List<ProductSkuDto> listEnhancedBySpec();
    List<ProductSkuDto> listEnhancedBySpec(long skuId);
    List<ProductSkuDto> listEnhancedByAttr();
    List<ProductSkuDto> listEnhancedByAttr(long skuId);

    List<ProductSkuDto> listEnhancedByAttrSimpleValuesList();
    List<ProductSkuDto> listEnhancedByAttrSimpleValue();
}
