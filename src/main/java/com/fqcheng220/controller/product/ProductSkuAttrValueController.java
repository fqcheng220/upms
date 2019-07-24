package com.fqcheng220.controller.product;

import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.model.ProductSkuAttrValue;
import com.fqcheng220.model.ProductSkuAttrValueExample;
import com.fqcheng220.service.product.sku.IProductSkuAttrValueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductSkuAttrValueController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "商品SKU属性值";
    @Autowired
    private IProductSkuAttrValueService mService;

    /**
     * 增加商品SKU属性值
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ATTRVALUE_ADD, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductSkuAttrValue> requestBody) {
        return BaseController.add(requestBody, UrlPathConstants.PRODUCT_SKU_ATTRVALUE_ADD, mService, RESP_MSG);
    }

    /**
     * 删除商品SKU属性值
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ATTRVALUE_DEL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Integer> requestBody) {
        ProductSkuAttrValueExample example = new ProductSkuAttrValueExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody, UrlPathConstants.PRODUCT_SKU_ATTRVALUE_DEL, mService, example, RESP_MSG);
    }

    /**
     * 更新商品SKU属性值
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ATTRVALUE_UPDATE, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductSkuAttrValue> requestBody) {
        return BaseController.update(requestBody, UrlPathConstants.PRODUCT_SKU_ATTRVALUE_UPDATE, mService, RESP_MSG);
    }

    /**
     * 查询商品SKU属性值列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ATTRVALUE_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody) {
        ProductSkuAttrValueExample example = new ProductSkuAttrValueExample();
        return BaseController.listAll(requestBody, UrlPathConstants.PRODUCT_SKU_ATTRVALUE_LIST_ALL, mService, example, RESP_MSG);
    }
}
