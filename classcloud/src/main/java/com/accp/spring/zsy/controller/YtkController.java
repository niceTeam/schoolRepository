package com.accp.spring.zsy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring.pojo.Student;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.zsy.service.YtkService;

@Controller
@RequestMapping("/ytk")
public class YtkController {
	
	@Autowired
	YtkService ytkService;
	
	
}
