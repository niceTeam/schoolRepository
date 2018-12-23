package com.wisdomschool.student.vo;

import java.util.List;

import com.wisdomschool.student.pojo.Grade;

public class GradeVo {
	private Integer gId;
	private String gName;
	private List<TeamItemVo> itemVos;

	@Override
	public String toString() {
		return "GradeVo [gId=" + gId + ", gName=" + gName + ", itemVos=" + itemVos + "]";
	}

	public GradeVo() {
	}

	public GradeVo(Integer gId, String gName, List<TeamItemVo> itemVos) {
		this.gId = gId;
		this.gName = gName;
		this.itemVos = itemVos;
	}

	public GradeVo(Grade grade, List<TeamItemVo> itemVos) {
		this.gId = grade.getgId();
		this.gName = grade.getgName();
		this.itemVos = itemVos;
	}

	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public List<TeamItemVo> getItemVos() {
		return itemVos;
	}

	public void setItemVos(List<TeamItemVo> itemVos) {
		this.itemVos = itemVos;
	}

}
