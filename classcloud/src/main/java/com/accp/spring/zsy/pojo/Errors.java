package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class Errors implements Serializable{

	/**
	 * 错题表
	 */
	private static final long serialVersionUID = -4332514859096348008L;

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
}
