package com.fqcheng220.dao;

import com.fqcheng220.dto.ProductSpuImgDto;
import com.fqcheng220.model.ProductSpuImg;
import com.fqcheng220.model.ProductSpuImgExample;

import java.util.List;

public interface ProductSpuImgMapper extends IBaseMapper<ProductSpuImg, ProductSpuImgExample> {
    List<ProductSpuImgDto> listBySpu();
}