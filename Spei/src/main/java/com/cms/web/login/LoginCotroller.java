package com.cms.web.login;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.User;
import com.cms.bean.UserSession;
import com.cms.mapper.login.IUserMapper;
import com.cms.util.MD5PwdUtil;
import com.cms.util.cookie.CookieConstantTable;
import com.cms.util.cookie.CookieUtils;
import com.cms.util.cookie.EncryptionUtil;


/**
 * 登录
 * LoginCotroller<br/>
 * 创建人:ShenPei <br/>
 * 时间：2017年11月2日-上午10:24:45 <br/>
 * @version 1.0.0<br/>
 *
 */
@Controller
@RequestMapping("/login")
public class LoginCotroller {
	
	@Autowired
	private IUserMapper userMapper;
	
	@RequestMapping
	public String login() {
		return "login";
	}
	
	/**
	 *登录判断<br/>
	 * 方法名：index<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月2日-上午10:24:34 <br/>
	 * 手机:1564545646464<br/>
	 * @param session
	 * @param account
	 * @param password
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping(value="/userlogin",method=RequestMethod.POST)
	public String index(HttpSession session,@RequestParam("account") String account,
			@RequestParam("password") String password,
			@RequestParam("checkvalue") Integer checkvalue,HttpServletResponse response) {
		String pass=MD5PwdUtil.md5Base64(password);
		User user=userMapper.findUsers(account,pass);
		if (user!=null) {
			session.setAttribute(UserSession.SESSION_USER, user);
			if(checkvalue!=null && checkvalue.equals(1)) {
				 // 有效期
	            Calendar calendar = Calendar.getInstance();
	            calendar.add(Calendar.MONTH, CookieConstantTable.COOKIE_MAX_AGE); // 7天
	            long ctime = new Date().getTime();
	            String cookieValue=EncryptionUtil.base64Encode(account+"#"+ctime);
				CookieUtils.addCookie(response,CookieConstantTable.RememberMe , cookieValue, null);
				
			}
			return "success";
		}else {
			return "fail";
		}
	}
	/**
	 * 注销用户
	 * 方法名：logout<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月14日-上午8:47:22 <br/>
	 * 手机:1564545646464<br/>
	 * @param session
	 * @param model
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session,HttpServletRequest request,
			HttpServletResponse response) {
		//清空Cookie
		CookieUtils.delCookie(request, response, CookieConstantTable.RememberMe);
		session.invalidate();// 清除所有的会话
		return "redirect:/login";
	}
}
