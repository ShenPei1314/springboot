package com.cms.mapper.exam;

import com.cms.bean.User;

/**
 * 用户授权模块(注册)
 * 
 * @author XY
 *
 */
public interface IExamMapper {

	/**
	 * 注册
	 * 方法名：insertUser<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月20日-下午3:44:10 <br/>
	 * 手机:1564545646464<br/>
	 * @param params
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public void addUser(User user);
	/**
	 * 根据手机号查询
	 * 方法名：accountUser<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月20日-下午4:36:04 <br/>
	 * 手机:1564545646464<br/>
	 * @param user void<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int accountUser(User user);

}
