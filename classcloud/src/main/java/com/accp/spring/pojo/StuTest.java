package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 考试人员及考试情况
 * @author zml
 *
 */
@Data
public class StuTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3326321618917105910L;
	private int stuTestId;
	public int getStuTestId() {
		return stuTestId;
	}

	public void setStuTestId(int stuTestId) {
		this.stuTestId = stuTestId;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getCommitTime() {
		return commitTime;
	}

	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}

	public int getCommitStyle() {
		return commitStyle;
	}

	public void setCommitStyle(int commitStyle) {
		this.commitStyle = commitStyle;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	private int stuId;
	private int examId;
	private int status;
	private String startTime;
	private String commitTime;
	private int commitStyle;
	private int score;

	@Override
	public String toString() {
		return "StuTest [stuTestId=" + stuTestId + ", stuId=" + stuId + ", examId=" + examId + ", status=" + status
				+ ", startTime=" + startTime + ", commitTime=" + commitTime + ", commitStyle=" + commitStyle
				+ ", score=" + score + "]";
	}
	
	
	/**
	 * stuTestId INT PRIMARY KEY AUTO_INCREMENT,
	stuId INT COMMENT '学员id',
	examId INT COMMENT '考试试卷id',
	`status` INT COMMENT '考试状态	未考1，正在考2，已交卷3',
	startTime DATETIME COMMENT '开考时间',
	commitTime DATETIME COMMENT '交卷时间',
	commitStyle INT COMMENT '交卷方式 自己交卷1、超时系统自动交卷2',
	score INT COMMENT '考试分数'
	 */
}
