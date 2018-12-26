package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 解析
 * @author zml
 *
 */
@Data
public class Analyze implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 989031606358645490L;
	private int analyzeId;
	public int getAnalyzeId() {
		return analyzeId;
	}
	public void setAnalyzeId(int analyzeId) {
		this.analyzeId = analyzeId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public int getAnalyzeContent() {
		return analyzeContent;
	}
	public void setAnalyzeContent(int analyzeContent) {
		this.analyzeContent = analyzeContent;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getAnalyzeTime() {
		return analyzeTime;
	}
	public void setAnalyzeTime(int analyzeTime) {
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
	private int qtId;
	private int analyzeContent;
	private int stuId;
	private int analyzeTime;
	private int yes;//赞(的数量)
	private int no;//踩(的数量)
	@Override
	public String toString() {
		return "Analyze [analyzeId=" + analyzeId + ", qtId=" + qtId + ", analyzeContent=" + analyzeContent + ", stuId="
				+ stuId + ", analyzeTime=" + analyzeTime + ", yes=" + yes + ", no=" + no + "]";
	}
	
	
	
	/**
	 * analyzeId INT PRIMARY KEY AUTO_INCREMENT,
	qtId INT COMMENT '题目Id',
	analyzeContent VARCHAR(500) COMMENT '解析内容',
	stuId INT COMMENT '解析人',
	analyzeTime DATETIME COMMENT '解析时间',
	yes INT COMMENT '赞(的数量)',
	`no` INT COMMENT '踩(的数量)'
	 */
}
