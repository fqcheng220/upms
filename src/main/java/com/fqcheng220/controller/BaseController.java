package com.fqcheng220.controller;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.req.*;
import com.fqcheng220.common.req.handler.RequestHandler;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.fqcheng220.service.IBaseService;
import java.util.Arrays;
import java.util.List;

/**
 * @Title BaseController
 * @Description TODO
 * @Author fqcheng220
 * @Date 2019/6/1 0001 17:11
 * @Version 1.0
 */
public class BaseController {
    /**
     * 增加Model
     *
     * @param requestBody
     * @return
     */
    public static <Model, Example> BaseResponseBody add(BaseRequestAddBody<Model> requestBody,
                                                        final String urlPath,
                                                        final IBaseService<Model, Example> service,
                                                        final String sucMsg) {
        try {
            //如何直接获取path??
            RequestHandler.handle(urlPath, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = -1;
        try {
            result = service.insert(requestBody.mEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        if (result > 0) {
            return new BaseResponseBody<>()
                    .setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(sucMsg)
                    .setmResult(Arrays.asList(requestBody.mEntity));
        } else {
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 删除Model
     *
     * @param requestBody
     * @return
     */
    public static <Model, Example> BaseResponseBody del(final AbstractBaseRequestDelBody requestBody,
                                                        final String urlPath,
                                                        final IBaseService<Model, Example> service,
                                                        final Example example,
                                                        final String sucMsg) {
        try {
            //如何直接获取path??
            RequestHandler.handle(urlPath, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = -1;
        try {
            result = service.deleteByExample(example);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        if (result > 0) {
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(sucMsg);
        } else {
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 更新Model
     *
     * @param requestBody
     * @return
     */
    public static <Model, Example> BaseResponseBody update(final BaseRequestUpdateBody<Model> requestBody,
                                                           final String urlPath,
                                                           final IBaseService<Model, Example> service,
                                                           final String sucMsg) {
        try {
            //如何直接获取path??
            RequestHandler.handle(urlPath, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        int result = -1;
        try {
            result = service.updateByPrimaryKey(requestBody.mEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
        if (result > 0) {
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format(ResponseConstants.MSG_SUC_UPDATE_FORMAT,sucMsg))
                    .setmResult(Arrays.asList(requestBody.mEntity));
        } else {
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(ResponseConstants.MSG_ERROR_SQL_HANDLE);
        }
    }

    /**
     * 查询角色列表
     *
     * @return
     */
    public static <Model, Example> BaseResponseBody listAll(final BaseRequestBody requestBody,
                                                            final String urlPath,
                                                            final IBaseService<Model, Example> service,
                                                            final Example example,
                                                            final String sucMsg) {
        try {
            //如何直接获取path??
            RequestHandler.handle(urlPath, requestBody);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_REQ_VAL).setmMsg(e.getMessage());
        }
        try {
            List<Model> list = service.selectByExample(example);
            return new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_SUC)
                    .setmMsg(String.format(ResponseConstants.MSG_SUC_LIST_FORMAT,sucMsg))
                    .setmResult(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResponseBody<>().setmStatusCode(ResponseConstants.STATUS_FAIL_SQL_HANDLE).setmMsg(e.getLocalizedMessage());
        }
    }
}
