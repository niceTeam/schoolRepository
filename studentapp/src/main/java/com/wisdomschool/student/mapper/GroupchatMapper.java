package com.wisdomschool.student.mapper;
import java.util.List;

import com.wisdomschool.student.pojo.GroupChat;
public interface GroupchatMapper{
	/**
	 * 获得GroupChat数据的总行数
	 * @return
	 */
    long getGroupChatRowCount();
	/**
	 * 获得GroupChat数据集合
	 * @return
	 */
    List<GroupChat> selectGroupChat();
	/**
	 * 获得一个GroupChat对象,以参数GroupChat对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    GroupChat selectGroupChatByObj(GroupChat obj);
	/**
	 * 通过GroupChat的id获得GroupChat对象
	 * @param id
	 * @return
	 */
    GroupChat selectGroupChatById(Integer id);
	/**
	 * 插入GroupChat到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGroupChat(GroupChat value);
	/**
	 * 插入GroupChat中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyGroupChat(GroupChat value);
	/**
	 * 通过GroupChat的id删除GroupChat
	 * @param id
	 * @return
	 */
    int deleteGroupChatById(Integer id);
	/**
	 * 通过GroupChat的id更新GroupChat中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateGroupChatById(GroupChat enti);
	/**
	 * 通过GroupChat的id更新GroupChat中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyGroupChatById(GroupChat enti);
}