package com.gopal;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//The list of project configuration classes that define the controllers. 
		return new Class[] {ProjectConfig.class};  
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};  //All urls mapped here. 
	}

}
