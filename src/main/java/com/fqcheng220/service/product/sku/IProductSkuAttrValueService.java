package com.fqcheng220.service.product.sku;

import com.fqcheng220.common.resp.ProductSkuAttrValueUpdateResult;
import com.fqcheng220.dto.ProductSkuAttrValueSelfDto;
import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.model.ProductSkuAttrValue;
import com.fqcheng220.model.ProductSkuAttrValueExample;
import com.fqcheng220.service.IBaseService;

import java.util.List;

public interface IProductSkuAttrValueService extends IBaseService<ProductSkuAttrValue,ProductSkuAttrValueExample> {
    ProductSkuAttrValueUpdateResult updateEnhanced(ProductSkuDto productSkuDto);
    List<ProductSkuAttrValueSelfDto> listEnhancedSelf();
}
