package com.cms.core;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cms.bean.User;
import com.cms.bean.UserSession;
import com.cms.mapper.login.IUserMapper;
import com.cms.util.cookie.CookieConstantTable;
import com.cms.util.cookie.CookieUtils;
import com.cms.util.cookie.DateUtil;
import com.cms.util.cookie.EncryptionUtil;


/**
 * 拦截器
 * LoginInterceptor<br/>
 * 创建人:ShenPei <br/>
 * 时间：2017年11月2日-上午10:26:18 <br/>
 * @version 1.0.0<br/>
 *
 */
public class LoginInterceptor implements HandlerInterceptor{
	
	@Autowired
	public IUserMapper userMapper;

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
		if(user==null){
			//获取Cookie
			Cookie cookieName=CookieUtils.getCookie(request, CookieConstantTable.RememberMe);
			if(cookieName!=null) {
				//解密
				String cookieValue=EncryptionUtil.base64Decode(cookieName.getValue());
				//根据#划分
				String[] cValues = cookieValue.split("#");
				if(cValues.length==2) {
					 String account = cValues[0]; // 获取用户名
					//获取上次登录的时间
					 Long time=Long.parseLong(cValues[1]);
					 Date date1=new Date(time);
					//获取当前时间
					 Date date=new Date();
					//如果当前时间还在7天之内
					 if(DateUtil.differentDays(date1, date)<=7) {
						  WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		               	  IUserMapper userMapper=context.getBean(IUserMapper.class);
		               	  User cookieuser = userMapper.getLoginByAccount(account);
		               	  request.getSession().setAttribute(UserSession.SESSION_USER, cookieuser);
		               	  response.sendRedirect("redirct:/admin/list");
					 }else {
						 //删除cookie重新去登录
		           	  	 CookieUtils.delCookie(response, cookieName);
		           	  	 response.sendRedirect(request.getContextPath()+"/login");
					 }
				}
				return true;
			}else {
				response.sendRedirect(request.getContextPath()+"/login");
				return false;
			}
		}else {
			return true;
		}
	}
}
