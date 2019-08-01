package com.fqcheng220.controller.product;

import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.ProductSpec;
import com.fqcheng220.model.ProductSpecExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.fqcheng220.common.constants.UrlPathConstants.*;


@RestController
public class ProductSpecController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "规格";
    @Autowired
    private IBaseService<ProductSpec,ProductSpecExample> mService;

    /**
     * 增加规格
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_SPEC_ADD,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductSpec> requestBody){
        return BaseController.add(requestBody,PRODUCT_SPEC_ADD,mService,RESP_MSG);
    }

    /**
     * 删除规格
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_SPEC_DEL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Integer> requestBody){
        ProductSpecExample example = new ProductSpecExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody,PRODUCT_SPEC_DEL,mService,example,RESP_MSG);
    }

    /**
     * 更新规格
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_SPEC_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductSpec> requestBody){
        return BaseController.update(requestBody,PRODUCT_SPEC_UPDATE,mService,RESP_MSG);
    }

    /**
     * 查询规格列表
     * @return
     */
    @RequestMapping(value = PRODUCT_SPEC_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody list(@RequestBody BaseRequestBody requestBody){
        ProductSpecExample example = new ProductSpecExample();
        return BaseController.listAll(requestBody, PRODUCT_SPEC_LIST,mService,example,RESP_MSG);
    }

    /**
     * 查询规格列表
     * @return
     */
    @RequestMapping(value = PRODUCT_SPEC_LIST_ALL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody){
        ProductSpecExample example = new ProductSpecExample();
        return BaseController.listAll(requestBody, PRODUCT_SPEC_LIST_ALL,mService,example,RESP_MSG);
    }
}
