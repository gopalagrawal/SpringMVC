package com.gopal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gopal.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		//unmarshall the inputs
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		
		//off-load the buisness logic to our service layer classes. . 
		AddService as = new AddService();
		int k = as.add(i, j); 
		
		//package the result into a model-view object and send to a certain view. 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayResult.jsp");
		mv.addObject("result", k);
		
		
		return mv;
		
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam("t1") int i, 
							@RequestParam("t2") int j, 
							HttpServletRequest request, HttpServletResponse response) {
		
		//@RequestParam will automatically do:  i=t1,  j=t2. 
		
		//buisness logic ... should ideally offload to a service class. 
		int k = i - j;
		
		//package the result into a model-view object and send to a certain view. 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayResult.jsp");
		mv.addObject("result", k);
		
		
		return mv;
		
	}
	
	
}
