package com.fqcheng220.service.impl.product.spu;

import com.fqcheng220.dao.ProductSpuImgMapper;
import com.fqcheng220.dto.ProductSpuImgDto;
import com.fqcheng220.model.ProductSpuImg;
import com.fqcheng220.model.ProductSpuImgExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.spu.IProductSpuImgService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSpuImgService extends BaseService<ProductSpuImgMapper,ProductSpuImg,ProductSpuImgExample> implements IProductSpuImgService {
    @Override
    public List<ProductSpuImgDto> listBySpu() {
        return mapper.listBySpu();
    }
}
