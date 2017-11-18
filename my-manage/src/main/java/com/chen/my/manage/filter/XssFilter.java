package com.chen.my.manage.filter;

/**
 * 防止xss攻击
 *
 */

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class XssFilter implements Filter
{

    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException
    {
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("Pragma", "No-cache");
        res.setHeader("Cache-Control", "no-cache");

        chain.doFilter(new XssHttpServletRequestWraper((HttpServletRequest) request), res);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException
    {
        // TODO Auto-generated method stub

    }

}