package com.bigdata2017.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello(
		@RequestParam( value="n", required=true, defaultValue="" ) 
		String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject( "name", name );
		mav.setViewName( "/WEB-INF/views/hello.jsp" );
		return mav;
	}
	
	@RequestMapping("/hello2")
	public String hello2(
		@RequestParam( value="n", required=true, defaultValue="" ) 
		String name, Model model) {
		model.addAttribute( "name", name );
		return "/WEB-INF/views/hello.jsp" ;
	}	
}
