package com.wisdomschool.student.service;

import java.util.List;
import com.wisdomschool.student.mapper.GroupchatrecordMapper;
import com.wisdomschool.student.pojo.GroupChatRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupchatrecordService {
	@Autowired
	private GroupchatrecordMapper groupchatrecordMapper;

	public long getGroupchatrecordRowCount() {
		return groupchatrecordMapper.getGroupChatRecordRowCount();
	}

	public List<GroupChatRecord> selectGroupchatrecord() {
		return groupchatrecordMapper.selectGroupChatRecord();
	}

	public GroupChatRecord selectGroupchatrecordByObj(GroupChatRecord obj) {
		return groupchatrecordMapper.selectGroupChatRecordByObj(obj);
	}

	public GroupChatRecord selectGroupchatrecordById(Integer id) {
		return groupchatrecordMapper.selectGroupChatRecordById(id);
	}

	public int insertGroupchatrecord(GroupChatRecord value) {
		return groupchatrecordMapper.insertGroupChatRecord(value);
	}

	public int insertNonEmptyGroupchatrecord(GroupChatRecord value) {
		return groupchatrecordMapper.insertNonEmptyGroupChatRecord(value);
	}

	public int deleteGroupchatrecordById(Integer id) {
		return groupchatrecordMapper.deleteGroupChatRecordById(id);
	}

	public int updateGroupchatrecordById(GroupChatRecord enti) {
		return groupchatrecordMapper.updateGroupChatRecordById(enti);
	}

	public int updateNonEmptyGroupchatrecordById(GroupChatRecord enti) {
		return groupchatrecordMapper.updateNonEmptyGroupChatRecordById(enti);
	}

}