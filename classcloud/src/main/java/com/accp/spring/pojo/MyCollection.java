package com.accp.spring.pojo;

import java.io.Serializable;

import org.springframework.data.annotation.TypeAlias;

import lombok.Data;

/**
 * 收藏
 * @author zml
 *
 */
@Data
public class MyCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8268773468075026305L;
	private int collectId;
	public int getCollectId() {
		return collectId;
	}
	public void setCollectId(int collectId) {
		this.collectId = collectId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}
	private int stuId;
	private int qtId;
	private String collectTime;
	@Override
	public String toString() {
		return "Collection [collectId=" + collectId + ", stuId=" + stuId + ", qtId=" + qtId + ", collectTime="
				+ collectTime + "]";
	}
	
	
	/**
	 * collectId INT PRIMARY KEY AUTO_INCREMENT,
	stuId INT COMMENT '学员id',
	qtId INT COMMENT '题目id',
	collectTime DATETIME COMMENT '收藏时间'
	 */
	
}
