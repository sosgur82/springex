package com.bigdata2017.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/* request mapping( type + method ) */

@Controller
@RequestMapping( "/user" )
public class UserController {

	@RequestMapping( value="/join", method=RequestMethod.GET )
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping( value="/join", method=RequestMethod.POST )
	public String join(
			/*
			@RequestParam( "name" ) String name,
			@RequestParam( "email" ) String email
			*/
			@ModelAttribute UserVo userVo
			) {
		
		System.out.println( userVo );
		return "redirect:/main";
	}
	
	@ResponseBody
	@RequestMapping( value="/loginform", method=RequestMethod.GET)
	public String loginform() {
		return "UserController:loginform";
	}
	
	@ResponseBody
	@RequestMapping( value="/login", method=RequestMethod.POST)
	public String login() {
		return "UserController:login";
	}	
	
}
