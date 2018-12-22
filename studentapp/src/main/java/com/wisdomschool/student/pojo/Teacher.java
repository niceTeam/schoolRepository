package com.wisdomschool.student.pojo;

import java.io.Serializable;

/**
 * 员工表
 * 
 * @author axiang
 *
 *         2018年12月21日 下午2:35:04
 */
public class Teacher implements Serializable {

	private static final long serialVersionUID = -346314626056458385L;

	private int teaId;
	private String teaName; // 员工Id
	private String teaUserName; // 员工通行证
	private String teaPwd; // 密码
	private String teaImage; // 头像,App默认头像
	private int teaType; // 职位 1:班主任 2:教员 3:管理者 4:宿管
	private String teaPhone; // 联系电话
	private String teaSex; // 性别
	private String teaBirth; // 出生日期
	private String teaStartTime; // 入职时间
	private String teaEndTime; // 离职时间
	private String teaIdNumber; // 省份证号
	private String teaAddress; // 家庭住址
	private String cId; // 通知栏接收消息推送唯一Id 用来接收消息推送

	@Override
	public String toString() {
		return "Teacher [teaId=" + teaId + ", teaName=" + teaName + ", teaUserName=" + teaUserName + ", teaPwd="
				+ teaPwd + ", teaImage=" + teaImage + ", teaType=" + teaType + ", teaPhone=" + teaPhone + ", teaSex="
				+ teaSex + ", teaBirth=" + teaBirth + ", teaStartTime=" + teaStartTime + ", teaEndTime=" + teaEndTime
				+ ", teaIdNumber=" + teaIdNumber + ", teaAddress=" + teaAddress + ", cId=" + cId + "]";
	}

	public Teacher() {
	}

	public Teacher(String teaName, String teaUserName, String teaPwd, String teaImage, int teaType, String teaPhone,
			String teaSex, String teaBirth, String teaStartTime, String teaEndTime, String teaIdNumber,
			String teaAddress, String cId) {
		super();
		this.teaName = teaName;
		this.teaUserName = teaUserName;
		this.teaPwd = teaPwd;
		this.teaImage = teaImage;
		this.teaType = teaType;
		this.teaPhone = teaPhone;
		this.teaSex = teaSex;
		this.teaBirth = teaBirth;
		this.teaStartTime = teaStartTime;
		this.teaEndTime = teaEndTime;
		this.teaIdNumber = teaIdNumber;
		this.teaAddress = teaAddress;
		this.cId = cId;
	}

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

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

}
