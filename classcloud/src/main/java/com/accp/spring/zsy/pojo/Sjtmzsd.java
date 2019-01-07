package com.accp.spring.zsy.pojo;

import java.io.Serializable;

public class Sjtmzsd implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8821674194723245181L;
	
	private int knowId;
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public int getTmsum() {
		return tmsum;
	}
	public void setTmsum(int tmsum) {
		this.tmsum = tmsum;
	}
	public String getKnowName() {
		return knowName;
	}
	public void setKnowName(String knowName) {
		this.knowName = knowName;
	}
	private int tmsum;
	private String knowName;
	private int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}
