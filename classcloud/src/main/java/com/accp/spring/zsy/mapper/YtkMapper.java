package com.accp.spring.zsy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.pojo.BrushHistory;
import com.accp.spring.pojo.BrushHistoryDetails;
import com.accp.spring.pojo.CourseProgress;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.KnowledgeProgress;
import com.accp.spring.pojo.MyCollection;
import com.accp.spring.pojo.QuesOption;
import com.accp.spring.pojo.Student;
import com.accp.spring.zsy.pojo.Bookjd;
import com.accp.spring.zsy.pojo.Coursejd;
import com.accp.spring.zsy.pojo.Knowledgejd;
import com.accp.spring.zsy.pojo.Questions;
import com.accp.spring.zsy.pojo.Students;

public interface YtkMapper {
	
	@Select("select * from Student where stuUserName=#{zh} and stuPwd=#{pwd}")
	Student dl(@Param("zh")String zh,@Param("pwd")String pwd);

	//查询所有课程
	@Select("Select * from Book where gId=#{gId}")
	List<Bookjd> cxBookjd(@Param("gId")int gId);
	
	//查询章节及进度
	@Select("select c.courseId,c.courseName,c.bookId,cp.percent from `course` c  left join  `courseprogress` cp on cp.courseId=c.courseId and cp.stuId=#{uid} where  c.bookId=#{bookId}")
	List<Coursejd> cxCoursejd(@Param("bookId")int bookId,@Param("uid") int uid);
	
	//查询知识点及进度
	@Select("select k.knowId,k.knowName,k.courseId,kp.percent from `knowledge` k left join `knowledgeprogress` kp on kp.knowId=k.knowId and kp.stuId=#{uid} where k.courseId=#{courseId}")
	List<Knowledgejd> cxKnowledgejd(@Param("courseId")int courseId,@Param("uid") int uid);
	
	//随机查询n道题目
	@Select("SELECT q.*,c.collectId as sfsc  FROM `question` q left join `collection` c on c.qtId=q.qtId and c.stuId=#{xid}  where q.knowid in(#{zsdid})  and isDel=1 and q.qtId not in(select b.qtId from BrushHistoryDetails b where bhState=1)  ORDER BY RAND() LIMIT #{sum}")
	List<Questions> sjcxtm(@Param("zsdid")String zsdid,@Param("sum") int sum,@Param("xid") int xid);
	
	//查询题目答案
	@Select("SELECT * FROM `quesoption` where qtid=#{qtid}")
	List<QuesOption> cxtmdaan(@Param("qtid")int qtid);
	
	//查询章节的知识点
	@Select("SELECT * FROM `Knowledge` where courseId=#{courseId}")
	List<Knowledge> cxzsd(@Param("courseId")int courseId);
	
	//添加收藏
	@Insert("insert into `collection` ( `stuId`, `qtId`, `collectTime`)values(#{stuId}, #{qtId},NOW())")
	int tjsc(MyCollection Collection);
	
	
	//取消收藏
	@Delete("Delete from collection where stuId=#{xid} and qtId=#{tmid} ")
	int qxsc(@Param("xid")int xid,@Param("tmid")int tmid);
	
	//查询我的收藏
	@Select("SELECT * FROM Collection where stuId=#{xid}")
	List<MyCollection> cxsctm(@Param("xid")int xid);
	
	//新增刷题明细
	@Insert("INSERT INTO `brushhistorydetails` (`bhId`,`qtId`,`rightAnswer`,`stuAnswer`)VALUES(#{bhId},#{qtId},#{rightAnswer},#{stuAnswer})")
	int xzstmx(BrushHistoryDetails stmx);
	
	//新增刷题纪录
	@Insert("insert into `brushhistory` (`stuId`, `knowName`, `isCommit`, `startTime`, `endTime`)values(#{stuId},#{knowName},#{isCommit},#{startTime},NOW())")
	int xzstjl(BrushHistory brushHistory);
	
	//查询新增刷题纪录的id
	@Select("SELECT bhId FROM BrushHistory where stuId=#{xid} ORDER BY bhId DESC limit 1")
	int cxstjlid(@Param("xid")int xid);
	
	//新增章节进度
	@Insert("insert into `courseprogress` (`stuId`, `courseId`, `percent`, `progressCount`)values(#{stuId},#{courseId},#{percent},#{progressCount})")
	int xzzjjd(CourseProgress courseProgress);
	
	//修改章节进度
	@Update("Update CourseProgress set percent=#{percent},progressCount=#{progressCount} where cpId=#{cpId}")
	int xgzjjd(@Param("cpId")int cpId,@Param("percent")int percent,@Param("progressCount")int progressCount);
	
	//查询章节进度
	@Select("SELECT * FROM CourseProgress where stuId=#{stuId} and courseId=#{courseId}")
	CourseProgress cxzjjd(@Param("stuId")int stuId,@Param("courseId")int courseId);
	
	//查询知识点进度
	@Select("SELECT * FROM KnowledgeProgress where stuId=#{stuId} and KnowId=#{knowId}")
	KnowledgeProgress cxzsdjd(@Param("stuId")int stuId,@Param("knowId")int knowId);
	
	//新增知识点进度
	@Insert("insert into `knowledgeprogress` (`stuId`, `knowId`, `percent`, `progressCount`)values(#{stuId},#{knowId},#{percent},#{progressCount})")
	int xzzsdjd(KnowledgeProgress zsdjd);
	
	//修改知识点进度
	@Update("Update KnowledgeProgress set percent=#{percent},progressCount=#{progressCount} where kpId=#{kpId}")
	int xgzsdjd(@Param("kpId") int kpId,@Param("percent") int percent, @Param("progressCount") int progressCount);
	
	//查询学生年级
	@Select("select s.*,g.gName,g.gId,c.cName from `student` s,`classes` c,`grade` g where s.classId=c.classId and g.gId=c.gId and s.stuId=#{xid}")
	Students cxxsbj(@Param("xid")int xid);
	
	
}
