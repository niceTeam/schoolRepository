package com.accp.spring.zsy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.Book;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.zsy.mapper.KsyMapper;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Courses;

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
		 
		/* for(int i=0;i<book.size();i++) {
			int bookId=book.get(i).getBookId();
			book.get(i).setListc(this.ksyMapper.cxCourse(bookId));
			
			  for(int is=0;i<book.get(i).getListc().size();is++) {
				 int courseId=book.get(i).getListc().get(is).getCourseId();
				 System.out.println(courseId);
				 book.get(i).getListc().get(is).setListk(this.ksyMapper.cxKnowledge(courseId));
			  }
		 }*/
		
		return book;
	}
	
	public List<Knowledge> cxCourse(int courseId){
		
		return null;
	}
}
