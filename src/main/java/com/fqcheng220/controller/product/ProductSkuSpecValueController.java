package com.fqcheng220.controller.product;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.AbstractBaseRequestDelBody;
import com.fqcheng220.common.req.BaseRequestAddBody;
import com.fqcheng220.common.req.BaseRequestBody;
import com.fqcheng220.common.req.BaseRequestUpdateBody;
import com.fqcheng220.common.req.handler.RequestHandler;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.common.resp.ProductSkuAttrValueUpdateResult;
import com.fqcheng220.common.resp.ProductSkuSpecValueUpdateResult;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.model.ProductSkuSpecValue;
import com.fqcheng220.model.ProductSkuSpecValueExample;
import com.fqcheng220.service.product.sku.IProductSkuSpecValueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

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
     * 更新商品SKU规格值（加强版）
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_SPECVALUE_UPDATE_ENHANCED, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody updateEnhanced(@RequestBody BaseRequestUpdateBody<ProductSkuDto> requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SKU_SPECVALUE_UPDATE_ENHANCED, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        if(requestBody == null || requestBody.mEntity == null){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(ResponseConstants.MSG_ERROR_REQ_ARGS);
        }
        int deleteResult = 0;
        int insertResult = 0;
        int updateResult = 0;
        //查询不到则新增，查询到了则更新，为空则删除
        try {
            ProductSkuSpecValueUpdateResult result = mService.updateEnhanced(requestBody.mEntity);
            insertResult = result.mInsertResult;
            deleteResult = result.mDeleteResult;
            updateResult = result.mUpdateResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                .setmMsg(String.format(ResponseConstants.MSG_SUC_UPDATE_FORMAT, String.format("商品SKU规格值（加强版） 删除%s 更新%s 新增%s ",deleteResult,updateResult,insertResult)))
                .setmResult(Arrays.asList(requestBody.mEntity));
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
