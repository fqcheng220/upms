package com.fqcheng220.service.impl.product;

import com.fqcheng220.dao.ProductCategoryMapper;
import com.fqcheng220.model.ProductCategory;
import com.fqcheng220.model.ProductCategoryExample;
import com.fqcheng220.service.impl.BaseService;
import com.fqcheng220.service.product.IProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService extends BaseService<ProductCategoryMapper,ProductCategory,ProductCategoryExample> implements IProductCategoryService {
    @Override
    public List<ProductCategory> getCategoryList(long parentId) {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        return selectByExample(example);
    }
}
