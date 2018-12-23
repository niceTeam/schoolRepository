package com.wisdomschool.student.mapper;
import com.wisdomschool.student.pojo.CharInfo;
import java.util.List;
public interface CharInfoMapper{
	/**
	 * 获得CharInfo数据的总行数
	 * @return
	 */
    long getCharInfoRowCount();
	/**
	 * 获得CharInfo数据集合
	 * @return
	 */
    List<CharInfo> selectCharInfo();
	/**
	 * 获得一个CharInfo对象,以参数CharInfo对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    CharInfo selectCharInfoByObj(CharInfo obj);
	/**
	 * 通过CharInfo的id获得CharInfo对象
	 * @param id
	 * @return
	 */
    CharInfo selectCharInfoById(Integer id);
	/**
	 * 插入CharInfo到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCharInfo(CharInfo value);
	/**
	 * 插入CharInfo中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCharInfo(CharInfo value);
	/**
	 * 通过CharInfo的id删除CharInfo
	 * @param id
	 * @return
	 */
    int deleteCharInfoById(Integer id);
	/**
	 * 通过CharInfo的id更新CharInfo中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCharInfoById(CharInfo enti);
	/**
	 * 通过CharInfo的id更新CharInfo中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCharInfoById(CharInfo enti);
}