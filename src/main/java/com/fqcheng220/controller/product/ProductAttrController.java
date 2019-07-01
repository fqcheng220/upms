package com.fqcheng220.controller.product;

import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.ProductAttr;
import com.fqcheng220.model.ProductAttrExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductAttrController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "属性";
    @Autowired
    private IBaseService<ProductAttr,ProductAttrExample> mService;

    /**
     * 增加属性
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_ATTR_ADD,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductAttr> requestBody){
        return BaseController.add(requestBody,UrlPathConstants.PRODUCT_ATTR_ADD,mService,RESP_MSG);
    }

    /**
     * 删除属性
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_ATTR_DEL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Integer> requestBody){
        ProductAttrExample example = new ProductAttrExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody,UrlPathConstants.PRODUCT_ATTR_DEL,mService,example,RESP_MSG);
    }

    /**
     * 更新属性
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_ATTR_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductAttr> requestBody){
        return BaseController.update(requestBody,UrlPathConstants.PRODUCT_ATTR_UPDATE,mService,RESP_MSG);
    }

    /**
     * 查询属性列表
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_ATTR_LIST_ALL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody,@PathVariable("categoryId") Long categoryId){
        ProductAttrExample example = new ProductAttrExample();
        example.createCriteria().andTbProductCategoryIdEqualTo(categoryId);
        return BaseController.listAll(requestBody,UrlPathConstants.PRODUCT_ATTR_LIST_ALL,mService,example,RESP_MSG);
    }
}
