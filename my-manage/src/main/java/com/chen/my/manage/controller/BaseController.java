package com.chen.my.manage.controller;

import com.chen.my.manage.interceptor.AuthUserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Resource
    protected HttpServletRequest request;
    
    @Resource
    protected HttpServletResponse response;

    @Resource
    protected HttpSession session;

    protected String getRemoteIP() {
        String ip = request.getHeader("x-forwarded-for"); //XFF头，它代表客户端，也就是HTTP的请求端真实的IP
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP"); //代理客户端IP
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip != null && ip.length() > 0) {
            String[] ipArray = ip.split(",");
            if (ipArray != null && ipArray.length > 1) {
                return ipArray[0];
            }
            return ip;
        }

        return "未知IP";
    }

    protected String getBaseUrl() {
        return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/" + request.getContextPath() + "/";
    }
    
    protected AuthUserInfo getUserInfo(){
    	return (AuthUserInfo) session.getAttribute("AuthUserInfo");
    }
}
