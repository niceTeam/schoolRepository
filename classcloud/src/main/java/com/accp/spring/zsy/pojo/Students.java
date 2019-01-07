package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class Students implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 305657277030410492L;
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
	private String cName;
	private int gId;
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	private String gName;
}
