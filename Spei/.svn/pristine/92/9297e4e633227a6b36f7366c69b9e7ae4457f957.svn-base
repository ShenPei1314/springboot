package com.cms.web.content;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.Content;
import com.cms.bean.Params;
import com.cms.mapper.content.IContentMapper;

@Controller
@RequestMapping("/admin/content")
public class ContentCotroller {

	@Autowired
	public IContentMapper contentMapper;
	
	//加载页面
	@RequestMapping("/list")
	public String Content(Model model,Params params) {
		List<Content> contents=contentMapper.findContent(params);
		int count=contentMapper.countContent();
		model.addAttribute("contents", contents);
		model.addAttribute("count", count);
		return "content/contentlist";
	}
	/**
	 * 查询内容
	 * (这里用一句话描述这个方法的作用)<br/>
	 * 方法名：contentList<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月6日-下午3:13:13 <br/>
	 * 手机:1564545646464<br/>
	 * @param model
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/page")
	public String Listcontent(Model model,Params params) {
		List<Content> contents=contentMapper.findContent(params);
		model.addAttribute("contents", contents);
		return "content/template"; 
	}
	/**
	 * 根据id查询
	 * (这里用一句话描述这个方法的作用)<br/>
	 * 方法名：updatecontent<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月7日-下午3:36:18 <br/>
	 * 手机:1564545646464<br/>
	 * @param model
	 * @param params
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@RequestMapping("/idupdate/{id}")
	public String Idcontent(Model model,@PathVariable("id") Integer id) {
		Content content=contentMapper.ByIdContent(id);
		model.addAttribute("Idcontent", content);
		return "content/update"; 
	}
	/**
	 * 修改内容
	 * (这里用一句话描述这个方法的作用)<br/>
	 * 方法名：updatecontent<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月7日-下午4:53:37 <br/>
	 * 手机:1564545646464<br/>
	 * @param model
	 * @param id
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping("/update")
	public String updatecontent(Content content) {
		int count=contentMapper.updateContent(content);
		if(count!=1) {
			return "fail";
		}else {
			return "success"; 
		}
	}
	/**
	 * 添加内容
	 * (这里用一句话描述这个方法的作用)<br/>
	 * 方法名：addcontent<br/>
	 * 创建人：ShenPei <br/>
	 * 时间：2017年11月8日-上午9:08:49 <br/>
	 * 手机:1564545646464<br/>
	 * @param content
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping("/add")
	public String addcontent(Content content) {
		content.setUserId(1);
		contentMapper.addContent(content);
		if(content.getId()!=null) {
			return "fail";
		}else {
			return "success"; 
		}
	}
	@RequestMapping("/addhtml")
	public String addHtml() {
		return "content/add";
	}
}
