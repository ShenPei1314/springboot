package com.cms.web.accredit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.bean.Params;
import com.cms.mapper.accredit.IAccreditMapper;
import com.cms.util.MD5PwdUtil;


/*
 * 注册界面*
 */
@Controller
@RequestMapping("/admin")
public class AccreditController {
	
      @Autowired
	private IAccreditMapper accreditMapper;
      
    @RequestMapping("/accredit")
  	public String accredit(){
  	    
  	    	return "accredit/accredit";
      }
  
      
    @ResponseBody
	@RequestMapping("/accreditlist")
	public String accreditlist(Params params){
    	params.setPassword(MD5PwdUtil.md5Base64(params.getPassword()));
	    int a =accreditMapper.insertUser(params);
	    if(a>0){
	    	return "success";
	    }else{
	    	return "fail";
	    }
	}
}
