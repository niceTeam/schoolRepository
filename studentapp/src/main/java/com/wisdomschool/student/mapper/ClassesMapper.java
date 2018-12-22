package com.wisdomschool.student.mapper;
import com.wisdomschool.student.pojo.Classes;
import java.util.List;
public interface ClassesMapper{
	/**
	 * 获得Classes数据的总行数
	 * @return
	 */
    long getClassesRowCount();
	/**
	 * 获得Classes数据集合
	 * @return
	 */
    List<Classes> selectClasses();
	/**
	 * 获得一个Classes对象,以参数Classes对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Classes selectClassesByObj(Classes obj);
	/**
	 * 通过Classes的id获得Classes对象
	 * @param id
	 * @return
	 */
    Classes selectClassesById(Integer id);
	/**
	 * 插入Classes到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertClasses(Classes value);
	/**
	 * 插入Classes中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyClasses(Classes value);
	/**
	 * 通过Classes的id删除Classes
	 * @param id
	 * @return
	 */
    int deleteClassesById(Integer id);
	/**
	 * 通过Classes的id更新Classes中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateClassesById(Classes enti);
	/**
	 * 通过Classes的id更新Classes中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyClassesById(Classes enti);
}