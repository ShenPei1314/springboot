package com.cms.web.supervise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cms.bean.Params;
import com.cms.bean.User;
import com.cms.mapper.supervise.IUserAdminMapper;

@Controller
@RequestMapping("/admin/super")
public class UserAdminConteoller {
	@Autowired
	private IUserAdminMapper useradminmapper;

	/**
	 * 
	 * (查询所有的用户逻辑处理)<br/>
	 * 方法名：findUser<br/>
	 * 创建人：AywenLin <br/>
	 * 时间：2017年11月3日-上午10:38:12 <br/>
	 * 手机:17742597905<br/>
	 * 
	 * @return String<br/>
	 * @exception <br/>
	 * @since 1.0.0<br/>
	 */
	@RequestMapping("cmuser")
	public ModelAndView findUser(ModelAndView modelAndView) {
		int count = useradminmapper.countSelect();
		modelAndView.addObject("count", count);
		modelAndView.setViewName("supervise/useradmin");
		return modelAndView;
	}

	/**
	 * 
	 * (查询所有用户模板的跳转逻辑)<br/>
	 * 方法名：template<br/>
	 * 创建人：AywenLin <br/>
	 * 时间：2017年11月8日-上午10:54:32 <br/>
	 * 手机:17742597905<br/>
	 * 
	 * @param modelAndView
	 * @param params
	 * @return ModelAndView<br/>
	 * @exception <br/>
	 * @since 1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping("template")
	public ModelAndView template(ModelAndView modelAndView, Params params) {
		List<User> users = useradminmapper.getUsers(params);
		modelAndView.addObject("users", users);
		modelAndView.setViewName("supervise/template");
		return modelAndView;
	}
	
    
	/**
	 * 
	 * (修改用户状态：激活未激活)<br/>
	 * 方法名：update<br/>
	 * 创建人：AywenLin <br/>
	 * 时间：2017年11月8日-上午11:01:43 <br/>
	 * 手机:17742597905<br/>
	 * @param user
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	@ResponseBody
	@RequestMapping("update")
	public String update(User user) {
		int a=useradminmapper.updateActive(user);
		if (a>0) {
			return"success";
		}else{
			return"fail";
		}
	}

}
