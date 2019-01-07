package com.accp.spring.zsy.pojo;

import java.io.Serializable;
import java.util.List;

import com.accp.spring.pojo.QuesOption;

public class Questions implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5711945209358536536L;
	
	
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public String getQtQuest() {
		return qtQuest;
	}
	public void setQtQuest(String qtQuest) {
		this.qtQuest = qtQuest;
	}
	public int getKnowId() {
		return knowId;
	}
	public void setKnowId(int knowId) {
		this.knowId = knowId;
	}
	public String getQtSendTime() {
		return QtSendTime;
	}
	public void setQtSendTime(String qtSendTime) {
		QtSendTime = qtSendTime;
	}
	public int getTeaId() {
		return teaId;
	}
	public void setTeaId(int teaId) {
		this.teaId = teaId;
	}
	public String getPrivary() {
		return privary;
	}
	public void setPrivary(String privary) {
		this.privary = privary;
	}
	public int getIsDel() {
		return isDel;
	}
	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}
	public String getZsd() {
		return zsd;
	}
	public void setZsd(String zsd) {
		this.zsd = zsd;
	}
	public String getFbr() {
		return fbr;
	}
	public void setFbr(String fbr) {
		this.fbr = fbr;
	}
	private int qtId;
	@Override
	public String toString() {
		return "Questions [qtId=" + qtId + ", qtQuest=" + qtQuest + ", knowId=" + knowId + ", QtSendTime=" + QtSendTime
				+ ", teaId=" + teaId + ", privary=" + privary + ", isDel=" + isDel + ", zsd=" + zsd + ", fbr=" + fbr
				+ ", idDouble=" + idDouble + "]";
	}
	private String qtQuest;
	private int knowId;
	private String QtSendTime;
	private int teaId;
	private String privary;//私密度 私有题库1、或公开题库2
	private int isDel;//是否删除 1否 2是
	private String zsd;//知识点
	private String fbr;//发布人
	private int idDouble;//1单选 2多选
	private int sfsc;//是否收藏
	private String jiexi;//解析
	public String getJiexi() {
		return jiexi;
	}
	public void setJiexi(String jiexi) {
		this.jiexi = jiexi;
	}
	public int getSfsc() {
		return sfsc;
	}
	public void setSfsc(int sfsc) {
		this.sfsc = sfsc;
	}
	public int getIdDouble() {
		return idDouble;
	}
	public void setIdDouble(int idDouble) {
		this.idDouble = idDouble;
	}
	
	private List<QuesOption> list;


	public List<QuesOption> getList() {
		return list;
	}
	public void setList(List<QuesOption> list) {
		this.list = list;
	}
}
