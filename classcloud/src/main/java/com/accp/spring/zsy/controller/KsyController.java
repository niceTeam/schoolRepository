package com.accp.spring.zsy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.QuesOption;
import com.accp.spring.pojo.Question;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.service.KsyService;

@Controller
@RequestMapping("/ksy")
public class KsyController {
	
	@Autowired
	KsyService ksyService;
	
	@GetMapping("/dl")
	public String dl(HttpServletRequest request,HttpSession session) {
		//进入登录页面
		return "classcloud/dl.html";
	}
	
	@ResponseBody
	@RequestMapping(value="/yz/{teaUserName}/{teaPwd}",method=RequestMethod.GET)
	public Teacher yz(@PathVariable String teaUserName,@PathVariable String teaPwd,HttpServletRequest request,HttpSession session) {
		//验证登录是否正确
		Teacher t=this.ksyService.dl(teaUserName,teaPwd);
		request.getSession().setAttribute("yhm", t.getTeaName());
		request.getSession().setAttribute("yhid", t.getTeaId());
		
		return t;
	}
	
	@GetMapping("/zy")
	public String zy(HttpServletRequest request,HttpSession session,Model model) {
		//登录成功后跳到考试云首页
		model.addAttribute("uname",request.getSession().getAttribute("yhm"));
		model.addAttribute("uid",request.getSession().getAttribute("yhid"));
		return "classcloud/sy.html";
	}
	
	@ResponseBody
	@RequestMapping(value="/cxgrade",method=RequestMethod.GET)
	public  List<Grade> cxgrade(){
		//查询所有年级
		return this.ksyService.cxgrade();
	}
	
	@ResponseBody
	@RequestMapping(value="/cxBook/{gId}",method=RequestMethod.GET)
	public List<Books> cxBook(@PathVariable int gId){
		//查询所有课程及下面的章节和知识点
		return this.ksyService.cxBook(gId);
	}
	
	@ResponseBody
	@RequestMapping(value="/xztm",method=RequestMethod.POST)
	public int xztm(String wt,String jx,int uid,int idDouble,int zsdid) {
		//新增题目和解析
		Question question=new Question();
		question.setIdDouble(idDouble);
		question.setKnowId(zsdid);
		question.setQtQuest(wt);
		question.setTeaId(uid);
		int id=this.ksyService.xztmwt(question);
		Analyze analyze=new Analyze();
		analyze.setQtId(id);
		analyze.setAnalyzeContent(jx);
		analyze.setStuId(uid);
		this.ksyService.xztmjx(analyze);
		return id;
	}
	
	@ResponseBody
	@RequestMapping(value="/xztmxx",method=RequestMethod.POST)
	public int xztmxx(@RequestBody QuesOption[] quesOption) {
		//新增题目选项
		for(QuesOption l:quesOption) {
			this.ksyService.xztmxx(l);
		}
		return 1;
	}

}
