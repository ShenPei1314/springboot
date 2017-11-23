package com.cms.mapper.content;

import java.util.HashMap;
import java.util.List;

import com.cms.bean.Category;
import com.cms.bean.Content;
import com.cms.bean.Params;


public interface IContentMapper {
	
	/**
	 * 查询内容
	 * 方法名：findCategory<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月6日-下午2:45:40 <br/>
	 * 手机:1564545646464<br/>
	 * @return List<Category><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<HashMap<String, Object>> findContent(Params params);
	public int countContent(Params params);
	
	/**
	 * 添加内容
	 * 方法名：savaCategory<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月6日-下午2:52:06 <br/>
	 * 手机:1564545646464<br/>
	 * @param category void<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public void addContent(Content content);
	
	/**
	 * 根据ID查询
	 * 方法名：delCategory<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月6日-下午2:52:54 <br/>
	 * 手机:1564545646464<br/>
	 * @param id
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public Content ByIdContent(Integer id);
	/**
	 * 修改内容
	 * 方法名：updateContent<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月6日-下午5:01:24 <br/>
	 * 手机:1564545646464<br/>
	 * @param content
	 * @return int<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public int updateContent(Content content);
	/**
	 * 统计报表
	 * 方法名：charts<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月10日-下午5:40:08 <br/>
	 * 手机:1564545646464<br/>
	 * @return List<HashMap<String,Object>><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public List<HashMap<String, Object>> charts();
}
