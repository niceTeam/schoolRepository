package com.wisdomschool.student.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wisdomschool.student.pojo.Leaveprocess;
import com.wisdomschool.student.pojo.Student;

public interface StudentMapper {

	@Select("select * from `student`")
	List<Student> listAll();

	@Select("SELECT * FROM schoolmanage.`student` WHERE `student`.stuId = #{stuId}")
	Student getStudentByStuId(@Param("stuId") Integer stuId);

	@Select("SELECT * FROM schoolmanage.`student` WHERE `student`.stuUserName = #{stuUserName}")
	Student getStudentByStuUserName(@Param("stuUserName") String stuUserName);

	@Insert("INSERT INTO `schoolmanage`.`student` VALUES(#{stuId},#{stuName},#{stuUserName},#{stuPwd},#{classId},#{stuSex},#{stuBirth},#{stuImage},#{stuPhone},#{stuType},#{stuStartTime},#{stuEndTime},#{stuIdNumber},#{styAddress},#{cId})")
	@Options(useGeneratedKeys = true, keyColumn = "stuId", keyProperty = "stuId")
	int save(Student student);

	@Update("UPDATE `schoolmanage`.`student` SET `stuName` = #{stuName},`stuUserName` = #{stuUserName},`stuPwd` = #{stuPwd},`classId` = #{classId},`stuSex` = #{stuSex},`stuBirth` = #{stuBirth},`stuImage` = #{stuImage},`stuPhone` = #{stuPhone},`stuType` = #{stuType},`stuStartTime` = #{stuStartTime},`stuEndTime` = #{stuEndTime},`stuIdNumber` = #{stuIdNumber},`styAddress` = #{styAddress},`cId` = #{cId} WHERE `stuId` = #{stuId}")
	int update(Student student);

	/*
	 * 请假
	 */
	@Insert("INSERT INTO `leaveprocess`(`domeId`,`stuId`,`leaTime`,`leaReson`,`leaStarTime`,`leaEndTime`,`leaStates`,`isDorm`)VALUES(#{domeId},#{stuId],#{leaTime],#{leaReson},#{leaStarTime},#{leaEndTime},#{leaStates},#{isDorm})")
	int leave(Leaveprocess leaveprocess);
		
	/**
	 * 批量新增学生
	 * 
	 * @param students
	 * @return
	 */
	int saveList(@Param("students") List<Student> students);

	/**
	 * 学生使用手机号和面进行登陆
	 * 
	 * @param phone
	 * @param pwd
	 * @return
	 */
	@Select("select * from student where stuPhone=#{phone} and stuPwd=#{pwd} limit 0,1")
	Student getUserToLogin(@Param("phone") String phone, @Param("pwd") String pwd);

	@Select("select * from student where stuId != #{stuId} and cId = #{cId} limit 0,1")
	Student getStudentByCid(@Param("cId") String cId, @Param("stuId") int stuId);
}
