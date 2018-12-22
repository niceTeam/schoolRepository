package com.wisdomschool.student.mapper;

import java.util.List;

import com.wisdomschool.student.pojo.CharInfo;

public interface CharinfoMapper {
	/**
	 * 获得Charinfo数据的总行数
	 * 
	 * @return
	 */
	long getCharinfoRowCount();

	/**
	 * 获得Charinfo数据集合
	 * 
	 * @return
	 */
	List<CharInfo> selectCharinfo();

	/**
	 * 获得一个Charinfo对象,以参数Charinfo对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	CharInfo selectCharinfoByObj(CharInfo obj);

	/**
	 * 通过Charinfo的id获得Charinfo对象
	 * 
	 * @param id
	 * @return
	 */
	CharInfo selectCharinfoById(Integer id);

	/**
	 * 插入Charinfo到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertCharinfo(CharInfo value);

	/**
	 * 插入Charinfo中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNonEmptyCharinfo(CharInfo value);

	/**
	 * 通过Charinfo的id删除Charinfo
	 * 
	 * @param id
	 * @return
	 */
	int deleteCharinfoById(Integer id);

	/**
	 * 通过Charinfo的id更新Charinfo中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateCharinfoById(CharInfo enti);

	/**
	 * 通过Charinfo的id更新Charinfo中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNonEmptyCharinfoById(CharInfo enti);
}