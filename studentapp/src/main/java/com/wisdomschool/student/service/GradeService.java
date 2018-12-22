package com.wisdomschool.student.service;
import java.util.List;
import com.wisdomschool.student.mapper.GradeMapper;
import com.wisdomschool.student.pojo.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GradeService {
    @Autowired
    private GradeMapper gradeMapper;
    
    public long getGradeRowCount(){
        return gradeMapper.getGradeRowCount();
    }
    
    public List<Grade> selectGrade(){
        return gradeMapper.selectGrade();
    }
    
    public Grade selectGradeByObj(Grade obj){
        return gradeMapper.selectGradeByObj(obj);
    }
    
    public Grade selectGradeById(Integer id){
        return gradeMapper.selectGradeById(id);
    }
    
    public int insertGrade(Grade value){
        return gradeMapper.insertGrade(value);
    }
    
    public int insertNonEmptyGrade(Grade value){
        return gradeMapper.insertNonEmptyGrade(value);
    }
    
    public int deleteGradeById(Integer id){
        return gradeMapper.deleteGradeById(id);
    }
    
    public int updateGradeById(Grade enti){
        return gradeMapper.updateGradeById(enti);
    }
    
    public int updateNonEmptyGradeById(Grade enti){
        return gradeMapper.updateNonEmptyGradeById(enti);
    }

    public GradeMapper getGradeMapper() {
        return this.gradeMapper;
    }

    public void setGradeMapper(GradeMapper gradeMapper) {
        this.gradeMapper = gradeMapper;
    }

}