package com.wisdomschool.student.mapper;
import java.util.List;

import com.wisdomschool.student.pojo.GroupChatRecord;
public interface GroupchatrecordMapper{
	/**
	 * 获得GroupChatRecord数据的总行数
	 * @return
	 */
    long getGroupChatRecordRowCount();
	/**
	 * 获得GroupChatRecord数据集合
	 * @return
	 */
    List<GroupChatRecord> selectGroupChatRecord();
	/**
	 * 获得一个GroupChatRecord对象,以参数GroupChatRecord对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    GroupChatRecord selectGroupChatRecordByObj(GroupChatRecord obj);
	/**
	 * 通过GroupChatRecord的id获得GroupChatRecord对象
	 * @param id
	 * @return
	 */
    GroupChatRecord selectGroupChatRecordById(Integer id);
	/**
	 * 插入GroupChatRecord到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGroupChatRecord(GroupChatRecord value);
	/**
	 * 插入GroupChatRecord中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyGroupChatRecord(GroupChatRecord value);
	/**
	 * 通过GroupChatRecord的id删除GroupChatRecord
	 * @param id
	 * @return
	 */
    int deleteGroupChatRecordById(Integer id);
	/**
	 * 通过GroupChatRecord的id更新GroupChatRecord中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateGroupChatRecordById(GroupChatRecord enti);
	/**
	 * 通过GroupChatRecord的id更新GroupChatRecord中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyGroupChatRecordById(GroupChatRecord enti);
}