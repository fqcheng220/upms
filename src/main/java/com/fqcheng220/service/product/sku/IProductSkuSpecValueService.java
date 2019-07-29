package com.fqcheng220.service.product.sku;

import com.fqcheng220.common.resp.ProductSkuSpecValueUpdateResult;
import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.model.ProductSkuSpecValue;
import com.fqcheng220.model.ProductSkuSpecValueExample;
import com.fqcheng220.service.IBaseService;

public interface IProductSkuSpecValueService extends IBaseService<ProductSkuSpecValue,ProductSkuSpecValueExample> {
    ProductSkuSpecValueUpdateResult updateEnhanced(ProductSkuDto productSkuDto);
}
