package com.accp.spring.zsy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.Book;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.QuesOption;
import com.accp.spring.pojo.Question;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.zsy.mapper.KsyMapper;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Courses;
import com.accp.spring.zsy.pojo.Questions;

import io.lettuce.core.dynamic.annotation.Param;

@Service
public class KsyService {
	
	@Autowired
	KsyMapper ksyMapper;
	
	 List<Books> book=new  ArrayList<Books>();
	
	public List<Grade> cxgrade(){
		return this.ksyMapper.cxgrade();
	}
	
	@Transactional
	public List<Books> cxBook(int gId){
		  book=this.ksyMapper.cxBook(gId);
		  
		  for (Books books : book) {
			  int bookId=books.getBookId();
			   books.setListc(this.ksyMapper.cxCourse(bookId));
			   for (Courses course : books.getListc()) {
				   int courseId=course.getCourseId();
					 System.out.println(courseId);
					 course.setListk(this.ksyMapper.cxKnowledge(courseId));
			   }
		  }
		
		return book;
	}
	
	public Teacher dl(String teaUserName,String teaPwd) {
		return this.ksyMapper.dl(teaUserName, teaPwd);
	}
	
	@Transactional
	public int xztmwt(Question question) {
		this.ksyMapper.xztmwt(question);
		int teaId=question.getTeaId();
		Question q=this.ksyMapper.cxxzdtmid(teaId);
		return q.getQtId();
	}
	
	public int xztmjx(Analyze analyze) {
		
		return this.ksyMapper.xztmjx(analyze);
	}
	
	public int xztmxx(QuesOption quesOption) {
		return this.ksyMapper.xztmxx(quesOption);
	}
	
}
