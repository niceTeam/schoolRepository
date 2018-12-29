package com.accp.spring.zsy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.QuesOption;
import com.accp.spring.pojo.Question;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Courses;
import com.accp.spring.zsy.pojo.Questions;


public interface KsyMapper {
	
	//查询年级
	@Select("Select * from Grade")
	List<Grade> cxgrade(); 
	
	//查询课程
	@Select("Select * from Book where gId=#{gId}")
	List<Books> cxBook(@Param("gId")int gId);
	
	//查询章节
	@Select("Select * from Course where bookId=#{bookId}")
	List<Courses> cxCourse(@Param("bookId")int bookId);
	
	//查询知识点
	@Select("Select * from Knowledge where courseId=#{courseId}")
	List<Knowledge> cxKnowledge(@Param("courseId")int courseId);
	
	//查询账号密码是否正确
	@Select("Select * from teacher where teaUserName=#{teaUserName} and teaPwd=#{teaPwd}")
	Teacher dl(@Param("teaUserName")String teaUserName,@Param("teaPwd")String teaPwd);

	//新增题目问题
	@Insert("insert into `schoolmanage`.`question` (`QtQuest`, `knowId`, `QtSendTime`, `teaId`, `privary`, `isDel`,`idDouble`)\r\n" + 
			"	values(#{qtQuest},#{knowId}, NOW(),#{teaId}, 2, 1,#{idDouble})")
	int xztmwt(Question question);
	
	//新增题目选项
	@Insert("insert into `schoolmanage`.`quesoption` (`qtId`, `opORder`, `rightOption`, `isRight`)values(#{qtId},#{opORder},#{rightOption},#{isRight})")
	int xztmxx(QuesOption quesOption);
	
	//新增题目解析
	@Insert("insert into `schoolmanage`.`analyze` (`qtId`, `analyzeContent`, `stuId`, `analyzeTime`)values(#{qtId},#{analyzeContent},#{stuId},NOW())")
	int xztmjx(Analyze analyze);
	
	//查询题库题目
	@Select("Select q.idDouble,q.qtId,q.qtQuest,k.knowName,q.qtSendTime,t.teaName from `question` q,`Knowledge` k,`teacher` t where q.knowId=k.knowId and q.teaId=t.teaId and q.isDel=1")
	List<Questions> cxtktm();
	
	//查询新增题目的id
	@Select("SELECT * FROM `question` WHERE teaId=#{teaId} ORDER BY qtId DESC LIMIT 1")
	Question cxxzdtmid(@Param("teaId")int teaId);
}
