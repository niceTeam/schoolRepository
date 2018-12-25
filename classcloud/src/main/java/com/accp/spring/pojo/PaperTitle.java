package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 试卷题目
 * @author zml
 *
 */
@Data
public class PaperTitle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2683204255018326568L;
	private int ptId;
	private int qtId;
	private int examId;
	public int getPtId() {
		return ptId;
	}
	public void setPtId(int ptId) {
		this.ptId = ptId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PaperTitle [ptId=" + ptId + ", qtId=" + qtId + ", examId=" + examId + "]";
	}
	
	
	
	/**
	 * ptId INT PRIMARY KEY AUTO_INCREMENT,
	qtId INT COMMENT '题目id',
	examId INT COMMENT '考试试卷id'
	 */
}
