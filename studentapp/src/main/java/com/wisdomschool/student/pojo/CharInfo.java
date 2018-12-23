package com.wisdomschool.student.pojo;

import java.io.Serializable;

/**
 * 聊天记录表
 * 
 * @author axiang
 *
 *         2018年12月21日 下午2:25:48
 */
public class CharInfo implements Serializable {
	private static final long serialVersionUID = 8855283820861267569L;
	private Integer chId;
	private String message; // 消息内容
	private Integer msgType; // 消息类型 1：消息 2：图片 3：文件 4语音
	private String sendTime; // 发送时间
	private Integer isRemove; // 是否撤回 未撤回1，已撤回2
	private Integer send; // 发送人
	private String beSend; // 接收人

	@Override
	public String toString() {
		return "CharInfo [chId=" + chId + ", message=" + message + ", msgType=" + msgType + ", sendTime=" + sendTime
				+ ", isRemove=" + isRemove + ", send=" + send + ", beSend=" + beSend + "]";
	}

	public CharInfo() {
	}

	public CharInfo(String message, Integer msgType, String sendTime, Integer isRemove, Integer send, String beSend) {
		super();
		this.message = message;
		this.msgType = msgType;
		this.sendTime = sendTime;
		this.isRemove = isRemove;
		this.send = send;
		this.beSend = beSend;
	}

	public Integer getChId() {
		return chId;
	}

	public void setChId(Integer chId) {
		this.chId = chId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getMsgType() {
		return msgType;
	}

	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public Integer getIsRemove() {
		return isRemove;
	}

	public void setIsRemove(Integer isRemove) {
		this.isRemove = isRemove;
	}

	public Integer getSend() {
		return send;
	}

	public void setSend(Integer send) {
		this.send = send;
	}

	public String getBeSend() {
		return beSend;
	}

	public void setBeSend(String beSend) {
		this.beSend = beSend;
	}

}
