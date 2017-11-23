package com.cms.web.exam;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.User;
import com.cms.mapper.content.IContentMapper;
import com.cms.mapper.exam.IExamMapper;
import com.cms.util.MD5PwdUtil;

@Controller
@RequestMapping("/admin/exam")
public class ExamCotroller {

	@Autowired
	public IContentMapper contentMapper;
	@Autowired
	public IExamMapper examMapper;
	
	@RequestMapping("/{pathname}")
	public String path(@PathVariable("pathname")String pathname){
		return "exam/"+pathname;
	}
	
	//统计报表
	@ResponseBody
	@RequestMapping("/stas")
	public List<HashMap<String, Object>> charts(){
		return contentMapper.charts();
	}
	//注册
	@ResponseBody
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(User user){
		String pass=user.getPassword();
		user.setPassword(MD5PwdUtil.md5Base64(pass));
		examMapper.addUser(user);
		if(user.getId()!=null) {
			return "success";
		}else {
			return "out";
		}
	}
	//注册
	@ResponseBody
	@RequestMapping(value="/accountUser",method=RequestMethod.POST)
	public String accountUser(User user){
		int count=examMapper.accountUser(user);
		if(count>0) {
			return "success";
		}else {
			return "fail";
		}
	}
}
