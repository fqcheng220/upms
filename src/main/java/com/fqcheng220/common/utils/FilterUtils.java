package com.fqcheng220.common.utils;

import com.fqcheng220.common.constants.ResponseConstants;
import com.fqcheng220.common.resp.BaseResponseBody;
import com.google.gson.Gson;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FilterUtils {

    public static void out(ServletRequest servletRequest, ServletResponse servletResponse,BaseResponseBody baseResponseBody){
        if(baseResponseBody != null){
            PrintWriter printWriter = null;
            try {
                servletResponse.setCharacterEncoding("UTF-8");
                servletResponse.setContentType("application/json");
                printWriter = servletResponse.getWriter();
                String body = new Gson().toJson(baseResponseBody);
                printWriter.append(body);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(printWriter != null){
                    printWriter.flush();
                    printWriter.close();
                }
            }
        }
    }

    public static void outAuthrFail(ServletRequest servletRequest, ServletResponse servletResponse){
        BaseResponseBody baseResponseBody = new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_FAIL_AUTHR_FAIL)
                .setmMsg(ResponseConstants.MSG_ERROR_AUTHR);
        out(servletRequest,servletResponse,baseResponseBody);
    }

    public static void outAuthcFail(ServletRequest servletRequest, ServletResponse servletResponse){
        BaseResponseBody baseResponseBody = new BaseResponseBody().setmStatusCode(ResponseConstants.STATUS_FAIL_AUTHC_FAIL)
                .setmMsg(ResponseConstants.MSG_ERROR_AUTHC);
        out(servletRequest,servletResponse,baseResponseBody);
    }
}
