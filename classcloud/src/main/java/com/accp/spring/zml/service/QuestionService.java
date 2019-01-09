package com.accp.spring.zml.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.Book;
import com.accp.spring.pojo.Course;
import com.accp.spring.pojo.Error;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.MyCollection;
import com.accp.spring.pojo.Student;
import com.accp.spring.zml.mapper.QuestionMapper;
import com.accp.spring.zml.vo.BookVo;
import com.accp.spring.zml.vo.CourseVo;

import io.lettuce.core.dynamic.annotation.Param;

@Service
public class QuestionService {

	@Autowired
	private QuestionMapper questionMapper;
	
	List<BookVo> book=new  ArrayList<BookVo>();
	
	public Student selectStu(String stuUserName,String stuPwd) {
		return this.questionMapper.selectStu(stuUserName, stuPwd);
	}
	
	
	public List<Grade> selectAllGrade(){
		return this.questionMapper.selectAllGrade();
	}
	
	
	/*public List<Book> selectAllBook(){
		return this.questionMapper.selectAllBook();
	}*/
	
	@Transactional
	public List<BookVo> selectAllBook(String gId){
		  book=this.questionMapper.selectAllBook(gId);
		  
		  for (BookVo books : book) {
			  int bookId=books.getBookId();
			   books.setCourseList(this.questionMapper.selectByBookId(bookId));
			   for (CourseVo course : books.getCourseList()) {
				   int courseId=course.getCourseId();
					 System.out.println(courseId);
					 course.setKnowList(this.questionMapper.selectByCourseId(courseId));
			   }
		  }
		
		return book;
	}
	/*
	public List<CourseVo> selectByBookId(int bookId){
		return this.questionMapper.selectByBookId(bookId);
	}*/
	
	
	/**
	 * 查询知识点
	 * @param courseId
	 * @return
	 */
	public List<Knowledge> selectByCourseId(int courseId){
		return this.questionMapper.selectByCourseId(courseId);
	}
	
	
	/**
	 * 查询错题
	 * @param stuId
	 * @return
	 */
	public List<Error> selectAllError(int stuId){
		return this.questionMapper.selectAllError(stuId);
	}
	
	/**
	 * 查询收藏
	 * @param stuId
	 * @return
	 */
	public List<MyCollection> selectAllCollection(int stuId){
		return this.questionMapper.selectAllCollection(stuId);
	}
	
	/**
	 * 查询错题个数
	 * @param stuId
	 * @return
	 */
	public int selectErrorCount(int stuId){
		return this.questionMapper.selectErrorCount(stuId);
	}
	
	
	/**
	 *查询收藏个数
	 * @param stuId
	 * @return
	 */
	public int selectCollectionCount(int stuId) {
		return this.questionMapper.selectCollectionCount(stuId);
	}
	
	

	
}
