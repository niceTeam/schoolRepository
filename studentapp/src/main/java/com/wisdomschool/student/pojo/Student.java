package com.wisdomschool.student.pojo;

/**
 * 
 * @author axiang
 *
 *         2018年12月17日 上午11:25:57
 */
public class Student {
	private Integer stuId;
	private String stuName; // 学员姓名
	private String stuUserName; // 学员通行证
	private String stuPwd; // 密码
	private Integer classId; // 班级id
	private String stuSex; // 性别
	private String stuBirth; // 出生日期
	private String stuImage; // 头像(App默认头像)
	private String stuPhone; // 电话号码
	private Integer stuType; // 职位 人事经理1,其他0
	private String stuStartTime; // 入学时间
	private String stuEndTime; // 离校时间
	private String stuIdNumber; // 省份证号码
	private String styAddress; // 家庭住址
	private String cId; // 通知栏接收消息推送唯一Id 用来接收消息推送

	private Classes classes;
	private Grade grade;

	public Student() {
	}

	public Student(String stuName, String stuUserName, String stuPwd, Integer classId, String stuSex, String stuBirth,
			String stuImage, String stuPhone, Integer stuType, String stuStartTime, String stuEndTime,
			String stuIdNumber, String styAddress, String cId) {
		this.stuName = stuName;
		this.stuUserName = stuUserName;
		this.stuPwd = stuPwd;
		this.classId = classId;
		this.stuSex = stuSex;
		this.stuBirth = stuBirth;
		this.stuImage = stuImage;
		this.stuPhone = stuPhone;
		this.stuType = stuType;
		this.stuStartTime = stuStartTime;
		this.stuEndTime = stuEndTime;
		this.stuIdNumber = stuIdNumber;
		this.styAddress = styAddress;
		this.cId = cId;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuUserName=" + stuUserName + ", stuPwd="
				+ stuPwd + ", classId=" + classId + ", stuSex=" + stuSex + ", stuBirth=" + stuBirth + ", stuImage="
				+ stuImage + ", stuPhone=" + stuPhone + ", stuType=" + stuType + ", stuStartTime=" + stuStartTime
				+ ", stuEndTime=" + stuEndTime + ", stuIdNumber=" + stuIdNumber + ", styAddress=" + styAddress
				+ ", cId=" + cId + "]";
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuUserName() {
		return stuUserName;
	}

	public void setStuUserName(String stuUserName) {
		this.stuUserName = stuUserName;
	}

	public String getStuPwd() {
		return stuPwd;
	}

	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuBirth() {
		return stuBirth;
	}

	public void setStuBirth(String stuBirth) {
		this.stuBirth = stuBirth;
	}

	public String getStuImage() {
		return stuImage;
	}

	public void setStuImage(String stuImage) {
		this.stuImage = stuImage;
	}

	public String getStuPhone() {
		return stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public Integer getStuType() {
		return stuType;
	}

	public void setStuType(Integer stuType) {
		this.stuType = stuType;
	}

	public String getStuStartTime() {
		return stuStartTime;
	}

	public void setStuStartTime(String stuStartTime) {
		this.stuStartTime = stuStartTime;
	}

	public String getStuEndTime() {
		return stuEndTime;
	}

	public void setStuEndTime(String stuEndTime) {
		this.stuEndTime = stuEndTime;
	}

	public String getStuIdNumber() {
		return stuIdNumber;
	}

	public void setStuIdNumber(String stuIdNumber) {
		this.stuIdNumber = stuIdNumber;
	}

	public String getStyAddress() {
		return styAddress;
	}

	public void setStyAddress(String styAddress) {
		this.styAddress = styAddress;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}
