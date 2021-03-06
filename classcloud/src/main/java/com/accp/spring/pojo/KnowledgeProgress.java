package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 知识刷题进度
 * @author zml
 *
 */
@Data
public class KnowledgeProgress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8772809547864646120L;
	public int getKpId() {
		return kpId;
	}
	public void setKpId(int kpId) {
		this.kpId = kpId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public int getProgressCount() {
		return progressCount;
	}
	public void setProgressCount(int progressCount) {
		this.progressCount = progressCount;
	}
	private int kpId;
	private int stuId;
	private int knowId;
	private int percent;
	private int progressCount;
	@Override
	public String toString() {
		return "KnowledgeProgress [kpId=" + kpId + ", stuId=" + stuId + ", knowId=" + knowId + ", percent=" + percent
				+ ", progressCount=" + progressCount + "]";
	}
	
	
	/**
	 * kpId INT PRIMARY KEY AUTO_INCREMENT,
	stuId INT COMMENT '学员id',
	knowId INT COMMENT '知识点id',
	percent INT COMMENT '百分比数值',
	progressCount INT COMMENT '第几遍'
	 */
	
}
