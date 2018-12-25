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
