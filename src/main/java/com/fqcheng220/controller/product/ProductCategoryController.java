package com.fqcheng220.controller.product;

import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.*;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.ProductCategory;
import com.fqcheng220.model.ProductCategoryExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductCategoryController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "分类";
    @Autowired
    private IBaseService<ProductCategory,ProductCategoryExample> mService;

    /**
     * 增加分类
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.CATEGORY_ADD,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductCategory> requestBody){
        return BaseController.add(requestBody,UrlPathConstants.CATEGORY_ADD,mService,RESP_MSG);
    }

    /**
     * 删除分类
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.CATEGORY_DEL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Long> requestBody){
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody,UrlPathConstants.CATEGORY_DEL,mService,example,RESP_MSG);
    }

    /**
     * 更新分类
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.CATEGORY_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductCategory> requestBody){
        return BaseController.update(requestBody,UrlPathConstants.CATEGORY_UPDATE,mService,RESP_MSG);
    }

    /**
     * 查询分类列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.CATEGORY_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody){
        ProductCategoryExample example = new ProductCategoryExample();
        return BaseController.listAll(requestBody,UrlPathConstants.CATEGORY_LIST,mService,example,RESP_MSG);
    }
}
