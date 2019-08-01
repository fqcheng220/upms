package com.fqcheng220.controller.product;

import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.ProductSpecValue;
import com.fqcheng220.model.ProductSpecValueExample;
import com.fqcheng220.service.IBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.fqcheng220.common.constants.UrlPathConstants.*;


@RestController
public class ProductSpecValueController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "规格值";
    @Autowired
    private IBaseService<ProductSpecValue,ProductSpecValueExample> mService;

    /**
     * 增加规格值
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_SPECVALUE_ADD,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductSpecValue> requestBody){
        return BaseController.add(requestBody,PRODUCT_SPECVALUE_ADD,mService,RESP_MSG);
    }

    /**
     * 删除规格值
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_SPECVALUE_DEL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Integer> requestBody){
        ProductSpecValueExample example = new ProductSpecValueExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody,PRODUCT_SPECVALUE_DEL,mService,example,RESP_MSG);
    }

    /**
     * 更新规格值
     * @param requestBody
     * @return
     */
    @RequestMapping(value = PRODUCT_SPECVALUE_UPDATE,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductSpecValue> requestBody){
        return BaseController.update(requestBody,PRODUCT_SPECVALUE_UPDATE,mService,RESP_MSG);
    }

    /**
     * 查询规格值列表
     * @return
     */
    @RequestMapping(value = PRODUCT_SPECVALUE_LIST,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody list(@RequestBody BaseRequestBody requestBody){
        ProductSpecValueExample example = new ProductSpecValueExample();
        return BaseController.listAll(requestBody, PRODUCT_SPECVALUE_LIST,mService,example,RESP_MSG);
    }

    /**
     * 查询规格值列表
     * @return
     */
    @RequestMapping(value = PRODUCT_SPECVALUE_LIST_ALL,method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody){
        ProductSpecValueExample example = new ProductSpecValueExample();
        return BaseController.listAll(requestBody, PRODUCT_SPECVALUE_LIST_ALL,mService,example,RESP_MSG);
    }
}
