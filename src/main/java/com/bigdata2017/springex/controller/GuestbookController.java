package com.bigdata2017.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/* Request Mapping ( type 단독 매핑 ) */

@Controller
@RequestMapping( "/guestbook/*" )
public class GuestbookController {

	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController:list";
	}
	
	@ResponseBody
	@RequestMapping
	public String insert() {
		return "GuestbookController:insert";
	}	
}
