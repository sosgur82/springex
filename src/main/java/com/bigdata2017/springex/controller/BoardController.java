package com.bigdata2017.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/board" )
public class BoardController {

	@ResponseBody
	@RequestMapping( "/write" )
	public String write(
		/*@RequestParam( "no" ) Long no*/ 
		@RequestParam( value="no", required=true, defaultValue="0" ) Long no, 
		@RequestParam( value="name", required=true, defaultValue="" ) String name){
		
		System.out.println( "no:" + no );
		System.out.println( "name:" + name );
		return "BoardController:write";
	}
	
	@ResponseBody
	@RequestMapping( "/view/{no}" )
	public String view( @PathVariable( value="no" ) Long no) { 
		System.out.println( "no:" + no );
		return "BoardControllerview";
	}
	
}
