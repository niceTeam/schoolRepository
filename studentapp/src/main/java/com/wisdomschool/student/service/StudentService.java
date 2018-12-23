package com.wisdomschool.student.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wisdomschool.student.mapper.GradeMapper;
import com.wisdomschool.student.mapper.GroupChatMapper;
import com.wisdomschool.student.mapper.StudentMapper;
import com.wisdomschool.student.mapper.TeacherMapper;
import com.wisdomschool.student.pojo.Grade;
import com.wisdomschool.student.pojo.GroupChat;
import com.wisdomschool.student.pojo.Student;
import com.wisdomschool.student.pojo.Teacher;
import com.wisdomschool.student.vo.GradeVo;
import com.wisdomschool.student.vo.TeamItemVo;

@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private GradeMapper gradeMapper;
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private GroupChatMapper chatMapper;

	public List<Student> listAll() {
		return this.studentMapper.listAll();
	}

	public Student getStudentByStuId(Integer stuId) {
		return this.studentMapper.getStudentByStuId(stuId);
	}

	public Student getStudentByStuUserName(String stuUserName) {
		return this.studentMapper.getStudentByStuUserName(stuUserName);
	}

	public int save(Student student) {
		return this.studentMapper.save(student);
	}

	public int update(Student student) {
		return this.studentMapper.update(student);
	}

	public int saveList(List<Student> students) {
		return this.studentMapper.saveList(students);
	}

	// 学生进行登陆，并且修改cid
	@Transactional
	public Student getStudentToLogin(Student stu) {
		if (stu == null)
			return null;
		Student student = this.studentMapper.getStudentToLogin(stu.getStuPhone(), stu.getStuPwd());
		if (student != null) {
			student.setcId(stu.getcId());
			this.studentMapper.update(student);
			Student student2 = this.studentMapper.getStudentByCid(student.getcId(), student.getStuId());
			if (student2 != null) {
				student2.setcId(null);
				this.studentMapper.update(student2);
			}
		}
		return student;
	}

	// 修改密码
	public Student updatePwd(Integer stuId, String oldPwd, String nowPwd) {
		Student student = this.studentMapper.getStudentByStuIdAndPwd(stuId, oldPwd);
		if (student != null) {
			student.setStuPwd(nowPwd);
			this.studentMapper.update(student);
		}
		return student;
	}

	// 修改头像
	public Student uploadHeadImg(Integer stuId, String headImg) {
		Student student = this.studentMapper.getStudentByStuId(stuId);
		if (student != null) {
			student.setStuImage(headImg);
			this.studentMapper.updateImg(student);
		}
		return student;
	}

	public List<GradeVo> getTeam(Integer stuId) {
		// 得到团队数
		// 该团队下的聊天成员（老师和教员、班级群）
		if (stuId == null || stuId <= 0)
			return null;
		Student stu = this.studentMapper.getStudentByStuId(stuId);
		if (stu == null)
			return null;
		List<Grade> grades = this.gradeMapper.listGradeByStuId(stuId);
		List<GradeVo> gradeVos = new ArrayList<>();
		for (Grade g : grades) {
			List<TeamItemVo> itemVos = new ArrayList<>();
			for (Teacher t : teacherMapper.listTeacherByGradeId(g.getgId())) {
				itemVos.add(new TeamItemVo(t.getTeaId(), 2, t.getTeaName(), t.getTeaImage(), null));
			}
			for (GroupChat gr : chatMapper.listGroupChatbyStuIdAndGradeId(stuId, g.getgId())) {
				itemVos.add(new TeamItemVo(gr.getGroupId(), 1, gr.getGroupName(), "", null));
			}
			gradeVos.add(new GradeVo(g, itemVos));
		}
		return gradeVos;
	}
}
