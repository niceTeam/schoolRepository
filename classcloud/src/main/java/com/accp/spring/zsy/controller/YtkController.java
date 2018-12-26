package com.accp.spring.zsy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ytk")
public class YtkController {
	
	@GetMapping("/zy")
	public String zy() {
		return "classcloud/xssy.html";
	}

}
