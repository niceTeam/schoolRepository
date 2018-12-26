package com.accp.spring.zsy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring.pojo.Grade;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.service.KsyService;

@Controller
@RequestMapping("/ksy")
public class KsyController {
	
	@Autowired
	KsyService ksyService;
	
	@GetMapping("/zy")
	public String zy() {
		return "classcloud/sy.html";
	}
	
	@ResponseBody
	@RequestMapping(value="/cxgrade",method=RequestMethod.GET)
	public  List<Grade> cxgrade(){
		return this.ksyService.cxgrade();
	}
	
	@ResponseBody
	@RequestMapping(value="/cxBook/{gId}",method=RequestMethod.GET)
	public List<Books> cxBook(@PathVariable int gId){
		return this.ksyService.cxBook(gId);
	}

}
