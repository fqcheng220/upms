package com.fqcheng220.common.shiro.jwt;

import com.fqcheng220.common.utils.FilterUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JwtShiroFilter extends AuthenticatingFilter {

    //解决shiro跨域问题https://blog.csdn.net/weixin_39973810/article/details/85786693
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpRequest = WebUtils.toHttp(request);
        HttpServletResponse httpResponse = WebUtils.toHttp(response);
        httpResponse.setHeader("Access-control-Allow-Origin", httpRequest.getHeader("Origin"));
        httpResponse.setHeader("Access-Control-Allow-Methods", httpRequest.getMethod());
        httpResponse.setHeader("Access-Control-Allow-Headers", httpRequest.getHeader("Access-Control-Request-Headers"));
        if (httpRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            httpResponse.setStatus(HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }

    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        String token = getAuthzHeader(servletRequest);
        if(!StringUtils.isEmpty(token)){
            return new JwtToken(token);
        }
        return null;
    }

    /**
     * 如果这个Filter在之前isAccessAllowed（）方法中返回false,则会进入这个方法。暂时直接返回错误的response
     */
    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        FilterUtils.outAuthcFail(servletRequest,servletResponse);
        return false;
    }

    /**
     * 父类会在请求进入拦截器后调用该方法，返回true则继续，返回false则会调用onAccessDenied()。这里在不通过时，还调用了isPermissive()方法
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        if(isLoginRequest(request,response)){
            return true;
        }else{
            try {
                return isPermissive(mappedValue) || executeLogin(request,response);
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    protected String getAuthzHeader(ServletRequest request) {
        HttpServletRequest httpRequest = WebUtils.toHttp(request);
        String header = httpRequest.getHeader("x-auth-token");
        return header;
    }

    /**
     * 此处可以做token过期时间延续操作
     * @param token
     * @param subject
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, javax.servlet.ServletRequest request, javax.servlet.ServletResponse response) throws Exception {
        return super.onLoginSuccess(token, subject, request, response);
    }

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, javax.servlet.ServletRequest request, javax.servlet.ServletResponse response) {
        return super.onLoginFailure(token, e, request, response);
    }

    protected void fillCorsHeader(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,HEAD");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
    }
}
