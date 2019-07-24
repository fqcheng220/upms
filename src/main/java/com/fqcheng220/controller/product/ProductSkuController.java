package com.fqcheng220.controller.product;

import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.ProductSku;
import com.fqcheng220.model.ProductSkuExample;
import com.fqcheng220.service.product.sku.IProductSkuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductSkuController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "商品SKU";
    @Autowired
    private IProductSkuService mService;

    /**
     * 增加商品SKU
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ADD, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductSku> requestBody) {
        return BaseController.add(requestBody, UrlPathConstants.PRODUCT_SKU_ADD, mService, RESP_MSG);
    }

    /**
     * 删除商品SKU
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_DEL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Long> requestBody) {
        ProductSkuExample example = new ProductSkuExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody, UrlPathConstants.PRODUCT_SKU_DEL, mService, example, RESP_MSG);
    }

    /**
     * 更新商品SKU
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_UPDATE, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductSku> requestBody) {
        return BaseController.update(requestBody, UrlPathConstants.PRODUCT_SKU_UPDATE, mService, RESP_MSG);
    }

    /**
     * 查询商品SKU列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody) {
        ProductSkuExample example = new ProductSkuExample();
        return BaseController.listAll(requestBody, UrlPathConstants.PRODUCT_SKU_LIST_ALL, mService, example, RESP_MSG);
    }

    /**
     * 查询商品SKU列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ENHANCED_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listEnhancedAll(@RequestBody BaseRequestBody requestBody) {
        ProductSkuExample example = new ProductSkuExample();
        return BaseController.listAll(requestBody, UrlPathConstants.PRODUCT_SKU_ENHANCED_LIST_ALL, mService, example, RESP_MSG);
    }
}
