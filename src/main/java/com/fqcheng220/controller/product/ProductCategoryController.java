package com.fqcheng220.controller.product;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.constants.UrlPathConstants;
import com.fqcheng220.common.req.*;
import com.fqcheng220.common.req.handler.RequestHandler;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.controller.BaseController;
import com.fqcheng220.dto.ProductCategoryAttrDto;
import com.fqcheng220.dto.ProductCategorySpecDto;
import com.fqcheng220.model.*;
import com.fqcheng220.service.IBaseService;
import com.fqcheng220.service.product.IProductAttrService;
import com.fqcheng220.service.product.IProductCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductCategoryController {
    private final Logger mLogger = LoggerFactory.getLogger(getClass());
    private static final String RESP_MSG = "分类";
    @Autowired
    private IProductCategoryService mService;
    @Autowired
    private IBaseService<ProductAttr, ProductAttrExample> mProductAttrService;
    @Autowired
    private IBaseService<ProductAttrValue, ProductAttrValueExample> mProductAttrValueService;
    @Autowired
    private IBaseService<ProductSpec, ProductSpecExample> mProductSpecService;
    @Autowired
    private IBaseService<ProductSpecValue, ProductSpecValueExample> mProductSpecValueService;

    /**
     * 增加分类
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_CATEGORY_ADD, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody add(@RequestBody BaseRequestAddBody<ProductCategory> requestBody) {
        return BaseController.add(requestBody, UrlPathConstants.PRODUCT_CATEGORY_ADD, mService, RESP_MSG);
    }

    /**
     * 删除分类
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_CATEGORY_DEL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody del(@RequestBody AbstractBaseRequestDelBody<Long> requestBody) {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andIdIn(requestBody.mEntityList);
        return BaseController.del(requestBody, UrlPathConstants.PRODUCT_CATEGORY_DEL, mService, example, RESP_MSG);
    }

    /**
     * 更新分类
     *
     * @param requestBody
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_CATEGORY_UPDATE, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody update(@RequestBody BaseRequestUpdateBody<ProductCategory> requestBody) {
        return BaseController.update(requestBody, UrlPathConstants.PRODUCT_CATEGORY_UPDATE, mService, RESP_MSG);
    }

    /**
     * 查询分类列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_CATEGORY_LIST_ALL, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAll(@RequestBody BaseRequestBody requestBody) {
        ProductCategoryExample example = new ProductCategoryExample();
        return BaseController.listAll(requestBody, UrlPathConstants.PRODUCT_CATEGORY_LIST_ALL, mService, example, RESP_MSG);
    }

    /**
     * 查询分类列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_CATEGORY_LIST_CHILD, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listChild(@RequestBody BaseRequestBody requestBody, @PathVariable("parentId") Long parentId) {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        return BaseController.listAll(requestBody, UrlPathConstants.PRODUCT_CATEGORY_LIST_CHILD, mService, example, RESP_MSG);
    }

    /**
     * 查询分类属性列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_CATEGORY_LIST_ATTR, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listAttr(@RequestBody BaseRequestBody requestBody, @PathVariable("categoryId") Long categoryId) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_CATEGORY_LIST_ATTR, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
            ProductAttrExample productAttrExample = new ProductAttrExample();
            productAttrExample.createCriteria().andTbProductCategoryIdEqualTo(categoryId);
            List<ProductAttr> productAttrList = mProductAttrService.selectByExample(productAttrExample);
            if (productAttrList == null || productAttrList.isEmpty()) {
                return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                        .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT, "分类属性列表"))
                        .setmResult(null);
            } else {
                List<ProductCategoryAttrDto> list = new ArrayList<>();
                for (ProductAttr productAttr : productAttrList) {
                    ProductAttrValueExample productAttrValueExample = new ProductAttrValueExample();
                    productAttrValueExample.createCriteria().andTbProductAttrIdEqualTo(productAttr.getId());
                    List<ProductAttrValue> productAttrValueList = mProductAttrValueService.selectByExample(productAttrValueExample);
                    if (productAttrValueList == null || productAttrValueList.isEmpty()) {
                    } else {
                    }
                    ProductCategoryAttrDto dto = new ProductCategoryAttrDto();
                    dto.mProductAttr = productAttr;
                    dto.mProductAttrValueList = productAttrValueList;
                    list.add(dto);
                }
                return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                        .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT, "分类属性列表"))
                        .setmResult(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }

    /**
     * 查询分类规格列表
     *
     * @return
     */
    @RequestMapping(value = UrlPathConstants.PRODUCT_CATEGORY_LIST_SPEC, method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public BaseResponseBody listSpec(@RequestBody BaseRequestBody requestBody, @PathVariable("categoryId") Long categoryId) {
        try {
            //如何直接获取path??
            RequestHandler.handle(UrlPathConstants.PRODUCT_CATEGORY_LIST_SPEC, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
            ProductSpecExample productSpecExample = new ProductSpecExample();
            productSpecExample.createCriteria().andTbProductCategoryIdEqualTo(categoryId);
            List<ProductSpec> productSpecList = mProductSpecService.selectByExample(productSpecExample);
            if (productSpecList == null || productSpecList.isEmpty()) {
                return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                        .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT, "分类规格列表"))
                        .setmResult(null);
            } else {
                List<ProductCategorySpecDto> list = new ArrayList<>();
                for (ProductSpec productSpec : productSpecList) {
                    ProductSpecValueExample productSpecValueExample = new ProductSpecValueExample();
                    productSpecValueExample.createCriteria().andTbProductSpecIdEqualTo(productSpec.getId());
                    List<ProductSpecValue> productSpecValueList = mProductSpecValueService.selectByExample(productSpecValueExample);
                    if (productSpecValueList == null || productSpecValueList.isEmpty()) {
                    } else {
                    }
                    ProductCategorySpecDto dto = new ProductCategorySpecDto();
                    dto.mProductSpec = productSpec;
                    dto.mProductSpecValueList = productSpecValueList;
                    list.add(dto);
                }
                return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                        .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT, "分类规格列表"))
                        .setmResult(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }
}
