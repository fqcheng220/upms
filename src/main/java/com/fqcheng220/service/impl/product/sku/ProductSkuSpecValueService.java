package com.fqcheng220.service.impl.product.sku;

import com.fqcheng220.dao.ProductSkuSpecValueMapper;
import com.fqcheng220.model.ProductSkuSpecValue;
import com.fqcheng220.model.ProductSkuSpecValueExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.sku.IProductSkuSpecValueService;
import org.springframework.stereotype.Service;

@Service
public class ProductSkuSpecValueService extends BaseService<ProductSkuSpecValueMapper,ProductSkuSpecValue,ProductSkuSpecValueExample> implements IProductSkuSpecValueService {
}
