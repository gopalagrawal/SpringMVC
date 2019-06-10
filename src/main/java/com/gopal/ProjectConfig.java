//New: This file is in lieu of the dispatcher-servlet.xml.  
//You can define the list of components (package paths) to scan for Controillers. 

package com.gopal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.gopal"})
public class ProjectConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver(); 
		
		vr.setPrefix("/WEB-INF/"); 	//From WebApp, add relative path to our "view" files. 
		vr.setSuffix(".jsp");		//all our view files end in .jsp
		
		return vr;
	}
}
