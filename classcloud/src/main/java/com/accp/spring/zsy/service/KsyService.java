package com.accp.spring.zsy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.Book;
import com.accp.spring.pojo.ExamPaper;
import com.accp.spring.pojo.ExamPaperHistory;
import com.accp.spring.pojo.ExamPaperKnowledge;
import com.accp.spring.pojo.Examination;
import com.accp.spring.pojo.Grade;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.PaperTitle;
import com.accp.spring.pojo.QuesOption;
import com.accp.spring.pojo.Question;
import com.accp.spring.pojo.StuTest;
import com.accp.spring.pojo.Student;
import com.accp.spring.pojo.Teacher;
import com.accp.spring.zsy.mapper.KsyMapper;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Courses;
import com.accp.spring.zsy.pojo.Ctrelations;
import com.accp.spring.zsy.pojo.ExamPaperHistorys;
import com.accp.spring.zsy.pojo.ExamPapers;
import com.accp.spring.zsy.pojo.Examinations;
import com.accp.spring.zsy.pojo.Questions;
import com.accp.spring.zsy.pojo.Sjtmzsd;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import io.lettuce.core.dynamic.annotation.Param;

@Service
public class KsyService {
	
	@Autowired
	KsyMapper ksyMapper;
	
	 
	
	public List<Grade> cxgrade(){
		return this.ksyMapper.cxgrade();
	}
	
	@Transactional
	public List<Books> cxBook(int gId){
		List<Books> book=this.ksyMapper.cxBook(gId);
		  
		  for (Books books : book) {
			  int bookId=books.getBookId();
			   books.setListc(this.ksyMapper.cxCourse(bookId));
			   for (Courses course : books.getListc()) {
				   int courseId=course.getCourseId();
					 System.out.println(courseId);
					 course.setListk(this.ksyMapper.cxKnowledge(courseId));
			   }
		  }
		
		return book;
	}
	
	@Transactional
	public List<Books> cxBooks(){
		List<Books> book=this.ksyMapper.cxBooks();
		
		for (Books books : book) {
			  int bookId=books.getBookId();
			   books.setListc(this.ksyMapper.cxCourse(bookId));
			   for (Courses course : books.getListc()) {
				   int courseId=course.getCourseId();
					 System.out.println(courseId);
					 course.setListk(this.ksyMapper.cxKnowledge(courseId));
			   }
		  }
		
		return book;
	}
	
	
	public Teacher dl(String teaUserName,String teaPwd) {
		return this.ksyMapper.dl(teaUserName, teaPwd);
	}
	
	@Transactional
	public int xztmwt(Question question) {
		this.ksyMapper.xztmwt(question);
		int teaId=question.getTeaId();
		Question q=this.ksyMapper.cxxzdtmid(teaId);
		return q.getQtId();
	}
	
	public int xztmjx(Analyze analyze) {
		
		return this.ksyMapper.xztmjx(analyze);
	}
	
	public int xztmxx(QuesOption quesOption) {
		return this.ksyMapper.xztmxx(quesOption);
	}
	
	public PageInfo<Questions> cxtk(int pageIndex){
		PageHelper.startPage(pageIndex, 8);
		List<Questions> questions=this.ksyMapper.cxtktm();		
		PageInfo<Questions> pageInfo=new PageInfo<Questions>(questions);
		System.err.println(pageInfo);
		return pageInfo;
	}
	
	public int sctm(int qtid) {
		return this.ksyMapper.sctm(qtid);
	}
	
	public Question cxdgst(int qtid) {
		return this.ksyMapper.cxdgst(qtid);
	}
	
	public List<QuesOption> cxxx(int qtid){
		return this.ksyMapper.cxxx(qtid);
	}
	
	public Analyze cxjx(int qtid,int uid) {
		return this.ksyMapper.cxjx(qtid, uid);
	}
	
	public int xgtm(Question question) {		
		return this.ksyMapper.xgtm(question);
	}
	
	public int xgxx(String xb,String nr,int isRight,int opId) {
		return this.ksyMapper.xgxx(xb,nr,isRight,opId);
	}
	public int xgjx(Analyze analyze) {
		return this.ksyMapper.xgjx(analyze);
	}
	public int cxdgxx(int xxid) {
		return this.ksyMapper.cxdgxx(xxid);
	}
	public int scxx(int xxid) {
		return this.ksyMapper.scxx(xxid);
	}

	public List<ExamPapers> cxksmb(){
		return this.ksyMapper.cxksmb();
	}
	
	public List<Book> cxsyBook(){
		return this.ksyMapper.cxsyBook();
	}
	
	public List<Courses> cxCourse(int bookId){
		return this.ksyMapper.cxCourse(bookId);
	}
	
	public List<Knowledge> cxKnowledge(int courseId){
		return this.ksyMapper.cxKnowledge(courseId);
	}
	
	public int xzksmb(ExamPaper examPaper) {
		int uid=examPaper.getTeaId();
		this.ksyMapper.xzksmb(examPaper);
		return this.ksyMapper.cxxzmbid(uid);
	}
	
	public int xzsj(ExamPaperHistory sj) {
		int uid=sj.getCreatePerson();
		this.ksyMapper.xzsj(sj);
		return this.ksyMapper.cxxzsjid(uid);
	}
	
	public int xzks(Examination examination) {
		return this.ksyMapper.xzks(examination);
	}

	public List<Questions> sjcxtm(String zsdid,int sum){
		return this.ksyMapper.sjcxtm(zsdid, sum);
	}
	
	public int xzsjtm(PaperTitle paperTitle) {
		return this.ksyMapper.xzsjtm(paperTitle);
	}
	
	public int xzmbgx(ExamPaperKnowledge mbgx) {
		return this.ksyMapper.xzmbgx(mbgx);
	}
	
	public List<Ctrelations> cxtbj(int uid) {
		return this.ksyMapper.cxtbj(uid);
	}
	
	public PageInfo<ExamPaperHistorys> cxsysj(int pageIndex,int pageSize){
		PageHelper.startPage(pageIndex, pageSize);
		List<ExamPaperHistorys> ep=this.ksyMapper.cxsysj();
		PageInfo<ExamPaperHistorys> pageInfo=new PageInfo<ExamPaperHistorys>(ep);
		return pageInfo;
	}
	
	public ExamPaperHistorys cxygsj( int sjid) {
		return this.ksyMapper.cxygsj(sjid);
	}
	
	public ExamPaper cxdgmb(int mbid) {
		return this.ksyMapper.cxdgmb(mbid);
	}
	
	public List<Sjtmzsd> cxsjtmzsd(int sjid){
		return this.ksyMapper.cxsjtmzsd(sjid);
	}
	
	@Transactional
	public List<Questions> cxsjtm(int sjid){	
		List<Questions> qs=this.ksyMapper.cxsjtm(sjid);
		for(Questions q:qs ) {
			int qtid=q.getQtId();
			q.setList(this.ksyMapper.cxxx(qtid));
		}
		return qs;
	}
	
	public PageInfo<Examinations> cxsyks(int pageIndex){
		PageHelper.startPage(pageIndex,8);
		List<Examinations> ea=this.ksyMapper.cxsyks();
		PageInfo<Examinations> pageInfo=new PageInfo<Examinations>(ea);
		return pageInfo;
	}
	
	public PageInfo<Examinations> cxwkks(String time,int pageSize){
		PageHelper.startPage(1,pageSize);
		List<Examinations> ea=this.ksyMapper.cxwkks(time);
		PageInfo<Examinations> pageInfo=new PageInfo<Examinations>(ea);
		return pageInfo;
	}
	
	public PageInfo<Examinations> cxzzjxks(String time,int pageSize){
		PageHelper.startPage(1,pageSize);
		List<Examinations> ea=this.ksyMapper.cxzzjxks(time);
		PageInfo<Examinations> pageInfo=new PageInfo<Examinations>(ea);
		return pageInfo;
	}
	
	@Transactional
	public int ghsjzsdtm(int zsdid,int sjid,int sum) {
		//查询试卷某个知识点中的题目
		List<Question> q=this.ksyMapper.cxsjdzsdtm(zsdid, sjid);
		String tmid="0,";
		for(Question l:q) {
			tmid=tmid+l.getQtId()+",";
			
			int qtId=l.getQtId();
			this.ksyMapper.scsjzsdyydtm(sjid, qtId);//删除试卷知识点中原有的题目
		}
		
		tmid+="0";
		
		System.err.println(tmid);
		
		
		//随机查询n个试卷某个知识点中没有的题目
		List<Question> qs=this.ksyMapper.cxsjzsdnottm(zsdid, tmid, sum);
			
		PaperTitle paperTitle=new PaperTitle();
		paperTitle.setExamId(sjid);
		
		System.err.println(qs);
		
		for(Question s:qs) {
						
			paperTitle.setQtId(s.getQtId());
			//新增试卷知识点中没有的题目
			this.ksyMapper.xzsjtm(paperTitle);
		}

		return 1;
	}
	
	@Transactional
	public int ghsjzsd(int jzsdid,int xzsdid,int sum,int sjid) {
		//查询试卷知识点中的题目
		int zsdid=jzsdid;
		List<Question> q=this.ksyMapper.cxsjdzsdtm(zsdid, sjid);

		for(Question l:q) {
		
			int qtId=l.getQtId();
			this.ksyMapper.scsjzsdyydtm(sjid, qtId);//删除试卷知识点中的题目
			
		}
	
		//查询我更换的知识点的题目
		 zsdid=xzsdid;
		List<Questions> qs=this.ksyMapper.sjcxtm(Integer.toString(zsdid),sum);
		
		PaperTitle paperTitle=new PaperTitle();
		paperTitle.setExamId(sjid);
		
		for(Questions l:qs) {
			
			paperTitle.setQtId(l.getQtId());
			//新增跟换的知识点的题目
			this.ksyMapper.xzsjtm(paperTitle);
		}
		
		return 1;
	}
	
	public List<ExamPaperKnowledge> cxsjmb(int mbid){
		return this.ksyMapper.cxsjmb(mbid);
	}
	
	public int xzksryxx(StuTest stuTest) {
		return this.ksyMapper.xzksryxx(stuTest);
	}
	
	@Transactional
	public int cxcjksxy(String xsid,int sjid,String kssj,String jssj){
		List<Student> stu=this.ksyMapper.cxcjksxy(xsid);
		StuTest stuTest=new StuTest();
		stuTest.setExamId(sjid);
		stuTest.setStatus(1);
		stuTest.setStartTime(kssj);
		stuTest.setCommitTime(jssj);
		stuTest.setCommitStyle(0);
		stuTest.setScore(0);
		
		for(Student l:stu) {
			
			stuTest.setStuId(l.getStuId());
			this.ksyMapper.xzksryxx(stuTest);
			
		}
		return 1;
	}
	
	public Examinations cxycks(int ksid) {
		return this.ksyMapper.cxycks(ksid);
	}
	
	public int xgksxx(Examinations ks) {
		return this.ksyMapper.xgksxx(ks);
	}
}
