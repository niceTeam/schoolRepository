package com.wisdomschool.student.service;
import java.util.List;
import com.wisdomschool.student.mapper.ClassesMapper;
import com.wisdomschool.student.pojo.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClassesService {
    @Autowired
    private ClassesMapper classesMapper;
    
    public long getClassesRowCount(){
        return classesMapper.getClassesRowCount();
    }
    
    public List<Classes> selectClasses(){
        return classesMapper.selectClasses();
    }
    
    public Classes selectClassesByObj(Classes obj){
        return classesMapper.selectClassesByObj(obj);
    }
    
    public Classes selectClassesById(Integer id){
        return classesMapper.selectClassesById(id);
    }
    
    public int insertClasses(Classes value){
        return classesMapper.insertClasses(value);
    }
    
    public int insertNonEmptyClasses(Classes value){
        return classesMapper.insertNonEmptyClasses(value);
    }
    
    public int deleteClassesById(Integer id){
        return classesMapper.deleteClassesById(id);
    }
    
    public int updateClassesById(Classes enti){
        return classesMapper.updateClassesById(enti);
    }
    
    public int updateNonEmptyClassesById(Classes enti){
        return classesMapper.updateNonEmptyClassesById(enti);
    }

    public ClassesMapper getClassesMapper() {
        return this.classesMapper;
    }

    public void setClassesMapper(ClassesMapper classesMapper) {
        this.classesMapper = classesMapper;
    }

}