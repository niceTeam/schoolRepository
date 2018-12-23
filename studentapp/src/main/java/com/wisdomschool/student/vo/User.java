package com.wisdomschool.student.vo;

import java.io.Serializable;

import com.wisdomschool.student.pojo.Student;
import com.wisdomschool.student.pojo.Teacher;

/**
 * 用户类 - （学生和员工的组成类）
 * 
 * @author axiang
 *
 *         2018年12月21日 下午2:47:47
 */
public class User implements Serializable {
	private static final long serialVersionUID = 8208580927660206255L;

	private int uId;
	private String userNum; // 通行证
	private String uName;
	private String upwd;
	private String headImg;
	private int uType;// 1:学生 2：班主任 3：教员 4：管理者 5：宿管
	private String uPhone;
	private String uSex;
	private String uBirth;
	private String uStart; // 入职时间/入学时间
	private String uEnd; // 离职时间/离校时间
	private String uIdNumber;
	private String uAddress;
	private String cId;

	@Override
	public String toString() {
		return "User [uId=" + uId + ", userNum=" + userNum + ", uName=" + uName + ", upwd=" + upwd + ", headImg="
				+ headImg + ", uType=" + uType + ", uPhone=" + uPhone + ", uSex=" + uSex + ", uBirth=" + uBirth
				+ ", uStart=" + uStart + ", uEnd=" + uEnd + ", uIdNumber=" + uIdNumber + ", uAddress=" + uAddress
				+ ", cId=" + cId + "]";
	}

	public User() {
	}

	public User(Student s) {
		this.uId = s.getStuId();
		this.userNum = s.getStuUserName(); // 通行证
		this.uName = s.getStuName();
		this.upwd = s.getStuPwd();
		this.headImg = s.getStuImage();
		this.uType = 1;// 1:学生 2：班主任 3：教员 4：管理者 5：宿管
		this.uPhone = s.getStuPhone();
		this.uSex = s.getStuSex();
		this.uBirth = s.getStuBirth();
		this.uStart = s.getStuStartTime(); // 入职时间/入学时间
		this.uEnd = s.getStuEndTime(); // 离职时间/离校时间
		this.uIdNumber = s.getStuIdNumber();
		this.uAddress = s.getStyAddress();
		this.cId = s.getcId();
	}

	public User(Teacher t) {
		this.uId = t.getTeaId();
		this.userNum = t.getTeaUserName(); // 通行证
		this.uName = t.getTeaName();
		this.upwd = t.getTeaPwd();
		this.headImg = t.getTeaImage();
		this.uType = 1;// 1:学生 2：班主任 3：教员 4：管理者 5：宿管
		this.uPhone = t.getTeaPhone();
		this.uSex = t.getTeaSex();
		this.uBirth = t.getTeaBirth();
		this.uStart = t.getTeaStartTime(); // 入职时间/入学时间
		this.uEnd = t.getTeaEndTime(); // 离职时间/离校时间
		this.uIdNumber = t.getTeaIdNumber();
		this.uAddress = t.getTeaAddress();
		this.cId = t.getcId();
	}

	public User(int uId, String userNum, String uName, String upwd, String headImg, int uType, String uPhone,
			String uSex, String uBirth, String uStart, String uEnd, String uIdNumber, String uAddress, String cId) {
		this.uId = uId;
		this.userNum = userNum;
		this.uName = uName;
		this.upwd = upwd;
		this.headImg = headImg;
		this.uType = uType;
		this.uPhone = uPhone;
		this.uSex = uSex;
		this.uBirth = uBirth;
		this.uStart = uStart;
		this.uEnd = uEnd;
		this.uIdNumber = uIdNumber;
		this.uAddress = uAddress;
		this.cId = cId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public int getuType() {
		return uType;
	}

	public void setuType(int uType) {
		this.uType = uType;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

	public String getuSex() {
		return uSex;
	}

	public void setuSex(String uSex) {
		this.uSex = uSex;
	}

	public String getuBirth() {
		return uBirth;
	}

	public void setuBirth(String uBirth) {
		this.uBirth = uBirth;
	}

	public String getuStart() {
		return uStart;
	}

	public void setuStart(String uStart) {
		this.uStart = uStart;
	}

	public String getuEnd() {
		return uEnd;
	}

	public void setuEnd(String uEnd) {
		this.uEnd = uEnd;
	}

	public String getuIdNumber() {
		return uIdNumber;
	}

	public void setuIdNumber(String uIdNumber) {
		this.uIdNumber = uIdNumber;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

}
