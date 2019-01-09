package com.accp.spring.zml.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.Error;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.MyCollection;
import com.accp.spring.pojo.Student;
import com.accp.spring.zml.vo.BookVo;
import com.accp.spring.zml.vo.CourseVo;

import io.lettuce.core.dynamic.annotation.Param;

public interface QuestionMapper {
	
	/**
	 * 查询是否存在学生 登录
	 * @param stuUserName
	 * @param stuPwd
	 * @return
	 */
	@Select("select * from student where stuUserName = #{stuUserName} and stuPwd = #{stuPwd}")
	Student selectStu(@Param("stuUserName")String stuUserName,@Param("stuPwd")String stuPwd);
	
	
	/**
	 *查询所有课程 
	 */
	@Select("select * from book where gId = #{gId}")
	List<BookVo> selectAllBook(@Param("gId")String gId);
	
	
	/**
	 * 查询当前课程下的章节
	 * @param bookId
	 * @return
	 */
	@Select("select * from course where bookId = #{bookId}")
	List<CourseVo> selectByBookId(@Param("bookId")int bookId);
	

	/**
	 * 查询章节下面的知识点
	 * @param courseId
	 * @return
	 */
	@Select("select * from knowledge where courseId = #{courseId}")
	List<Knowledge> selectByCourseId(@Param("courseId") int courseId);
	
	
	/**
	 * 查询所有年级
	 * @return
	 */
	@Select("select * from grade")
	List<Grade> selectAllGrade();
	
	
	
	
	
	
	/**
	 * 查询错题的个数
	 * @param stuId
	 * @return
	 */
	@Select("select Count(*) from error where stuId = #{stuId}")
	int selectErrorCount(@Param("stuId") int stuId);
	
	/**
	 * 查询收藏的个数
	 * @param stuId
	 * @return
	 */
	@Select("SELECT COUNT(*) FROM collection WHERE stuId = #{stuId}")
	int selectCollectionCount(@Param("stuId") int stuId);
	
	
	/**
	 * 查询该学生的错题
	 * @param stuId
	 * @return
	 */
	@Select("select * from error where stuId = #{stuId}")
	List<Error> selectAllError(@Param("stuId") int stuId);
	
	
	/**
	 * 查询该学生的收藏
	 * @param stuId
	 * @return
	 */
	@Select("select * from collection where stuId = #{stuId}")
	List<MyCollection> selectAllCollection(@Param("stuId")int stuId);
	
	
	/**
	 * 查询题目解析
	 * @param qtId
	 * @return
	 */
	@Select("SELECT * FROM `analyze` WHERE qtId = #{qtId}")
	List<Analyze> selectAllAnalyze(@Param("qtId")int qtId);
	
	/**
	 * 添加到收藏
	 * @param qtId
	 * @param stuId
	 * @return
	 */
	@Insert("insert into collection values (0,#{qtId},#{stuId},NOW())")
	int collection(@Param("qtId")int qtId,@Param("stuId")int stuId);
	
	/**
	 * 删除错题
	 * @param errorId
	 * @return
	 */
	@Delete("delete from error where errorId = #{errorId}")
	int deleteError(@Param("errorId")int errorId);
	
	/**
	 * 删除收藏
	 * @param collectId
	 * @return
	 */
	@Delete("delete from collection where collectId = #{collectId}")
	int deleteCollection(@Param("collectId")int collectId);
	
}
