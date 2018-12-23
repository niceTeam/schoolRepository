package com.wisdomschool.student.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wisdomschool.student.pojo.Teacher;

public interface TeacherMapper {
	// 更具 Id 得到一个老师对象
	@Select("select * from teacher where teaId = #{treId}")
	Teacher getTeacherById(@Param("treId") int treId);

	// 更具 通行证号 得到一个老师对象
	@Select("select * from teacher where teaUserName = #{uNum}")
	Teacher getTeacherByUserNum(@Param("uNum") String uNum);

	// 更具年级Id得到该班级的老师
	@Select("SELECT * FROM teacher WHERE teacher.`teaId` IN(SELECT ctRelation.`teaId` FROM ctRelation,Classes"
			+ "	WHERE ctRelation.`classId`=Classes.`classId` AND Classes.`gId`=#{gradeId})")
	List<Teacher> listTeacherByGradeId(@Param("gradeId") Integer gradeId);
}
