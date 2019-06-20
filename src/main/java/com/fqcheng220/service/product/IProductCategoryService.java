package com.fqcheng220.service.product;

import com.fqcheng220.model.ProductCategory;
import com.fqcheng220.model.ProductCategoryExample;
import com.fqcheng220.service.IBaseService;

import java.util.List;

public interface IProductCategoryService extends IBaseService<ProductCategory,ProductCategoryExample> {
    List<ProductCategory> getCategoryList(long parentId);
}
