package com.cms;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cms.core.LoginInterceptor;

/**
 * 拦截器
 * SpringMvcWebConfigurer<br/>
 * 创建人:ShenPei <br/>
 * 时间：2017年11月2日-上午10:25:15 <br/>
 * @version 1.0.0<br/>
 *
 */
@Configuration
public class SpringMvcWebConfigurer extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
//        registry.addInterceptor(new LoginInterceptor())
//        .addPathPatterns("/admin/**");
    }
}
