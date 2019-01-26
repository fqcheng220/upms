package com.fqcheng220.common.shiro;

import com.fqcheng220.common.utils.FilterUtils;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class CustomRolesAuthorizationFilter extends RolesAuthorizationFilter {
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        FilterUtils.outAuthrFail(request,response);
        return false;
    }
}
