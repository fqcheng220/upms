package com.fqcheng220.service.product.sku;

import com.fqcheng220.common.resp.ProductSkuAttrValueUpdateResult;
import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.model.ProductSkuAttrValue;
import com.fqcheng220.model.ProductSkuAttrValueExample;
import com.fqcheng220.service.IBaseService;

public interface IProductSkuAttrValueService extends IBaseService<ProductSkuAttrValue,ProductSkuAttrValueExample> {
    ProductSkuAttrValueUpdateResult updateEnhanced(ProductSkuDto productSkuDto);
}
