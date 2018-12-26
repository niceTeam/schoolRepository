package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 考试试卷模板
 * @author zml
 *
 */
@Data
public class ExamPaper implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8281255751059922521L;
	private int epId;
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public String getEpName() {
		return epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getTestRange() {
		return testRange;
	}
	public void setTestRange(String testRange) {
		this.testRange = testRange;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getEpSendTime() {
		return epSendTime;
	}
	public void setEpSendTime(String epSendTime) {
		this.epSendTime = epSendTime;
	}
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public int getUseCount() {
		return useCount;
	}
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}
	public int getTestTime() {
		return testTime;
	}
	public void setTestTime(int testTime) {
		this.testTime = testTime;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	private String epName;//试卷模板名称
	private int score;
	private String testRange;//考试范围
	private int teaId;
	private String epSendTime;
	private int gId;
	private int useCount;
	private int testTime;
	private int isForbid;
	@Override
	public String toString() {
		return "ExamPaper [epId=" + epId + ", epName=" + epName + ", score=" + score + ", testRange=" + testRange
				+ ", teaId=" + teaId + ", epSendTime=" + epSendTime + ", gId=" + gId + ", useCount=" + useCount
				+ ", testTime=" + testTime + ", isForbid=" + isForbid + "]";
	}
	
	
	/**
	 * epId INT PRIMARY KEY AUTO_INCREMENT,
	epName VARCHAR(200) COMMENT '试卷模板名称',
	score INT COMMENT '评分标准',
	testRange VARCHAR(20) COMMENT '考试范围',
	teaId INT COMMENT '试卷模板发布人Id',
	epSendTime DATETIME COMMENT '试卷模板发布时间',
	gId INT COMMENT '属于哪个年级',
	useCount INT COMMENT '试卷模板使用次数',
	testTime INT COMMENT '考试用时',
	isForbid INT COMMENT '是否禁用 1:否 2:是'
	 */
}
