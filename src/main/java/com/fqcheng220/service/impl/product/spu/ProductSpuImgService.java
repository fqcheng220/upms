package com.fqcheng220.service.impl.product.spu;

import com.fqcheng220.common.resp.ProductSkuSpecValueUpdateResult;
import com.fqcheng220.common.resp.ProductSpuImgUpdateResult;
import com.fqcheng220.dao.ProductSpuImgMapper;
import com.fqcheng220.dto.ProductCategorySpecDto;
import com.fqcheng220.dto.ProductSpuImgDto;
import com.fqcheng220.dto.ProductSpuImgDtoNew;
import com.fqcheng220.model.ProductSkuSpecValue;
import com.fqcheng220.model.ProductSkuSpecValueExample;
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

    @Override
    public ProductSpuImgUpdateResult updateEnhanced(ProductSpuImgDtoNew productSpuImgDtoNew) {
        int deleteResult = 0;
        int insertResult = 0;
        if(productSpuImgDtoNew != null){
            //粗暴的删除 再新增
            ProductSpuImgExample example = new ProductSpuImgExample();
            example.createCriteria().andTbProductSpuIdEqualTo(productSpuImgDtoNew.tbProductSpuId);
            deleteResult = mapper.deleteByExample(example);
            if (productSpuImgDtoNew.mProductSpuImgList != null) {
                int index = -1;
                for (ProductSpuImg productSpuImg : productSpuImgDtoNew.mProductSpuImgList) {
                    productSpuImg.setId(0);
                    productSpuImg.setSort(++index);
                    productSpuImg.setStatue((byte) 1);
                    productSpuImg.setTbProductSpuId(productSpuImgDtoNew.tbProductSpuId);
                    insertResult += mapper.insert(productSpuImg);
                }
            }
        }
        ProductSpuImgUpdateResult result = new ProductSpuImgUpdateResult();
        result.mInsertResult = insertResult;
        result.mDeleteResult = deleteResult;
        return result;
    }
}
