package com.cms.web.category;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.Category;
import com.cms.bean.Params;
import com.cms.bean.User;
import com.cms.bean.UserSession;
import com.cms.mapper.category.ICategoryMapper;
import com.cms.mapper.login.IUserMapper;
import com.cms.util.MD5PwdUtil;


/**
 * 
 * CategoryCotroller<br/>
 * 创建人:李雄杰<br/>
 * 时间：2017年11月3日-上午10:17:23 <br/>
 * @version 1.0.0<br/>
 *
 */
@Controller
@RequestMapping("/admin")
public class CategoryCotroller {
	
	@RequestMapping("/list")
	public String list() {
		return "/category/list";
	}
	
	@Autowired
	private ICategoryMapper	categoryMapper;
	
	@RequestMapping("category")
	public String category(Model model,Params params) {
		//查询数据
		List<Category> category=categoryMapper.findCategory(params);
		//查询出总条数
		int count=categoryMapper.selectCount();
		//放入作用域中
		model.addAttribute("category", category);
		model.addAttribute("count", count);
		return "/category/category";
	}
	
	@RequestMapping("/aseav")
	public String seav(Model model,Params params){
		//查询数据
		List<Category> category=categoryMapper.findCategory(params);
		//放入作用域中
		model.addAttribute("category", category);
		return "/category/templates";
	}
	
	
}
