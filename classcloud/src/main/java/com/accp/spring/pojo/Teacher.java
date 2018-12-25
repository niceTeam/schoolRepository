package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 员工表
 * @author zml
 *
 */
@Data
public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4832962415795788240L;
	private int teaId;
	private int teaName;
	private int teaUserName;
	private int teaPwd;
	private int teaImage;
	private int teaType;
	private int teaPhone;
	private int teaSex;
	private int teaBirth;
	private int teaStartTime;
	private int teaEndTime;
	private int teaIdNumber;
	private int teaAddress;
	private int cId;
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public int getTeaName() {
		return teaName;
	}
	public void setTeaName(int teaName) {
		this.teaName = teaName;
	}
	public int getTeaUserName() {
		return teaUserName;
	}
	public void setTeaUserName(int teaUserName) {
		this.teaUserName = teaUserName;
	}
	public int getTeaPwd() {
		return teaPwd;
	}
	public void setTeaPwd(int teaPwd) {
		this.teaPwd = teaPwd;
	}
	public int getTeaImage() {
		return teaImage;
	}
	public void setTeaImage(int teaImage) {
		this.teaImage = teaImage;
	}
	public int getTeaType() {
		return teaType;
	}
	public void setTeaType(int teaType) {
		this.teaType = teaType;
	}
	public int getTeaPhone() {
		return teaPhone;
	}
	public void setTeaPhone(int teaPhone) {
		this.teaPhone = teaPhone;
	}
	public int getTeaSex() {
		return teaSex;
	}
	public void setTeaSex(int teaSex) {
		this.teaSex = teaSex;
	}
	public int getTeaBirth() {
		return teaBirth;
	}
	public void setTeaBirth(int teaBirth) {
		this.teaBirth = teaBirth;
	}
	public int getTeaStartTime() {
		return teaStartTime;
	}
	public void setTeaStartTime(int teaStartTime) {
		this.teaStartTime = teaStartTime;
	}
	public int getTeaEndTime() {
		return teaEndTime;
	}
	public void setTeaEndTime(int teaEndTime) {
		this.teaEndTime = teaEndTime;
	}
	public int getTeaIdNumber() {
		return teaIdNumber;
	}
	public void setTeaIdNumber(int teaIdNumber) {
		this.teaIdNumber = teaIdNumber;
	}
	public int getTeaAddress() {
		return teaAddress;
	}
	public void setTeaAddress(int teaAddress) {
		this.teaAddress = teaAddress;
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
		return "Teacher [teaId=" + teaId + ", teaName=" + teaName + ", teaUserName=" + teaUserName + ", teaPwd="
				+ teaPwd + ", teaImage=" + teaImage + ", teaType=" + teaType + ", teaPhone=" + teaPhone + ", teaSex="
				+ teaSex + ", teaBirth=" + teaBirth + ", teaStartTime=" + teaStartTime + ", teaEndTime=" + teaEndTime
				+ ", teaIdNumber=" + teaIdNumber + ", teaAddress=" + teaAddress + ", cId=" + cId + "]";
	}
	
	
	/**
	 * teaId INT PRIMARY KEY AUTO_INCREMENT,
	teaName VARCHAR(30) COMMENT '员工Id',
	teaUserName VARCHAR(50) COMMENT '员工通行证',
	teaPwd VARCHAR(40) COMMENT '密码',
	teaImage VARCHAR(100) COMMENT '头像,App默认头像',
	teaType INT COMMENT '职位 1:班主任 2:教员 3:管理者 4:宿管',
	teaPhone VARCHAR(12) COMMENT '联系电话',
	teaSex VARCHAR(4) COMMENT '性别',
	teaBirth DATETIME  COMMENT '出生日期',
	teaStartTime DATETIME COMMENT '入职时间',
	teaEndTime DATETIME COMMENT '离职时间',
	teaIdNumber VARCHAR(20) COMMENT '省份证号',
	teaAddress VARCHAR(200) COMMENT '家庭住址',
	cId VARCHAR(100) COMMENT '通知栏接收消息推送唯一Id  用来接收消息推送'
	 */
}
