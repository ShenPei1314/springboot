package com.cms.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cms.bean.User;
import com.cms.bean.UserSession;


/**
 * 拦截器
 * LoginInterceptor<br/>
 * 创建人:ShenPei <br/>
 * 时间：2017年11月2日-上午10:26:18 <br/>
 * @version 1.0.0<br/>
 *
 */
public class LoginInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		User user=(User)request.getSession().getAttribute(UserSession.SESSION_USER);
		if(user!=null){
			return true;
		}else{
			response.sendRedirect(request.getContextPath()+"/login");
			return false;
		}
	}

}
