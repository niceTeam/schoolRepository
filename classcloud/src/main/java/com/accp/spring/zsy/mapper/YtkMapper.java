package com.accp.spring.zsy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.pojo.Analyze;
import com.accp.spring.pojo.Appraise;
import com.accp.spring.pojo.BrushHistory;
import com.accp.spring.pojo.BrushHistoryDetails;
import com.accp.spring.pojo.Classes;
import com.accp.spring.pojo.CourseProgress;
import com.accp.spring.pojo.Knowledge;
import com.accp.spring.pojo.KnowledgeProgress;
import com.accp.spring.pojo.MyCollection;
import com.accp.spring.pojo.QuesOption;
import com.accp.spring.pojo.Question;
import com.accp.spring.pojo.StuAnswer;
import com.accp.spring.pojo.Student;
import com.accp.spring.zsy.pojo.Analyzes;
import com.accp.spring.zsy.pojo.Bookjd;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Coursejd;
import com.accp.spring.zsy.pojo.Errors;
import com.accp.spring.zsy.pojo.Examinations;
import com.accp.spring.zsy.pojo.Knowledgejd;
import com.accp.spring.zsy.pojo.Questions;
import com.accp.spring.zsy.pojo.Students;

public interface YtkMapper {
	
	//登陆
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
	@Select("SELECT q.*,c.collectId as sfsc  FROM `question` q left join `collection` c on c.qtId=q.qtId and c.stuId=#{xid}  where q.knowid in(${zsdid})  and isDel=1 and q.qtId not in(select bh.qtId from BrushHistoryDetails bh,`brushhistory` b where bh.bhState=1 and b.bhId=b.bhId and b.stuId=#{xid})  ORDER BY RAND() LIMIT #{sum}")
	List<Questions> sjcxtm(@Param("zsdid")String zsdid,@Param("sum") int sum,@Param("xid") int xid);
	
	//查询题目答案
	@Select("SELECT * FROM `quesoption` where qtid=#{qtid}")
	List<QuesOption> cxtmdaan(@Param("qtid")int qtid);
	
	//查询章节的知识点
	@Select("SELECT * FROM `Knowledge` where courseId=#{courseId}")
	List<Knowledge> cxzsd(@Param("courseId")int courseId);
	
	//查询课程的知识点
	@Select("SELECT * FROM `Knowledge` k,`course` c WHERE k.courseId=c.courseId AND c.bookId=#{bookId}")
	List<Knowledge> cxkczsd(@Param("bookId")int bookId);
	
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
	@Insert("INSERT INTO `brushhistorydetails` (`bhId`,`qtId`,`rightAnswer`,`stuAnswer`,bhState)VALUES(#{bhId},#{qtId},#{rightAnswer},#{stuAnswer},1)")
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
	
	//查询章节的题目数量
	@Select("select count(*) from `course` c,`knowledge` k,`question` q where k.courseId=c.courseId and q.knowId=k.knowId and c.courseId=#{zjid}")
	int cxzjtmsl(@Param("zjid")int zjid);
	
	//查询我刷过的章节题目的数量
	@Select("select count(*) from `brushhistory` b,`brushhistorydetails` bh,`question` q,`knowledge` k,`course` c where b.bhId=bh.bhId and q.qtId=bh.qtId and q.knowId=k.knowId and k.courseId=c.courseId and bhState=1 and b.stuId=#{stuId} and k.courseId=#{zjid}")
	int cxwsgdzjtm(@Param("zjid")int zjid,@Param("stuId")int stuId);
	
	//查询知识点的题目数量
	@Select("select count(*) from `knowledge` k,`question` q where q.knowId=k.knowId and k.knowId=#{zsdid}")
	int cxzsdtmsl(@Param("zsdid")int zsdid);
	
	//查询我刷过的知识点的题目的数量
	@Select("select count(*) from `brushhistory` b,`brushhistorydetails` bh,`question` q,`knowledge` k where b.bhId=bh.bhId and q.qtId=bh.qtId and q.knowId=k.knowId and bh.bhState=1 and  b.stuId=#{stuId} and k.knowId=#{zsdid}")
	int cxwsgdzsdtm(@Param("zsdid")int zsdid,@Param("stuId")int stuId);
	
	//查询我刷过的章节下的知识点id
	@Select("select q.knowId from `brushhistory` b,`brushhistorydetails` bh,`question` q,`knowledge` k,`course` c where b.bhId=bh.bhId and q.qtId=bh.qtId and q.knowId=k.knowId and k.courseId=c.courseId and b.stuId=#{stuId} and k.courseId=#{zjid} group by q.knowId")
	List<Knowledge> cxzjxdzsd(@Param("zjid")int zjid,@Param("stuId")int stuId);
	
	//查询我刷过的章节的题目id
	@Select("select bh.qtid from `brushhistory` b,`brushhistorydetails` bh,`question` q,`knowledge` k,`course` c where b.bhId=bh.bhId and q.qtId=bh.qtId and q.knowId=k.knowId and k.courseId=c.courseId and bh.bhState=1 and b.stuId=#{stuId} and k.courseId=#{zjid}")
	List<QuesOption> wsgdzjtmid(@Param("zjid")int zjid,@Param("stuId")int stuId);
		
	//修改刷题明细的题目状态
	@Update("update brushhistorydetails set bhState=2 where qtId=#{tmid}")
	int xgstmxzt(@Param("tmid")int tmid);
	
	
	//查询我刷过的知识点的题目id
	@Select("select bh.qtid from `brushhistory` b,`brushhistorydetails` bh,`question` q,`knowledge` k where b.bhId=bh.bhId and q.qtId=bh.qtId and q.knowId=k.knowId and bh.bhState=1 and b.stuId=#{stuId} and k.knowId=#{knowId}")
	List<QuesOption> wsgdzsdtmid(@Param("knowId")int knowId,@Param("stuId")int stuId);
	
	//查询知识点的章节
	@Select("select c.courseId from`knowledge` k,`course` c where k.courseId=c.courseId and k.knowId=#{knowId} group by c.courseId")
	int cxzsddzjid(@Param("knowId")int knowId);
	
	//查询最近一次的刷题历史的详细
	@Select("SELECT * FROM `brushhistorydetails` bh WHERE bh.bhid = (SELECT b.bhid FROM `brushhistory` b WHERE b.`stuId`=#{stuId} ORDER BY b.bhid DESC LIMIT 1)")
	List<BrushHistoryDetails> cxzjsdct(@Param("stuId")int stuId);
	
	//根据答题历史id查询题目
	@Select("SELECT * FROM `brushhistorydetails` WHERE bhid=#{bhId}")
	List<BrushHistoryDetails> cxsttm(@Param("bhId")int bhId);
	
	//查询错题
	@Select("SELECT * FROM  `error` WHERE stuId=#{stuId}")
	List<Errors> cxct(@Param("stuId")int stuId);
	
	//修改错题	
	@Update("update `error` set recentlyAnswer=#{stuAnswer},errorCount=errorCount+1,lastAnswerTime=now() Where qtId=#{qtId} and stuId=#{stuId}")
	int xgct(@Param("stuId")int stuId,@Param("qtId")int qtId,@Param("stuAnswer")String stuAnswer);
	
	//错题新增
	@Insert("INSERT INTO `schoolmanage`.`error` (`qtId`,`stuId`,`recentlyAnswer`,`errorCount`,`lastAnswerTime`)VALUES(#{qtId},#{stuId},#{recentlyAnswer},#{errorCount},NOW())")
	int ctxz(Errors error);
	
	//删除错题
	@Delete("delete from error where stuId=#{stuId} and qtId=#{qtId}")
	int scct(@Param("stuId")int stuId,@Param("qtId")int qtId);
	
	//查询最新一次刷题报告
	@Select("SELECT q.*,bh.rightAnswer,bh.stuAnswer,bh.bhId,b.endTime AS jiexi,b.knowName AS fbr,(SELECT c.collectId FROM `collection` c WHERE c.stuId=#{stuId} AND bh.qtId=c.qtId) AS sfsc FROM `brushhistorydetails` bh,`brushhistory` b,`question` q WHERE bh.bhid = (SELECT b.bhid FROM `brushhistory` b WHERE b.`stuId`=#{stuId} ORDER BY b.bhid DESC LIMIT 1) AND bh.qtid=q.qtid AND bh.bhId=b.bhId AND b.`stuId`=#{stuId}")
	List<Questions> cxzxstbg(@Param("stuId")int stuId);
	
	//查询解析
	@Select("SELECT a.*,t.`teaName`,s.`stuName` FROM `Analyze` a,`teacher` t,`student` s  WHERE a.`qtId`=#{qtId} AND a.`stuId`=t.`teaId` AND a.`stuId`=s.`stuId`")
	List<Analyzes> cxjx(@Param("qtId")int qtId);
	
	//新增解析
	@Insert("INSERT INTO `analyze` (`qtId`,`analyzeContent`,`stuId`,`analyzeTime`,`typeid`)VALUES(#{qtId},#{analyzeContent},#{stuId},NOW(),2);")
	int xzjx(Analyzes a);
	
	//修改解析点赞数量
	@Update("Update `analyze` set yes=#{yes},no=#{no} where analyzeId=#{jxid}")
	int xgjx(@Param("yes")int yes,@Param("no")int no,@Param("jxid")int jxid);
	
	//查询你是否点过赞或踩过
	@Select("SELECT * FROM `appraise` WHERE stuId=#{stuId} AND analyzeId=#{jxid}")
	Appraise sfdz(@Param("stuId")int stuId,@Param("jxid")int jxid);
	
	//新增点赞或踩
	@Insert("INSERT INTO `appraise` (`appraise`,`stuId`, `analyzeId`)VALUES(#{appraise}, #{stuId},#{analyzeId})")
	int xzdz(Appraise a);
	
	//修改点赞或踩
	@Update("update `appraise` set appraise=#{appraise} where stuId=#{stuId} AND analyzeId=#{jxid} ")
	int xgdz(@Param("stuId")int stuId,@Param("jxid")int jxid,@Param("appraise")int appraise);
	
	//查询学生的年级
	@Select("SELECT c.* FROM `student` s,`classes` c WHERE s.classId=c.classId AND s.stuId=#{stuId}")
	Classes cxxsnj(@Param("stuId")int stuId);
	
	//查询我的统一测试
	@Select("select ea.*,eh.paperName,t.teaName,(SELECT count(*)FROM  `papertitle` p where p.examId=eh.paperId)as tmsum,(SELECT ex.score*tmsum FROM `exampaper` ex where ex.epId=eh.epId) as zscore from `examination` ea,`exampaperhistory` eh,`teacher` t,`stutest` s where ea.examPaperId=eh.paperId and t.teaid=ea.teaId  AND s.stuId=1 AND s.status NOT IN(3) and ea.classId LIKE '%${bjid}%' and endTime>NOW()")
	List<Examinations> cxwdtycs(@Param("bjid")String bjid,@Param("time")String time);
	
	//查询年级下的所有知识点
	@Select("SELECT * FROM `book` b,`course` c,`knowledge` k WHERE k.courseId=c.courseId AND c.bookid=b.bookid AND b.gId=#{gid}")
	List<Knowledge> cxnjxdzsd(@Param("gid")int gid);
	
	//查询当天的累计刷题数量
	@Select("SELECT bh.* FROM `brushhistorydetails` bh,`brushhistory` b WHERE bh.bhId=b.bhId AND b.startTime LIKE '%${time}%'")
	List<BrushHistoryDetails> cxljsum(@Param("time")String time);
	
	//查询当天的实际刷题数量
	@Select("SELECT bh.* FROM `brushhistorydetails` bh,`brushhistory` b WHERE bh.bhId=b.bhId AND b.startTime LIKE '%${time}%' GROUP BY qtId")
	List<BrushHistoryDetails> cxsjsum(@Param("time")String time);
	
	//正确率
	@Select("SELECT COUNT(*) FROM `brushhistorydetails` bh,`brushhistory` b WHERE bh.bhId=b.bhId AND b.startTime LIKE '%${time}%' AND bh.rightAnswer=bh.stuAnswer")
	int cxzql(@Param("time")String time);
	
	//新增学员考试答案
	@Insert("INSERT INTO `stuanswer` (`examId`,`qtId`,`stuId`,`saAnswer`)VALUES(#{examId},#{qtId},#{stuId},#{saAnswer})")
	int xzksdaan(StuAnswer da);
	
	//修改考试人员及考试情况表
	@Update("update `stutest` set status=3,startTime=#{kssj},commitTime=NOW(),commitStyle=#{jjfs},score=#{score} where stuId=#{stuid} and examId=#{ksid}")
	int xgksryqk(@Param("kssj")String kssj,@Param("jjfs")int jjfs,@Param("score")int score,@Param("stuid")int stuid,@Param("ksid")int ksid);
	
	//查询考试报告
	@Select("SELECT q.*,(SELECT c.collectId FROM `collection` c WHERE c.stuId=#{stuid} AND p.qtId=c.qtId) AS sfsc,s.saAnswer as stuAnswer,s.`examId` FROM `papertitle` p,`question` q,`examination` a,`stuanswer` s WHERE a.examPaperId=p.examId AND a.`examId`=s.examId AND s.qtId=q.qtId AND p.qtid=q.qtid AND p.examId=#{sjid} AND s.`stuId`=#{stuid}")
	List<Questions> cxsjtm(@Param("sjid")int sjid,@Param("stuid")int stuid);
	
	//查询每个课程收藏的题目数量
	@Select("SELECT bs.*,(SELECT COUNT(*) FROM `book` b,`course` c,`knowledge` k,`question` q,`collection` cl WHERE cl.qtId=q.qtId AND q.knowId=k.knowId AND k.courseId=c.courseId AND c.bookId=b.bookId AND b.`bookId`=bs.bookId AND stuId=#{stuid}) AS SUM FROM `book` bs WHERE bs.gid=#{njid}")
	List<Books> cxkcsttm(@Param("stuid")int stuid,@Param("njid")int njid);
	
	//查询单个课程下所收藏的题目
	@Select("SELECT q.*,(SELECT ce.collectId FROM `collection` ce WHERE ce.stuId=#{stuid} AND q.qtId=ce.qtId) as sfsc FROM `book` b,`course` c,`knowledge` k,`question` q,`collection` cl WHERE cl.qtId=q.qtId AND q.knowId=k.knowId AND k.courseId=c.courseId AND c.bookId=b.bookId AND b.bookid=#{bookid} and stuId=#{stuid}")
	List<Questions> cxkcscid(@Param("stuid")int stuid,@Param("bookid")int bookid);
	
	
	//查询课程错题数量
	@Select("SELECT bs.*,(SELECT COUNT(*) FROM `book` b,`course` c,`knowledge` k,`question` q,`error` e WHERE e.qtId=q.qtId AND q.knowId=k.knowId AND k.courseId=c.courseId AND c.bookId=b.bookId AND b.`bookId`=bs.bookId AND stuId=#{stuid})AS SUM FROM `book` bs WHERE bs.gid=#{njid}")
	List<Books> cxkcctsl(@Param("stuid")int stuid,@Param("njid")int njid);
	
	//查询课程错题
	@Select("SELECT q.*,e.recentlyAnswer FROM `book` b,`course` c,`knowledge` k,`question` q,`error` e WHERE e.qtId=q.qtId AND q.knowId=k.knowId AND k.courseId=c.courseId AND c.bookId=b.bookId AND b.bookid=#{bookid} AND stuId=#{stuid}")
	List<Questions> cxkcct(@Param("stuid")int stuid,@Param("bookid")int bookid);
	
	
}
