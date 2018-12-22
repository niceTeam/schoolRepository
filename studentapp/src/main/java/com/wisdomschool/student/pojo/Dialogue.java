package com.wisdomschool.student.pojo;

import java.io.Serializable;

/**
 * 对话表
 * 
 * @author axiang
 *
 *         2018年12月21日 下午2:28:19
 */
public class Dialogue implements Serializable {
	private static final long serialVersionUID = 4752692379538924944L;
	private int dId;
	private String sendId; // 发送人Id
	private String beSendId; // 接收人Id/群
	private int IsQun; // 是否为群聊 1：不是 2：是

	@Override
	public String toString() {
		return "Dialogue [dId=" + dId + ", sendId=" + sendId + ", beSendId=" + beSendId + ", IsQun=" + IsQun + "]";
	}

	public Dialogue() {
	}

	public Dialogue(String sendId, String beSendId, int isQun) {
		super();
		this.sendId = sendId;
		this.beSendId = beSendId;
		IsQun = isQun;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getSendId() {
		return sendId;
	}

	public void setSendId(String sendId) {
		this.sendId = sendId;
	}

	public String getBeSendId() {
		return beSendId;
	}

	public void setBeSendId(String beSendId) {
		this.beSendId = beSendId;
	}

	public int getIsQun() {
		return IsQun;
	}

	public void setIsQun(int isQun) {
		IsQun = isQun;
	}
}
