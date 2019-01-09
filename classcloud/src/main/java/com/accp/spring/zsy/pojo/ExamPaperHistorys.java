package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class ExamPaperHistorys implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8612555750921823587L;
	
	private int paperId;
	public int getPaperId() {
		return paperId;
	}
	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public int getPassrate() {
		return passrate;
	}
	public void setPassrate(int passrate) {
		this.passrate = passrate;
	}
	public int getUseCount() {
		return useCount;
	}
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastUpdTime() {
		return lastUpdTime;
	}
	public void setLastUpdTime(String lastUpdTime) {
		this.lastUpdTime = lastUpdTime;
	}
	public int getLastUpdPerson() {
		return lastUpdPerson;
	}
	public void setLastUpdPerson(int lastUpdPerson) {
		this.lastUpdPerson = lastUpdPerson;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	private int epId;
	private String paperName;
	private int passrate;
	private int useCount;
	private String createTime;
	private String lastUpdTime;
	private int lastUpdPerson;
	private int isForbid;
	private int tmsum;
	public int getTmsum() {
		return tmsum;
	}
	public void setTmsum(int tmsum) {
		this.tmsum = tmsum;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private String teaName;
	private int score;
	private int createPerson;
	public int getCreatePerson() {
		return createPerson;
	}
	public void setCreatePerson(int createPerson) {
		this.createPerson = createPerson;
	}

}
