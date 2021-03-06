package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 错题
 * @author zml
 *
 */
@Data
public class Error implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7257503087836618012L;
	private int errorId;
	public int getErrorId() {
		return errorId;
	}
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getRecentlyAnswer() {
		return recentlyAnswer;
	}
	public void setRecentlyAnswer(String recentlyAnswer) {
		this.recentlyAnswer = recentlyAnswer;
	}
	public int getAnswerCount() {
		return answerCount;
	}
	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}
	public int getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}
	public String getLastAnswerTime() {
		return lastAnswerTime;
	}
	public void setLastAnswerTime(String lastAnswerTime) {
		this.lastAnswerTime = lastAnswerTime;
	}
	private int qtId;
	private int stuId;
	private String recentlyAnswer;
	private int answerCount;
	private int errorCount;
	private String lastAnswerTime;
	@Override
	public String toString() {
		return "Error [errorId=" + errorId + ", qtId=" + qtId + ", stuId=" + stuId + ", recentlyAnswer="
				+ recentlyAnswer + ", answerCount=" + answerCount + ", errorCount=" + errorCount + ", lastAnswerTime="
				+ lastAnswerTime + "]";
	}
	
	
	
	/**
	 * errorId INT PRIMARY KEY AUTO_INCREMENT,
	qtId INT COMMENT '题目id',
	stuId INT COMMENT '学员id',
	recentlyAnswer VARCHAR(10) COMMENT '最近回答答案',
	answerCount INT COMMENT '答题次数',
	errorCount INT COMMENT '答题错误次数',
	lastAnswerTime DATETIME COMMENT '最近答题时间'
	 */
}
