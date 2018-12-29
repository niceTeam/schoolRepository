package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 学员
 * @author zml
 *
 */
@Data
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int stuId;
	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
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

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
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

	public int getStuType() {
		return stuType;
	}

	public void setStuType(int stuType) {
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

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	private String stuName;
	private String stuUserName;
	private String stuPwd;
	private int classId;
	private String stuSex;
	private String stuBirth;
	private String stuImage;
	private String stuPhone;
	private int stuType;
	private String stuStartTime;
	private String stuEndTime;
	private String stuIdNumber;
	private String styAddress;
	private int cId;

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuUserName=" + stuUserName + ", stuPwd="
				+ stuPwd + ", classId=" + classId + ", stuSex=" + stuSex + ", stuBirth=" + stuBirth + ", stuImage="
				+ stuImage + ", stuPhone=" + stuPhone + ", stuType=" + stuType + ", stuStartTime=" + stuStartTime
				+ ", stuEndTime=" + stuEndTime + ", stuIdNumber=" + stuIdNumber + ", styAddress=" + styAddress
				+ ", cId=" + cId + "]";
	}
	
	
	
	/**
	 * 	`stuId` INT PRIMARY KEY AUTO_INCREMENT,
	`stuName` VARCHAR(20) COMMENT '学员姓名',
	`stuUserName` VARCHAR(50) COMMENT '学员通行证',
	`stuPwd` VARCHAR(30) COMMENT '密码',
	`classId` INT COMMENT '班级id',
	`stuSex` VARCHAR(4) COMMENT '性别',
	stuBirth VARCHAR(50) COMMENT '出生日期',
	stuImage VARCHAR(100) COMMENT '头像(App默认头像)',
	`stuPhone` VARCHAR(11) COMMENT '电话号码',
	stuType INT COMMENT '职位 人事经理1,其他0',
	`stuStartTime` DATETIME COMMENT '入学时间',
	stuEndTime DATETIME COMMENT '离校时间',
	stuIdNumber VARCHAR(20) COMMENT '省份证号码',
	styAddress VARCHAR(200) COMMENT '家庭住址',
	cId VARCHAR(100) COMMENT '通知栏接收消息推送唯一Id  用来接收消息推送'
	 */
}
