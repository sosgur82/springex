package com.bigdata2017.springex.controller;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	/* request mapping (method 단독 매핑) */
	
	@ResponseBody
	@RequestMapping( "/main" )
	public String main() {
		return sendMessage("main");
	}
	
	@ResponseBody
	@RequestMapping( "/main2/a/b/c" )
	public String main2(
		HttpServletRequest request, 
		HttpServletResponse response,
		HttpSession session,
		Writer out) {
		return sendMessage( "main2" );
	}
	
	private String sendMessage( String message) {
		return "MainController:" + message; 
	}
}
