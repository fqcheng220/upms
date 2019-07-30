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
import com.fqcheng220.common.resp.ProductSpuImgUpdateResult;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.dto.ProductSpuImgDto;
import com.fqcheng220.dto.ProductSpuImgDtoNew;
import com.fqcheng220.model.ProductSpu;
import com.fqcheng220.model.ProductSpuExample;
import com.fqcheng220.model.ProductSpuImg;
import com.fqcheng220.model.ProductSpuImgExample;
import com.fqcheng220.service.product.IProductCategoryService;
import com.fqcheng220.service.product.spu.IProductSpuImgService;
import com.fqcheng220.service.product.spu.IProductSpuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductSpuImgController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "货品SPU 图片";
    @Autowired
    private IProductSpuImgService mService;
    @Autowired
    private IProductSpuService mIProductSpuService;
    @Autowired
    private IProductCategoryService mIProductCategoryService;

    /**
     * 增加货品SPU 图片
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_IMG_ADD, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductSpuImg> requestBody) {
        return BaseController.add(requestBody, UrlPathConstants.PRODUCT_SPU_IMG_ADD, mService, RESP_MSG);
    }

    /**
     * 删除货品SPU 图片
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_IMG_DEL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Integer> requestBody) {
        ProductSpuImgExample example = new ProductSpuImgExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody, UrlPathConstants.PRODUCT_SPU_IMG_DEL, mService, example, RESP_MSG);
    }

    /**
     * 更新货品SPU 图片
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_IMG_UPDATE, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductSpuImg> requestBody) {
        return BaseController.update(requestBody, UrlPathConstants.PRODUCT_SPU_IMG_UPDATE, mService, RESP_MSG);
    }

    /**
     * 查询货品SPU 图片列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_IMG_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody) {
        ProductSpuImgExample example = new ProductSpuImgExample();
        return BaseController.listAll(requestBody, UrlPathConstants.PRODUCT_SPU_IMG_LIST_ALL, mService, example, RESP_MSG);
    }

    /**
     * 查询货品SPU 图片列表(根据spuid)
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_IMG_LIST_BY_SPU, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listBySpu(@RequestBody BaseRequestBody requestBody, @PathVariable("spuId") Integer spuId) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SPU_IMG_LIST_BY_SPU, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
            List<ProductSpuImgDto> list = mService.listBySpu();
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT,"查询货品SPU 图片列表(根据spuid)"))
                    .setmResult(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }

    /**
     * 更新货品SPU 图片（图片列表）
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_IMG_UPDATE_ENHANCED, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody updateEnhanced(@RequestBody BaseRequestUpdateBody<ProductSpuImgDtoNew> requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SPU_IMG_UPDATE_ENHANCED, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        if (requestBody == null || requestBody.mEntity == null) {
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(ResponseConstants.MSG_ERROR_REQ_ARGS);
        }
        int deleteResult = 0;
        int insertResult = 0;
        //粗暴的删除 再新增
        try {
            ProductSpuImgUpdateResult result = mService.updateEnhanced(requestBody.mEntity);
            deleteResult = result.mDeleteResult;
            insertResult = result.mInsertResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                .setmMsg(String.format(ResponseConstants.MSG_SUC_UPDATE_FORMAT, String.format("货品SPU 图片（图片列表） 删除%s 新增%s ", deleteResult, insertResult)))
                .setmResult(Arrays.asList(requestBody.mEntity));
    }

    /**
     * 删除货品SPU 图片（图片列表）
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SPU_IMG_DEL_ENHANCED, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody delEnhanced(@RequestBody AbstractBaseRequestDelBody<Long> requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SPU_IMG_DEL_ENHANCED, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int deleteResult = -1;
        try {
            ProductSpuImgExample example = new ProductSpuImgExample();
            example.createCriteria().andTbProductSpuIdIn(requestBody.mEntityList);
            deleteResult = mService.deleteByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        if (deleteResult > 0) {
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format("货品SPU 图片（图片列表） 删除%s ",deleteResult));
        } else {
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }
}
