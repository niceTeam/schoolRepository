package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class Analyzes implements Serializable{

	/**
	 * 解析
	 */
	private static final long serialVersionUID = 4927368590116644809L;

	private int analyzeId;
	public int getAnalyzeId() {
		return analyzeId;
	}
	public void setAnalyzeId(int analyzeId) {
		this.analyzeId = analyzeId;
	}
	public String getAnalyzeContent() {
		return analyzeContent;
	}
	public void setAnalyzeContent(String analyzeContent) {
		this.analyzeContent = analyzeContent;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getAnalyzeTime() {
		return analyzeTime;
	}
	public void setAnalyzeTime(String analyzeTime) {
		this.analyzeTime = analyzeTime;
	}
	public int getYes() {
		return yes;
	}
	public void setYes(int yes) {
		this.yes = yes;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	private String analyzeContent;
	private int stuId;
	private String analyzeTime;
	private int yes;//赞(的数量)
	private int no;//踩(的数量)
	private int typeid;
	private String teaName;
	private String stuName;
	private int qtId;
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
}
