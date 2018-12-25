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
	private int stuName;
	private int stuUserName;
	private int stuPwd;
	private int classId;
	private int stuSex;
	private int stuBirth;
	private int stuImage;
	private int stuPhone;
	private int stuType;
	private int stuStartTime;
	private int stuEndTime;
	private int stuIdNumber;
	private int styAddress;
	private int cId;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getStuName() {
		return stuName;
	}
	public void setStuName(int stuName) {
		this.stuName = stuName;
	}
	public int getStuUserName() {
		return stuUserName;
	}
	public void setStuUserName(int stuUserName) {
		this.stuUserName = stuUserName;
	}
	public int getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(int stuPwd) {
		this.stuPwd = stuPwd;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getStuSex() {
		return stuSex;
	}
	public void setStuSex(int stuSex) {
		this.stuSex = stuSex;
	}
	public int getStuBirth() {
		return stuBirth;
	}
	public void setStuBirth(int stuBirth) {
		this.stuBirth = stuBirth;
	}
	public int getStuImage() {
		return stuImage;
	}
	public void setStuImage(int stuImage) {
		this.stuImage = stuImage;
	}
	public int getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(int stuPhone) {
		this.stuPhone = stuPhone;
	}
	public int getStuType() {
		return stuType;
	}
	public void setStuType(int stuType) {
		this.stuType = stuType;
	}
	public int getStuStartTime() {
		return stuStartTime;
	}
	public void setStuStartTime(int stuStartTime) {
		this.stuStartTime = stuStartTime;
	}
	public int getStuEndTime() {
		return stuEndTime;
	}
	public void setStuEndTime(int stuEndTime) {
		this.stuEndTime = stuEndTime;
	}
	public int getStuIdNumber() {
		return stuIdNumber;
	}
	public void setStuIdNumber(int stuIdNumber) {
		this.stuIdNumber = stuIdNumber;
	}
	public int getStyAddress() {
		return styAddress;
	}
	public void setStyAddress(int styAddress) {
		this.styAddress = styAddress;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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
