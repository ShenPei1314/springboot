package com.pei.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pei.bean.User;
import com.pei.mapper.IUserMapper;

@Controller
public class indexController {
	
	@Autowired
	public IUserMapper userMapper;

	@RequestMapping("index")
	public String index(Model model) {
		List<User> users=userMapper.findUsers();
		System.out.println(users);
		model.addAttribute("users", users);
		return "index";
	}
}
