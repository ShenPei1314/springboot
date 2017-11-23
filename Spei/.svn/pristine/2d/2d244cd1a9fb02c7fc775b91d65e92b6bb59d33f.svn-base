package com.cms.core;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

/**
 * 定义全局路径
 * BasePathExposer<br/>
 * 创建人:ShenPei <br/>
 * 时间：2017年11月2日-上午10:26:00 <br/>
 * @version 1.0.0<br/>
 *
 */
@Component
public class BasePathExposer implements ServletContextAware{

	private ServletContext servletContext;
	@Value("${cms.path.basepath}")
	private String basePath;
	@Value("${cms.path.imgpath}")
	private String imgPath;
	
	public void init() {
		servletContext.setAttribute("basePath", basePath);
		servletContext.setAttribute("imgPath", imgPath);
	}
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		 this.servletContext=servletContext;
	}

}
