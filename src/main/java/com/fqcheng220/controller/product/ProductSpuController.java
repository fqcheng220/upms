package com.fqcheng220.controller.product;

import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.*;
import com.fqcheng220.service.product.spu.IProductSpuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductSpuController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "货品SPU";
    @Autowired
    private IProductSpuService mService;

    /**
     * 增加货品SPU
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_ADD, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductSpu> requestBody) {
        return BaseController.add(requestBody, UrlPathConstants.PRODUCT_SPU_ADD, mService, RESP_MSG);
    }

    /**
     * 删除货品SPU
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_DEL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Long> requestBody) {
        ProductSpuExample example = new ProductSpuExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody, UrlPathConstants.PRODUCT_SPU_DEL, mService, example, RESP_MSG);
    }

    /**
     * 更新货品SPU
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_UPDATE, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductSpu> requestBody) {
        return BaseController.update(requestBody, UrlPathConstants.PRODUCT_SPU_UPDATE, mService, RESP_MSG);
    }

    /**
     * 查询货品SPU列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody) {
        ProductSpuExample example = new ProductSpuExample();
        return BaseController.listAll(requestBody, UrlPathConstants.PRODUCT_SPU_LIST_ALL, mService, example, RESP_MSG);
    }
}
