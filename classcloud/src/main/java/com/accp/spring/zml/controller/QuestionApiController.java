package com.accp.spring.zml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.pojo.Book;
import com.accp.spring.pojo.Error;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.MyCollection;
import com.accp.spring.pojo.Student;
import com.accp.spring.zml.service.QuestionService;
import com.accp.spring.zml.vo.BookVo;
import com.accp.spring.zsy.pojo.Questions;
import com.accp.spring.zsy.service.YtkService;

@CrossOrigin
@RestController
@RequestMapping(value="/question")
public class QuestionApiController {

	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private YtkService ytkService;
	
	
	/**
	 * 登录
	 * @param stuUserName
	 * @param stuPwd
	 * @return
	 */
	@RequestMapping(value="/selectStu/{stuUserName}/{stuPwd}",method = RequestMethod.GET)
	public Student selectStu(@PathVariable String stuUserName,@PathVariable String stuPwd) {
		Student stu = this.questionService.selectStu(stuUserName, stuPwd);
		if(stu!=null) {
			return this.questionService.selectStu(stuUserName, stuPwd);
		}else {
			return null;
		}
	}
	
	
	@RequestMapping(value="/selectAllGrade",method = RequestMethod.GET)
	public List<Grade> selectAllGrade(){
		return this.questionService.selectAllGrade();
	}
	
	
	@RequestMapping(value="/selectAllBook/{gId}",method = RequestMethod.GET)
	public List<BookVo> selectAllBook(@PathVariable String gId){
		return this.questionService.selectAllBook(gId);
	}
	
	/*
	 * 查询知识点
	 */
	@RequestMapping(value="/selectByCorseId/{courseId}")
	public List<Knowledge> selectByCourseId(@PathVariable int courseId){
		return this.questionService.selectByCourseId(courseId);
	}
	
	
	@RequestMapping(value="/cxzsd/{courseId}",method=RequestMethod.GET)
	public List<Knowledge> cxzsd(@PathVariable int courseId){
		//查询章节的知识点id
		return this.ytkService.cxzsd(courseId);
	}
	
	@RequestMapping(value="/randomQuestion/{zsdid}/{sum}/{xid}",method = RequestMethod.GET)
	public List<Questions> randomQuestion(@PathVariable String zsdid,@PathVariable int sum,@PathVariable int xid){
		//随机查询10道题目
		return this.ytkService.sjcxtm(zsdid,sum,xid);
	}
	
	/**
	 * 查询错题
	 * @param stuId
	 * @return
	 */
	@RequestMapping(value="/selectAllError/{stuId}")
	public List<Error> selectAllError(@PathVariable int stuId){
		return this.questionService.selectAllError(stuId);
	}
	
	/**
	 * 查询收藏
	 * @param stuId
	 * @return
	 */
	@RequestMapping(value="selectAllCollection/{stuId}")
	public List<MyCollection> selectAllCollection(@PathVariable int stuId){
		return this.questionService.selectAllCollection(stuId);
	}
	
	
	
}
