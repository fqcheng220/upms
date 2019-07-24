package com.fqcheng220.service.impl.product.sku;

import com.fqcheng220.dao.ProductSkuMapper;
import com.fqcheng220.model.ProductSku;
import com.fqcheng220.model.ProductSkuExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.sku.IProductSkuService;
import org.springframework.stereotype.Service;

@Service
public class ProductSkuService extends BaseService<ProductSkuMapper,ProductSku,ProductSkuExample> implements IProductSkuService {
}
