package ssmtest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pei.bean.User;
import com.pei.mapper.IUserMapper;

public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			IUserMapper userMapper=(IUserMapper) context.getBean("IUserMapper");
			List<User> users=userMapper.findUsers();
			for (User user : users) {
				System.out.println(user.getUsername());
			}
	}
}
