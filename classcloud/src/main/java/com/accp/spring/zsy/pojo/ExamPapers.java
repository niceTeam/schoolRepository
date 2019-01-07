package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class ExamPapers implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7159678004864317836L;

	private int epId;
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public String getEpName() {
		return epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTestRange() {
		return testRange;
	}
	public void setTestRange(String testRange) {
		this.testRange = testRange;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getEpSendTime() {
		return epSendTime;
	}
	public void setEpSendTime(String epSendTime) {
		this.epSendTime = epSendTime;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public int getUseCount() {
		return useCount;
	}
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}
	public int getTestTime() {
		return testTime;
	}
	public void setTestTime(int testTime) {
		this.testTime = testTime;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	private String epName;//试卷模板名称
	private int score;
	private String testRange;//考试范围
	private int teaId;
	private String epSendTime;
	private int gId;
	private int useCount;
	private int testTime;
	private int isForbid;
	private String teaName;
	private String gName;
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
}
