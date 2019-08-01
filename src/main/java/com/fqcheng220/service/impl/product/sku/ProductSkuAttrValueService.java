package com.fqcheng220.service.impl.product.sku;

import com.fqcheng220.common.resp.ProductSkuAttrValueUpdateResult;
import com.fqcheng220.dao.ProductSkuAttrValueMapper;
import com.fqcheng220.dto.ProductCategoryAttrDto;
import com.fqcheng220.dto.ProductSkuAttrValueSelfDto;
import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.model.ProductSkuAttrValue;
import com.fqcheng220.model.ProductSkuAttrValueExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.sku.IProductSkuAttrValueService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSkuAttrValueService extends BaseService<ProductSkuAttrValueMapper,ProductSkuAttrValue,ProductSkuAttrValueExample> implements IProductSkuAttrValueService {
    @Override
    public ProductSkuAttrValueUpdateResult updateEnhanced(ProductSkuDto productSkuDto) {
        int deleteResult = 0;
        int insertResult = 0;
        int updateResult = 0;
        //查询不到则新增，查询到了则更新，为空则删除
        if (productSkuDto != null
                && productSkuDto.mProductCategoryAttrDtoList != null) {
            for (ProductCategoryAttrDto productCategoryAttrDto : productSkuDto.mProductCategoryAttrDtoList) {
                if (productSkuDto.mProductSku != null
                        && productCategoryAttrDto != null
                        && productCategoryAttrDto.mProductAttr != null) {
                    //筛选条件 skuid和specid
                    ProductSkuAttrValueExample example = new ProductSkuAttrValueExample();
                    example.createCriteria().andTbProductSkuIdEqualTo(productSkuDto.mProductSku.getId())
                            .andTbProductAttrIdEqualTo(productCategoryAttrDto.mProductAttr.getId());
                    //为空则删除
                    if (productCategoryAttrDto.mProductAttrValue == null) {
                        deleteResult += mapper.deleteByExample(example);
                    } else {
                        List<ProductSkuAttrValue> queryList = mapper.selectByExample(example);
                        ProductSkuAttrValue productSkuAttrValue = new ProductSkuAttrValue();
                        productSkuAttrValue.setTbProductSkuId(productSkuDto.mProductSku.getId());
                        productSkuAttrValue.setTbProductAttrId(productCategoryAttrDto.mProductAttr.getId());
                        productSkuAttrValue.setTbProductAttrValueId(productCategoryAttrDto.mProductAttrValue.getId());
                        //查询到了则更新
                        if (queryList != null && queryList.size() > 0) {
                            //必须赋值id
                            productSkuAttrValue.setId(queryList.get(0).getId());
                            updateResult += mapper.updateByExample(productSkuAttrValue, example);
                        } else {
                            //查询不到则新增
                            insertResult += mapper.insert(productSkuAttrValue);
                        }
                    }
                }
            }
        }
        ProductSkuAttrValueUpdateResult result = new ProductSkuAttrValueUpdateResult();
        result.mInsertResult = insertResult;
        result.mDeleteResult = deleteResult;
        result.mUpdateResult = updateResult;
        return result;
    }

    @Override
    public List<ProductSkuAttrValueSelfDto> listEnhancedSelf() {
        return mapper.listEnhancedSelf();
    }
}
