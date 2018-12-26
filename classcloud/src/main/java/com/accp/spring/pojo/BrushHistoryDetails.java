package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 知识点刷题历史明细
 * @author zml
 *
 */
@Data
public class BrushHistoryDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2876823288423291437L;
	private int bhdId;
	public int getBhdId() {
		return bhdId;
	}
	public void setBhdId(int bhdId) {
		this.bhdId = bhdId;
	}
	public int getBhId() {
		return bhId;
	}
	public void setBhId(int bhId) {
		this.bhId = bhId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	public String getStuAnswer() {
		return stuAnswer;
	}
	public void setStuAnswer(String stuAnswer) {
		this.stuAnswer = stuAnswer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private int bhId;//刷题历史id
	private int qtId;//题目id
	private String rightAnswer;//正确答案
	private String stuAnswer;//你回答的是
	@Override
	public String toString() {
		return "BrushHistoryDetails [bhdId=" + bhdId + ", bhId=" + bhId + ", qtId=" + qtId + ", rightAnswer="
				+ rightAnswer + ", stuAnswer=" + stuAnswer + "]";
	}
	
	
	/**
	 * bhdId INT PRIMARY KEY AUTO_INCREMENT,
	bhId INT COMMENT '刷题历史id',
	qtId INT COMMENT '题目id',
	rightAnswer VARCHAR(10) COMMENT '正确答案',
	stuAnswer VARCHAR(10) COMMENT '你回答的是'
	 */
}
