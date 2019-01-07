package com.accp.spring.pojo;

import java.io.Serializable;

import lombok.Data;

/**
 * 历史试卷表
 * @author zml
 *
 */
@Data
public class ExamPaperHistory implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2077097368746840391L;
	private int paperId;
	private int epId;
	private String paperName;
	private int passrate;
	private int useCount;
	private String createTime;
	private String lastUpdTime;
	private int lastUpdPerson;
	private int isForbid;
	public int getPaperId() {
		return paperId;
	}
	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}
	public int getEpId() {
		return epId;
	}
	public void setEpId(int epId) {
		this.epId = epId;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public int getPassrate() {
		return passrate;
	}
	public void setPassrate(int passrate) {
		this.passrate = passrate;
	}
	public int getUseCount() {
		return useCount;
	}
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getLastUpdTime() {
		return lastUpdTime;
	}
	public void setLastUpdTime(String lastUpdTime) {
		this.lastUpdTime = lastUpdTime;
	}
	public int getLastUpdPerson() {
		return lastUpdPerson;
	}
	public void setLastUpdPerson(int lastUpdPerson) {
		this.lastUpdPerson = lastUpdPerson;
	}
	public int getIsForbid() {
		return isForbid;
	}
	public void setIsForbid(int isForbid) {
		this.isForbid = isForbid;
	}
	public int createPerson;
	public int getCreatePerson() {
		return createPerson;
	}
	public void setCreatePerson(int createPerson) {
		this.createPerson = createPerson;
	}
	@Override
	public String toString() {
		return "ExamPaperHistory [paperId=" + paperId + ", epId=" + epId + ", paperName=" + paperName + ", passrate="
				+ passrate + ", useCount=" + useCount + ", createTime=" + createTime + ", lastUpdTime=" + lastUpdTime
				+ ", lastUpdPerson=" + lastUpdPerson + ", isForbid=" + isForbid + "]";
	}
	
	

	/**
	 * paperId INT PRIMARY KEY AUTO_INCREMENT,
	epId INT COMMENT '试卷id',
	paperName VARCHAR(100) COMMENT '试卷名称',
	passrate INT COMMENT '合格率',
	useCount INT COMMENT '试卷使用次数',
	createTime DATETIME COMMENT '试卷创建时间',
	lastUpdTime DATETIME COMMENT '最后修改时间',
	lastUpdPerson INT COMMENT '最后修改人',
	isForbid INT COMMENT '是否禁用 1:否 2:是'

	 */
}
