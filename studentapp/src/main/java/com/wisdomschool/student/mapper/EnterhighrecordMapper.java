package com.wisdomschool.student.mapper;
import com.wisdomschool.student.pojo.Enterhighrecord;
import java.util.List;
public interface EnterhighrecordMapper{
	/**
	 * 获得Enterhighrecord数据的总行数
	 * @return
	 */
    long getEnterhighrecordRowCount();
	/**
	 * 获得Enterhighrecord数据集合
	 * @return
	 */
    List<Enterhighrecord> selectEnterhighrecord();
	/**
	 * 获得一个Enterhighrecord对象,以参数Enterhighrecord对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Enterhighrecord selectEnterhighrecordByObj(Enterhighrecord obj);
	/**
	 * 通过Enterhighrecord的id获得Enterhighrecord对象
	 * @param id
	 * @return
	 */
    Enterhighrecord selectEnterhighrecordById(Integer id);
	/**
	 * 插入Enterhighrecord到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEnterhighrecord(Enterhighrecord value);
	/**
	 * 插入Enterhighrecord中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEnterhighrecord(Enterhighrecord value);
	/**
	 * 通过Enterhighrecord的id删除Enterhighrecord
	 * @param id
	 * @return
	 */
    int deleteEnterhighrecordById(Integer id);
	/**
	 * 通过Enterhighrecord的id更新Enterhighrecord中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEnterhighrecordById(Enterhighrecord enti);
	/**
	 * 通过Enterhighrecord的id更新Enterhighrecord中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEnterhighrecordById(Enterhighrecord enti);
}