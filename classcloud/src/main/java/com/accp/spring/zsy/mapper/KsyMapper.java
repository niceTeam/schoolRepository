package com.accp.spring.zsy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Courses;

import io.lettuce.core.dynamic.annotation.Param;

public interface KsyMapper {
	
	@Select("Select * from Grade")
	List<Grade> cxgrade(); 
	
	@Select("Select * from Book where gId=#{gId}")
	List<Books> cxBook(@Param("gId")int gId);
	
	@Select("Select * from Course where bookId=#{bookId}")
	List<Courses> cxCourse(@Param("bookId")int bookId);
	
	@Select("Select * from Knowledge where courseId=#{courseId}")
	List<Knowledge> cxKnowledge(@Param("courseId")int courseId);

}
