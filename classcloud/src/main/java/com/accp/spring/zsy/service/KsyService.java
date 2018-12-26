package com.accp.spring.zsy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.pojo.Book;
import com.accp.spring.pojo.Grade;
import com.accp.spring.zsy.mapper.KsyMapper;
import com.accp.spring.zsy.pojo.Books;

import io.lettuce.core.dynamic.annotation.Param;

@Service
public class KsyService {
	
	@Autowired
	KsyMapper ksyMapper;
	
	public List<Grade> cxgrade(){
		return this.ksyMapper.cxgrade();
	}
	
	public List<Books> cxBook(int gId){
		 List<Books> book=this.ksyMapper.cxBook(gId);
		 
		 for(int i=0;i<book.size();i++) {
			int bookId=book.get(i).getBookId();
			book.get(i).setListc(this.ksyMapper.cxCourse(bookId));
			
			for(int is=0;i<book.get(i).getListc().size();is++) {
				 int courseId=book.get(i).getListc().get(is).getCourseId();
				 book.get(i).getListc().get(is).setListk(this.ksyMapper.cxKnowledge(courseId));
			}
		 }
		
		return book;
	}
}
