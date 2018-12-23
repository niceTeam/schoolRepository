package com.wisdomschool.student.pojo;

import java.io.Serializable;

/**
 * 群组表
 * 
 * @author axiang
 *
 *         2018年12月19日 下午3:47:41
 */
public class GroupChat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7254797342319509906L;
	private Integer groupId;// 群组Id
	private String groupName;// 群组名
	private Integer ownerId;// 群主id
	private String groupTime;// 创立时间
	private Integer gradeId;// 年级Id

	@Override
	public String toString() {
		return "GroupChat [groupId=" + groupId + ", groupName=" + groupName + ", ownerId=" + ownerId + ", groupTime="
				+ groupTime + ", gradeId=" + gradeId + "]";
	}

	public GroupChat() {
	}

	public GroupChat(String groupName, Integer ownerId, String groupTime, Integer gradeId) {
		super();
		this.groupName = groupName;
		this.ownerId = ownerId;
		this.groupTime = groupTime;
		this.gradeId = gradeId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public String getGroupTime() {
		return groupTime;
	}

	public void setGroupTime(String groupTime) {
		this.groupTime = groupTime;
	}

	public Integer getGradeId() {
		return gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
