package com.fqcheng220.service.impl.product.spu;

import com.fqcheng220.dao.ProductSpuMapper;
import com.fqcheng220.dto.ProductSpuImgDtoNew;
import com.fqcheng220.model.ProductSpu;
import com.fqcheng220.model.ProductSpuExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.spu.IProductSpuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSpuService extends BaseService<ProductSpuMapper,ProductSpu,ProductSpuExample> implements IProductSpuService {
    @Override
    public List<ProductSpuImgDtoNew> listEnhanced() {
        return mapper.listEnhanced();
    }
}
