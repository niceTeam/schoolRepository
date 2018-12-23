package com.wisdomschool.student.mapper;

import com.wisdomschool.student.pojo.Grade;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GradeMapper {
	/**
	 * 获得Grade数据的总行数
	 * 
	 * @return
	 */
	long getGradeRowCount();

	/**
	 * 获得Grade数据集合
	 * 
	 * @return
	 */
	List<Grade> selectGrade();

	/**
	 * 获得一个Grade对象,以参数Grade对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	Grade selectGradeByObj(Grade obj);

	/**
	 * 通过Grade的id获得Grade对象
	 * 
	 * @param id
	 * @return
	 */
	Grade selectGradeById(Integer id);

	/**
	 * 插入Grade到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertGrade(Grade value);

	/**
	 * 插入Grade中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNonEmptyGrade(Grade value);

	/**
	 * 通过Grade的id删除Grade
	 * 
	 * @param id
	 * @return
	 */
	int deleteGradeById(Integer id);

	/**
	 * 通过Grade的id更新Grade中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateGradeById(Grade enti);

	/**
	 * 通过Grade的id更新Grade中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNonEmptyGradeById(Grade enti);

	/**
	 * 得到一个学生的升学过程
	 * @param stuId
	 * @return
	 */
	@Select("SELECT * FROM `grade` WHERE gid IN(SELECT Classes.`gId` FROM student,csRelation,Classes"
			+ "	WHERE csRelation.`classId`=Classes.`classId` AND csRelation.`stuId`=student.`stuId` AND student.stuId=#{stuId})")
	List<Grade> listGradeByStuId(@Param("stuId") Integer stuId);
}