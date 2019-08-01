package com.fqcheng220.service.impl.product.sku;

import com.fqcheng220.dao.ProductSkuMapper;
import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.dto.ProductSkuSelfDto;
import com.fqcheng220.model.ProductSku;
import com.fqcheng220.model.ProductSkuExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.sku.IProductSkuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSkuService extends BaseService<ProductSkuMapper,ProductSku,ProductSkuExample> implements IProductSkuService {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());

    @Override
    public List<ProductSkuSelfDto> listEnhancedSelf() {
        return mapper.listEnhancedSelf();
    }

    @Override
    public List<ProductSkuDto> listEnhanced() {
        return mapper.listEnhanced();
    }

    @Override
    public List<ProductSkuDto> listEnhancedCombAll() {
        long start = System.currentTimeMillis();
        List<ProductSkuDto> listEnhancedByAttr = listEnhancedByAttr();
        long middle = System.currentTimeMillis();
        mLogger.info("listEnhancedCombAll attr cost time " + (middle - start));
        List<ProductSkuDto> listEnhancedBySpec = listEnhancedBySpec();
        mLogger.info("listEnhancedCombAll spec cost time " + (System.currentTimeMillis() - middle));
        if(listEnhancedByAttr != null){
            for(ProductSkuDto productSkuDto:listEnhancedByAttr){
                if(listEnhancedBySpec != null){
                    for(ProductSkuDto productSkuDtoInner:listEnhancedBySpec){
                        if(productSkuDto.mProductSku != null && productSkuDto.mProductSku.getId() == productSkuDtoInner.mProductSku.getId()){
                            productSkuDto.mProductCategorySpecDtoList = productSkuDtoInner.mProductCategorySpecDtoList;
                            break;
                        }
                    }
                }
            }
        }
        mLogger.info("listEnhancedCombAll total cost time " + (System.currentTimeMillis() - start));
        return listEnhancedByAttr;
    }

    @Override
    public List<ProductSkuDto> listEnhancedCombAll(long skuId) {
        long start = System.currentTimeMillis();
        List<ProductSkuDto> listEnhancedByAttr = listEnhancedByAttr(skuId);
        long middle = System.currentTimeMillis();
        mLogger.info("listEnhancedCombAll attr cost time " + (middle - start));
        List<ProductSkuDto> listEnhancedBySpec = listEnhancedBySpec(skuId);
        mLogger.info("listEnhancedCombAll spec cost time " + (System.currentTimeMillis() - middle));
        if(listEnhancedByAttr != null){
            for(ProductSkuDto productSkuDto:listEnhancedByAttr){
                if(listEnhancedBySpec != null){
                    for(ProductSkuDto productSkuDtoInner:listEnhancedBySpec){
                        if(productSkuDto.mProductSku != null && productSkuDto.mProductSku.getId() == productSkuDtoInner.mProductSku.getId()){
                            productSkuDto.mProductCategorySpecDtoList = productSkuDtoInner.mProductCategorySpecDtoList;
                            break;
                        }
                    }
                }
            }
        }
        mLogger.info("listEnhancedCombAll total cost time " + (System.currentTimeMillis() - start));
        return listEnhancedByAttr;
    }

    @Override
    public List<ProductSkuDto> listEnhancedBySpec() {
        return mapper.listEnhancedBySpec();
    }

    @Override
    public List<ProductSkuDto> listEnhancedByAttr() {
        return mapper.listEnhancedByAttr();
    }

    @Override
    public List<ProductSkuDto> listEnhancedBySpec(long skuId) {
        return mapper.listEnhancedBySpec(skuId);
    }

    @Override
    public List<ProductSkuDto> listEnhancedByAttr(long skuId) {
        return mapper.listEnhancedByAttr(skuId);
    }

    @Override
    public List<ProductSkuDto> listEnhancedByAttrSimpleValuesList() {
        return mapper.listEnhancedByAttrSimpleValuesList();
    }

    @Override
    public List<ProductSkuDto> listEnhancedByAttrSimpleValue() {
        return mapper.listEnhancedByAttrSimpleValue();
    }
}
