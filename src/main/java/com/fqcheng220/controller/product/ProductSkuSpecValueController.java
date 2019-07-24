package com.fqcheng220.controller.product;

import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.ProductSkuSpecValue;
import com.fqcheng220.model.ProductSkuSpecValueExample;
import com.fqcheng220.service.product.sku.IProductSkuSpecValueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductSkuSpecValueController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "商品SKU规格值";
    @Autowired
    private IProductSkuSpecValueService mService;

    /**
     * 增加商品SKU规格值
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_SPECVALUE_ADD, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductSkuSpecValue> requestBody) {
        return BaseController.add(requestBody, UrlPathConstants.PRODUCT_SKU_SPECVALUE_ADD, mService, RESP_MSG);
    }

    /**
     * 删除商品SKU规格值
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_SPECVALUE_DEL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Integer> requestBody) {
        ProductSkuSpecValueExample example = new ProductSkuSpecValueExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody, UrlPathConstants.PRODUCT_SKU_SPECVALUE_DEL, mService, example, RESP_MSG);
    }

    /**
     * 更新商品SKU规格值
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_SPECVALUE_UPDATE, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductSkuSpecValue> requestBody) {
        return BaseController.update(requestBody, UrlPathConstants.PRODUCT_SKU_SPECVALUE_UPDATE, mService, RESP_MSG);
    }

    /**
     * 查询商品SKU规格值列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_SPECVALUE_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody) {
        ProductSkuSpecValueExample example = new ProductSkuSpecValueExample();
        return BaseController.listAll(requestBody, UrlPathConstants.PRODUCT_SKU_SPECVALUE_LIST_ALL, mService, example, RESP_MSG);
    }
}
