package com.fqcheng220.service.impl.product.sku;

import com.fqcheng220.common.resp.ProductSkuSpecValueUpdateResult;
import com.fqcheng220.dao.ProductSkuSpecValueMapper;
import com.fqcheng220.dto.ProductCategorySpecDto;
import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.model.ProductSkuSpecValue;
import com.fqcheng220.model.ProductSkuSpecValueExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.sku.IProductSkuSpecValueService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSkuSpecValueService extends BaseService<ProductSkuSpecValueMapper,ProductSkuSpecValue,ProductSkuSpecValueExample> implements IProductSkuSpecValueService {
    @Override
    public ProductSkuSpecValueUpdateResult updateEnhanced(ProductSkuDto productSkuDto) {
        int deleteResult = 0;
        int insertResult = 0;
        int updateResult = 0;
        //查询不到则新增，查询到了则更新，为空则删除
        if (productSkuDto != null
                && productSkuDto.mProductCategorySpecDtoList != null) {
            for (ProductCategorySpecDto productCategoryAttrDto : productSkuDto.mProductCategorySpecDtoList) {
                if (productSkuDto.mProductSku != null
                        && productCategoryAttrDto != null
                        && productCategoryAttrDto.mProductSpec != null) {
                    //筛选条件 skuid和attrid
                    ProductSkuSpecValueExample example = new ProductSkuSpecValueExample();
                    example.createCriteria().andTbProductSkuIdEqualTo(productSkuDto.mProductSku.getId())
                            .andTbProductSpecIdEqualTo(productCategoryAttrDto.mProductSpec.getId());
                    //为空则删除
                    if (productCategoryAttrDto.mProductSpecValue == null) {
                        deleteResult += mapper.deleteByExample(example);
                    } else {
                        List<ProductSkuSpecValue> queryList = mapper.selectByExample(example);
                        ProductSkuSpecValue productSkuSpecValue = new ProductSkuSpecValue();
                        productSkuSpecValue.setTbProductSkuId(productSkuDto.mProductSku.getId());
                        productSkuSpecValue.setTbProductSpecId(productCategoryAttrDto.mProductSpec.getId());
                        productSkuSpecValue.setTbProductSpecValueId(productCategoryAttrDto.mProductSpecValue.getId());
                        //查询到了则更新
                        if (queryList != null && queryList.size() > 0) {
                            //必须赋值id
                            productSkuSpecValue.setId(queryList.get(0).getId());
                            updateResult += mapper.updateByExample(productSkuSpecValue, example);
                        } else {
                            //查询不到则新增
                            insertResult += mapper.insert(productSkuSpecValue);
                        }
                    }
                }
            }
        }
        ProductSkuSpecValueUpdateResult result = new ProductSkuSpecValueUpdateResult();
        result.mInsertResult = insertResult;
        result.mDeleteResult = deleteResult;
        result.mUpdateResult = updateResult;
        return result;
    }
}
