package com.fqcheng220.service.impl.product.sku;

import com.fqcheng220.dao.ProductSkuAttrValueMapper;
import com.fqcheng220.model.ProductSkuAttrValue;
import com.fqcheng220.model.ProductSkuAttrValueExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.sku.IProductSkuAttrValueService;
import org.springframework.stereotype.Service;

@Service
public class ProductSkuAttrValueService extends BaseService<ProductSkuAttrValueMapper,ProductSkuAttrValue,ProductSkuAttrValueExample> implements IProductSkuAttrValueService {
}
