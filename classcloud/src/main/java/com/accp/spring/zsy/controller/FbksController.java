package com.accp.spring.zsy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fbks")
public class FbksController {
	
	
	@GetMapping("/zy")
	public String zy() {
		
		return "classcloud/sy.html";
	}

}
