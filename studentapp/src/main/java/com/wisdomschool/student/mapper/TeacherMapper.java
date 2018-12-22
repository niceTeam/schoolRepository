package com.wisdomschool.student.mapper;

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
}
