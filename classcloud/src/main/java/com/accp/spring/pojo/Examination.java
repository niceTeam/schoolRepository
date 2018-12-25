package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 考试表
 * @author zml
 *
 */
@Data
public class Examination implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1684791415227908011L;
	private int examId;
	private int examPaperId;
	private int classId;
	private int teaId;
	private int epSendTime;
	private int startTime;
	private int endTime;
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
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public int getEpSendTime() {
		return epSendTime;
	}
	public void setEpSendTime(int epSendTime) {
		this.epSendTime = epSendTime;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Examination [examId=" + examId + ", examPaperId=" + examPaperId + ", classId=" + classId + ", teaId="
				+ teaId + ", epSendTime=" + epSendTime + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	

	/**
	 * examId INT PRIMARY KEY AUTO_INCREMENT,
	examPaperId INT COMMENT '试卷Id',
	classId VARCHAR(100) COMMENT '参加考试的班级',
	teaId INT COMMENT '试卷发布人',
	epSendTime DATETIME COMMENT '试卷发布时间',
	startTime DATETIME COMMENT '考试开始时间',
	endTime DATETIME COMMENT '考试结束时间'
	 */
}
