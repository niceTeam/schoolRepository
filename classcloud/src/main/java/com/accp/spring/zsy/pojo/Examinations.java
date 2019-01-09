package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class Examinations implements Serializable{
	
	/**
	 * 考试表
	 */
	private static final long serialVersionUID = 8677771764913918731L;
	
	private int examId;
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getExamPaperId() {
		return examPaperId;
	}
	public void setExamPaperId(int examPaperId) {
		this.examPaperId = examPaperId;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public int getZscore() {
		return zscore;
	}
	public void setZscore(int zscore) {
		this.zscore = zscore;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	private int examPaperId;
	private String classId;
	private int teaId;
	private String epSendTime;
	private String startTime;
	private String endTime;
	private String paperName;//试卷名称
	private int zscore;//试卷总分
	private String duration;//考试时常
	private int tmsum;//试卷题目数量
	private String ksbj;//考试班级
	private String teaName;//创建人
	public String getTeaName() {
		return teaName;
	}
	public void setTname(String teaName) {
		this.teaName = teaName;
	}
	public String getKsbj() {
		return ksbj;
	}
	public void setKsbj(String ksbj) {
		this.ksbj = ksbj;
	}
	public int getTmsum() {
		return tmsum;
	}
	public void setTmsum(int tmsum) {
		this.tmsum = tmsum;
	}
}
