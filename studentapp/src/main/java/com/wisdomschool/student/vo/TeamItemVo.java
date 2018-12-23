package com.wisdomschool.student.vo;

public class TeamItemVo {
	private Integer tid;
	private Integer tType;// 1：群 2：老师
	private String tName;// 聊天名称
	private String tImg;
	private String tDate;// 最进活跃时间

	@Override
	public String toString() {
		return "TeamItemVo [tid=" + tid + ", tType=" + tType + ", tName=" + tName + ", tDate=" + tDate + ", tImg="
				+ tImg + "]";
	}

	public TeamItemVo(Integer tid, Integer tType, String tName, String tImg, String tDate) {
		super();
		this.tid = tid;
		this.tType = tType;
		this.tName = tName;
		this.tImg = tImg;
		this.tDate = tDate;
	}

	public TeamItemVo() {
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer gettType() {
		return tType;
	}

	public void settType(Integer tType) {
		this.tType = tType;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettDate() {
		return tDate;
	}

	public void settDate(String tDate) {
		this.tDate = tDate;
	}

	public String gettImg() {
		return tImg;
	}

	public void settImg(String tImg) {
		this.tImg = tImg;
	}

}
