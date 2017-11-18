package com.chen.my.manage.interceptor;

import com.chen.my.manage.exception.BusinessException;
import com.chen.my.manage.exception.BusinessExceptionCode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * TOKEN拦截器.
 *
 * @author hejiang
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(AuthorizationInterceptor.class);

    @Autowired
    private HttpSession httpSession;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

    	String requestedWith = request.getHeader("x-requested-with");
    	
        //登录认证
        AuthUserInfo user = (AuthUserInfo) request.getSession().getAttribute("AuthUserInfo");

        user = new AuthUserInfo();
        user.setUserId(1L);
        user.setUserName("Admin");

        if (user == null) {
            // ajax请求
            if (requestedWith != null && "XMLHttpRequest".equals(requestedWith)) {
                throw new BusinessException(BusinessExceptionCode.TOKEN_VERIFY_OVERDAY);
            } else {

            	//session失效需要跳转到登录页面,记录历史地址
            	String historyUrl = request.getRequestURI();
            	if(StringUtils.isNotEmpty(request.getQueryString())){
            		historyUrl+="?"+request.getQueryString();
            	}
            	request.getSession().setAttribute("HISTORY_URL", historyUrl);

                // 普通页面请求
                String redirectUri = request.getContextPath() + "/login";
                response.sendRedirect(redirectUri);
            }

            return false;

        }else{

        	//有历史地址，则登录后直接跳转到历史地址
        	if(request.getSession().getAttribute("HISTORY_URL")!=null){
    			String historyUrl = request.getSession().getAttribute("HISTORY_URL").toString();
    			request.getSession().removeAttribute("HISTORY_URL");
    			try {
    				response.sendRedirect(historyUrl);
    			} catch (IOException e) {
    				return true;
    			}
    		}
        }
    	
        //判断菜单权限
//        checkMenuRight(request.getContextPath(),user.getMenuRight());
    	
        return true;
    }

    /**
     * 判断菜单权限
     * @param path
     * @param menuRight
     */
//	private void checkMenuRight(String path,TmcUserMenuRight menuRight) {
//		List<TmcMenu> menus = menuRight.getMenus();
//		for(TmcMenu menu:menus){
//			if(path.equals(menu.getMenuAction())){
//				//有权限
//				return;
//			}
//		}
//		throw new BusinessException(BusinessExceptionCode.AUTH_NO_RIGHT);
//	}

}

