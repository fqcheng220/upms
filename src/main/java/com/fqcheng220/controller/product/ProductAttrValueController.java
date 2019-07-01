package com.fqcheng220.controller.product;

import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.ProductAttrValue;
import com.fqcheng220.model.ProductAttrValueExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.fqcheng220.common.constants.UrlPathConstants.*;

@RestController
public class ProductAttrValueController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "属性值";
    @Autowired
    private IBaseService<ProductAttrValue,ProductAttrValueExample> mService;

    /**
     * 增加属性值
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_ATTRVALUE_ADD,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductAttrValue> requestBody){
        return BaseController.add(requestBody,PRODUCT_ATTRVALUE_ADD,mService,RESP_MSG);
    }

    /**
     * 删除属性值
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_ATTRVALUE_DEL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Integer> requestBody){
        ProductAttrValueExample example = new ProductAttrValueExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody,PRODUCT_ATTRVALUE_DEL,mService,example,RESP_MSG);
    }

    /**
     * 更新属性值
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_ATTRVALUE_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductAttrValue> requestBody){
        return BaseController.update(requestBody,PRODUCT_ATTRVALUE_UPDATE,mService,RESP_MSG);
    }

    /**
     * 查询属性值列表
     * @return
     */
    @RequestMapping(value = PRODUCT_ATTRVALUE_LIST_ALL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody,@PathVariable("attrId") Integer attrId){
        ProductAttrValueExample example = new ProductAttrValueExample();
        example.createCriteria().andTbProductAttrIdEqualTo(attrId);
        return BaseController.listAll(requestBody,PRODUCT_ATTRVALUE_LIST_ALL,mService,example,RESP_MSG);
    }
}
