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
import com.fqcheng220.dto.ProductCategoryAttrDto;
import com.fqcheng220.dto.ProductSkuDto;
import com.fqcheng220.dto.ProductSpuImgDtoNew;
import com.fqcheng220.model.ProductSku;
import com.fqcheng220.model.ProductSkuExample;
import com.fqcheng220.service.product.sku.IProductSkuAttrValueService;
import com.fqcheng220.service.product.sku.IProductSkuService;
import com.fqcheng220.service.product.sku.IProductSkuSpecValueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductSkuController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "商品SKU";
    @Autowired
    private IProductSkuService mService;
    @Autowired
    private IProductSkuAttrValueService mIProductSkuAttrValueService;
    @Autowired
    private IProductSkuSpecValueService mIProductSkuSpecValueService;

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
     * 查询商品SKU列表(包含属性-属性值 规格-规格值)
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ENHANCED_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listEnhancedAll(@RequestBody BaseRequestBody requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SKU_ENHANCED_LIST_ALL, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
            long start = System.currentTimeMillis();
            List<ProductSkuDto> list = mService.listEnhanced();
            mLogger.info("listEnhancedAll cost time " + (System.currentTimeMillis() - start));
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT,"查询商品SKU列表(包含属性-属性值 规格-规格值)"))
                    .setmResult(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }

    /**
     * 查询商品SKU列表Comb(包含属性-属性值 规格-规格值)
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ENHANCED_COMB_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listEnhancedCombAll(@RequestBody BaseRequestBody requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SKU_ENHANCED_COMB_LIST_ALL, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
//            List<ProductSkuDto> list = new ArrayList<>();
            long start = System.currentTimeMillis();
            List<ProductSkuDto> listEnhancedByAttr = mService.listEnhancedByAttr();
            long middle = System.currentTimeMillis();
            mLogger.info("listEnhancedCombAll attr cost time " + (middle - start));
            List<ProductSkuDto> listEnhancedBySpec = mService.listEnhancedBySpec();
            mLogger.info("listEnhancedCombAll spec cost time " + (System.currentTimeMillis() - middle));
            if(listEnhancedByAttr != null){
                for(ProductSkuDto productSkuDto:listEnhancedByAttr){
                    if(listEnhancedBySpec != null){
                        for(ProductSkuDto productSkuDtoInner:listEnhancedBySpec){
                            if(productSkuDto.mProductSku != null && productSkuDto.mProductSku.getId() == productSkuDtoInner.mProductSku.getId()){
                                productSkuDto.mProductCategorySpecDtoList = productSkuDtoInner.mProductCategorySpecDtoList;
                                break;
                            }
                        }
                    }
                }
            }
            mLogger.info("listEnhancedCombAll total cost time " + (System.currentTimeMillis() - start));
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT,"查询商品SKU列表Comb(包含属性-属性值 规格-规格值)"))
                    .setmResult(listEnhancedByAttr);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }

    /**
     * 更新商品SKU列表(包含属性-属性值 规格-规格值)
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_UPDATE_ENHANCED, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody updateEnhanced(@RequestBody BaseRequestUpdateBody<ProductSkuDto> requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SKU_UPDATE_ENHANCED, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        if(requestBody == null || requestBody.mEntity == null){
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(ResponseConstants.MSG_ERROR_REQ_ARGS);
        }
        int deleteResultAttr = 0;
        int insertResultAttr = 0;
        int updateResultAttr = 0;
        int deleteResultSpec = 0;
        int insertResultSpec = 0;
        int updateResultSpec = 0;
        List<ProductSkuDto> retList = null;
        //查询不到则新增，查询到了则更新，为空则删除
        try {
            ProductSkuAttrValueUpdateResult result = mIProductSkuAttrValueService.updateEnhanced(requestBody.mEntity);
            insertResultAttr = result.mInsertResult;
            deleteResultAttr = result.mDeleteResult;
            updateResultAttr = result.mUpdateResult;

            ProductSkuSpecValueUpdateResult result1 = mIProductSkuSpecValueService.updateEnhanced(requestBody.mEntity);
            insertResultSpec = result1.mInsertResult;
            deleteResultSpec = result1.mDeleteResult;
            updateResultSpec = result1.mUpdateResult;

            if(requestBody.mEntity.mProductSku != null){
                retList = mService.listEnhancedCombAll(requestBody.mEntity.mProductSku.getId().longValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                .setmMsg(String.format(ResponseConstants.MSG_SUC_UPDATE_FORMAT, String.format("商品SKU列表(包含属性-属性值 规格-规格值) 属性值删除%s 更新%s 新增%s ，规格值删除%s 更新%s 新增%s ",
                        deleteResultAttr,updateResultAttr,insertResultAttr,
                        deleteResultSpec,updateResultSpec,insertResultSpec)))
                .setmResult(retList);
    }

    private void combineProductAttrValueList(List<ProductCategoryAttrDto> dest,List<ProductCategoryAttrDto> source) {
        if (dest != null && source != null) {
            for (ProductCategoryAttrDto productCategoryAttrDto : dest) {
                if (productCategoryAttrDto.mProductAttr != null){
                    for(ProductCategoryAttrDto productCategoryAttrDtoInnner : source){
                        if(productCategoryAttrDtoInnner.mProductAttr != null && productCategoryAttrDtoInnner.mProductAttr.getId() == productCategoryAttrDto.mProductAttr.getId()){
                            productCategoryAttrDto.mProductAttrValueList = productCategoryAttrDtoInnner.mProductAttrValueList;
                            break;
                        }
                    }
                }
            }
        }
    }

    /**
     * 查询商品SKU列表CombNew(包含属性-属性值 规格-规格值)
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ENHANCED_COMB_NEW_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listEnhancedCombNewAll(@RequestBody BaseRequestBody requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SKU_ENHANCED_COMB_NEW_LIST_ALL, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
//            List<ProductSkuDto> list = new ArrayList<>();
            long start = System.currentTimeMillis();
            List<ProductSkuDto> listEnhancedByAttr = mService.listEnhancedByAttrSimpleValue();
            List<ProductSkuDto> listEnhancedByAttr2 = mService.listEnhancedByAttrSimpleValuesList();
            if(listEnhancedByAttr != null){
                for(ProductSkuDto productSkuDto:listEnhancedByAttr){
                    if(listEnhancedByAttr2 != null){
                        for(ProductSkuDto productSkuDtoInner:listEnhancedByAttr2){
                            if(productSkuDto.mProductSku != null && productSkuDto.mProductSku.getId() == productSkuDtoInner.mProductSku.getId()){
                                combineProductAttrValueList(productSkuDto.mProductCategoryAttrDtoList,productSkuDtoInner.mProductCategoryAttrDtoList);
                                break;
                            }
                        }
                    }
                }
            }
            long middle = System.currentTimeMillis();
            mLogger.info("listEnhancedCombNewAll attr cost time " + (middle - start));
            List<ProductSkuDto> listEnhancedBySpec = mService.listEnhancedBySpec();
            mLogger.info("listEnhancedCombNewAll spec cost time " + (System.currentTimeMillis() - middle));
            if(listEnhancedByAttr != null){
                for(ProductSkuDto productSkuDto:listEnhancedByAttr){
                    if(listEnhancedBySpec != null){
                        for(ProductSkuDto productSkuDtoInner:listEnhancedBySpec){
                            if(productSkuDto.mProductSku != null && productSkuDto.mProductSku.getId() == productSkuDtoInner.mProductSku.getId()){
                                productSkuDto.mProductCategorySpecDtoList = productSkuDtoInner.mProductCategorySpecDtoList;
                                break;
                            }
                        }
                    }
                }
            }
            mLogger.info("listEnhancedCombNewAll total cost time " + (System.currentTimeMillis() - start));
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT,"查询商品SKU列表CombNew(包含属性-属性值 规格-规格值)"))
                    .setmResult(listEnhancedByAttr);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }

    /**
     * 查询商品SKU列表(包含属性-属性值)
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ENHANCED_ATTR_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listEnhancedAttrAll(@RequestBody BaseRequestBody requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SKU_ENHANCED_ATTR_LIST_ALL, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
            long start = System.currentTimeMillis();
            List<ProductSkuDto> list = mService.listEnhancedByAttr();
            mLogger.info("listEnhancedAttrAll cost time " + (System.currentTimeMillis() - start));
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT,"查询商品SKU列表(包含属性-属性值)"))
                    .setmResult(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }

    /**
     * 查询商品SKU列表(包含规格-规格值)
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_SKU_ENHANCED_SPEC_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listEnhancedSpecAll(@RequestBody BaseRequestBody requestBody) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_SKU_ENHANCED_SPEC_LIST_ALL, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
            long start = System.currentTimeMillis();
            List<ProductSkuDto> list = mService.listEnhancedBySpec();
            mLogger.info("listEnhancedSpecAll cost time " + (System.currentTimeMillis() - start));
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT,"查询商品SKU列表(包含规格-规格值)"))
                    .setmResult(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }
}
