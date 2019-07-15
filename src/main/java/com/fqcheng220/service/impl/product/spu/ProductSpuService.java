package com.fqcheng220.service.impl.product.spu;

import com.fqcheng220.dao.ProductSpuMapper;
import com.fqcheng220.model.ProductSpu;
import com.fqcheng220.model.ProductSpuExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.spu.IProductSpuService;
import org.springframework.stereotype.Service;

@Service
public class ProductSpuService extends BaseService<ProductSpuMapper,ProductSpu,ProductSpuExample> implements IProductSpuService {
}
