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
	private String teaName;
	public int getTeaId() {
		return teaId;
	}

	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}

	public String getTeaName() {
		return teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public String getTeaUserName() {
		return teaUserName;
	}

	public void setTeaUserName(String teaUserName) {
		this.teaUserName = teaUserName;
	}

	public String getTeaPwd() {
		return teaPwd;
	}

	public void setTeaPwd(String teaPwd) {
		this.teaPwd = teaPwd;
	}

	public String getTeaImage() {
		return teaImage;
	}

	public void setTeaImage(String teaImage) {
		this.teaImage = teaImage;
	}

	public int getTeaType() {
		return teaType;
	}

	public void setTeaType(int teaType) {
		this.teaType = teaType;
	}

	public String getTeaPhone() {
		return teaPhone;
	}

	public void setTeaPhone(String teaPhone) {
		this.teaPhone = teaPhone;
	}

	public String getTeaSex() {
		return teaSex;
	}

	public void setTeaSex(String teaSex) {
		this.teaSex = teaSex;
	}

	public String getTeaBirth() {
		return teaBirth;
	}

	public void setTeaBirth(String teaBirth) {
		this.teaBirth = teaBirth;
	}

	public String getTeaStartTime() {
		return teaStartTime;
	}

	public void setTeaStartTime(String teaStartTime) {
		this.teaStartTime = teaStartTime;
	}

	public String getTeaEndTime() {
		return teaEndTime;
	}

	public void setTeaEndTime(String teaEndTime) {
		this.teaEndTime = teaEndTime;
	}

	public String getTeaIdNumber() {
		return teaIdNumber;
	}

	public void setTeaIdNumber(String teaIdNumber) {
		this.teaIdNumber = teaIdNumber;
	}

	public String getTeaAddress() {
		return teaAddress;
	}

	public void setTeaAddress(String teaAddress) {
		this.teaAddress = teaAddress;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	private String teaUserName;
	private String teaPwd;
	private String teaImage;
	private int teaType;
	private String teaPhone;
	private String teaSex;
	private String teaBirth;
	private String teaStartTime;
	private String teaEndTime;
	private String teaIdNumber;
	private String teaAddress;
	private int cId;

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
