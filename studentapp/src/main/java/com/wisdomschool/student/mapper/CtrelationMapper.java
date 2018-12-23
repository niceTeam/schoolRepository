package com.wisdomschool.student.mapper;
import com.wisdomschool.student.pojo.Ctrelation;
import java.util.List;
public interface CtrelationMapper{
	/**
	 * 获得Ctrelation数据的总行数
	 * @return
	 */
    long getCtrelationRowCount();
	/**
	 * 获得Ctrelation数据集合
	 * @return
	 */
    List<Ctrelation> selectCtrelation();
	/**
	 * 获得一个Ctrelation对象,以参数Ctrelation对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Ctrelation selectCtrelationByObj(Ctrelation obj);
	/**
	 * 通过Ctrelation的id获得Ctrelation对象
	 * @param id
	 * @return
	 */
    Ctrelation selectCtrelationById(Integer id);
	/**
	 * 插入Ctrelation到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCtrelation(Ctrelation value);
	/**
	 * 插入Ctrelation中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCtrelation(Ctrelation value);
	/**
	 * 通过Ctrelation的id删除Ctrelation
	 * @param id
	 * @return
	 */
    int deleteCtrelationById(Integer id);
	/**
	 * 通过Ctrelation的id更新Ctrelation中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCtrelationById(Ctrelation enti);
	/**
	 * 通过Ctrelation的id更新Ctrelation中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCtrelationById(Ctrelation enti);
}