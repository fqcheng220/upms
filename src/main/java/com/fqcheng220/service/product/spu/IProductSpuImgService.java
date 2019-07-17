package com.fqcheng220.service.product.spu;

import com.fqcheng220.dto.ProductSpuImgDto;
import com.fqcheng220.model.ProductSpuImg;
import com.fqcheng220.model.ProductSpuImgExample;
import com.fqcheng220.service.IBaseService;

import java.util.List;

public interface IProductSpuImgService extends IBaseService<ProductSpuImg,ProductSpuImgExample> {
    List<ProductSpuImgDto> listBySpu();
}
