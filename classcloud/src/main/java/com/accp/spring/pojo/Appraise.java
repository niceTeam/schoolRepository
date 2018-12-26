package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 点赞
 * @author zml
 *
 */
@Data
public class Appraise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4211817746212755370L;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAppraise() {
		return appraise;
	}
	public void setAppraise(int appraise) {
		this.appraise = appraise;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getAnalyzeId() {
		return analyzeId;
	}
	public void setAnalyzeId(int analyzeId) {
		this.analyzeId = analyzeId;
	}
	private int appraise;
	private int stuId;
	private int analyzeId;
	@Override
	public String toString() {
		return "Appraise [id=" + id + ", appraise=" + appraise + ", stuId=" + stuId + ", analyzeId=" + analyzeId + "]";
	}
	
	
	/**
	 * id INT PRIMARY KEY AUTO_INCREMENT,
	appraise INT COMMENT '1 点赞 2踩 0既不赞也不踩',
	stuId INT COMMENT '学员id',
	analyzeId INT COMMENT '对应那一条解析'
	 */
	
	
}
