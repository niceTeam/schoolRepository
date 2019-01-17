package com.accp.spring.zml.vo;

import java.io.Serializable;
import java.util.List;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.BrushHistoryDetails;
import com.accp.spring.pojo.QuesOption;

public class ErrorVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4334991566240966646L;
	
	private int errorId;
	public int getErrorId() {
		return errorId;
	}
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
	public int getQtId() {
		return qtId;
	}
	public void setQtId(int qtId) {
		this.qtId = qtId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getRecentlyAnswer() {
		return recentlyAnswer;
	}
	public void setRecentlyAnswer(String recentlyAnswer) {
		this.recentlyAnswer = recentlyAnswer;
	}
	public int getAnswerCount() {
		return answerCount;
	}
	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}
	public int getErrorCount() {
		return errorCount;
	}
	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}
	public String getLastAnswerTime() {
		return lastAnswerTime;
	}
	public void setLastAnswerTime(String lastAnswerTime) {
		this.lastAnswerTime = lastAnswerTime;
	}
	private int qtId;
	private int stuId;
	private String recentlyAnswer;
	private int answerCount;
	private int errorCount;
	private String lastAnswerTime;
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
