package com.cms.web.login;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.User;
import com.cms.bean.UserSession;
import com.cms.mapper.login.IUserMapper;
import com.cms.util.MD5PwdUtil;


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
	 * 登录判断
	 * (这里用一句话描述这个方法的作用)<br/>
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
	@RequestMapping("/loged/{account}/{password}")
	public String index(HttpSession session,@PathVariable("account") String account,
			@PathVariable("password") String password) {
		String pass=MD5PwdUtil.md5Base64(password);
		User user=userMapper.findUsers(account,pass);
		if (user!=null) {
			session.setAttribute(UserSession.SESSION_USER, user);
			return "success";
		}else {
			return "fail";
		}
	}
}
