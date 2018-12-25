package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 学员考试答案
 * @author zml
 *
 */
@Data
public class StuAnswer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6207799198048194383L;
	private int saId;
	private int examId;
	private int qtId;
	private int stuId;
	private int saAnswer;
	public int getSaId() {
		return saId;
	}
	public void setSaId(int saId) {
		this.saId = saId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
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
	public int getSaAnswer() {
		return saAnswer;
	}
	public void setSaAnswer(int saAnswer) {
		this.saAnswer = saAnswer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "StuAnswer [saId=" + saId + ", examId=" + examId + ", qtId=" + qtId + ", stuId=" + stuId + ", saAnswer="
				+ saAnswer + "]";
	}
	
	
	/**
	 * saId INT PRIMARY KEY AUTO_INCREMENT,
	examId INT COMMENT '考试Id',
	qtId INT COMMENT '题目Id',
	stuId INT COMMENT '学员id',
	saAnswer VARCHAR(10) COMMENT '题目答案'
	 */
}
