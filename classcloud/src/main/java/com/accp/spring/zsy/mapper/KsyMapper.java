package com.accp.spring.zsy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
import com.accp.spring.pojo.Teacher;
import com.accp.spring.zsy.pojo.Books;
import com.accp.spring.zsy.pojo.Courses;
import com.accp.spring.zsy.pojo.Ctrelations;
import com.accp.spring.zsy.pojo.ExamPaperHistorys;
import com.accp.spring.zsy.pojo.ExamPapers;
import com.accp.spring.zsy.pojo.Questions;
import com.accp.spring.zsy.pojo.Sjtmzsd;


public interface KsyMapper {
	
	//查询年级
	@Select("Select * from Grade")
	List<Grade> cxgrade(); 
	
	//查询课程
	@Select("Select * from Book where gId=#{gId}")
	List<Books> cxBook(@Param("gId")int gId);

	
	//查询所有课程
	@Select("Select * from Book")
	List<Book> cxsyBook();
	
	//查询章节
	@Select("Select * from Course where bookId=#{bookId}")
	List<Courses> cxCourse(@Param("bookId")int bookId);
	
	//查询知识点
	@Select("Select * from Knowledge where courseId=#{courseId}")
	List<Knowledge> cxKnowledge(@Param("courseId")int courseId);
	
	//查询账号密码是否正确
	@Select("Select * from teacher where teaUserName=#{teaUserName} and teaPwd=#{teaPwd}")
	Teacher dl(@Param("teaUserName")String teaUserName,@Param("teaPwd")String teaPwd);

	//新增题目问题
	@Insert("insert into `schoolmanage`.`question` (`QtQuest`, `knowId`, `QtSendTime`, `teaId`, `privary`, `isDel`,`idDouble`)\r\n" + 
			"	values(#{qtQuest},#{knowId}, NOW(),#{teaId}, 2, 1,#{idDouble})")
	int xztmwt(Question question);
	
	//新增题目选项
	@Insert("insert into `schoolmanage`.`quesoption` (`qtId`, `opORder`, `rightOption`, `isRight`)values(#{qtId},#{opORder},#{rightOption},#{isRight})")
	int xztmxx(QuesOption quesOption);
	
	//新增题目解析
	@Insert("insert into `schoolmanage`.`analyze` (`qtId`, `analyzeContent`, `stuId`, `analyzeTime`)values(#{qtId},#{analyzeContent},#{stuId},NOW())")
	int xztmjx(Analyze analyze);
	
	//查询题库题目
	@Select("Select q.qtId,q.qtQuest,q.idDouble,k.knowName as zsd,q.qtSendTime,t.teaName as fbr,t.teaId from `question` q,`Knowledge` k,`teacher` t where q.knowId=k.knowId and q.teaId=t.teaId and q.isDel=1")
	List<Questions> cxtktm();
	
	//查询新增题目的id
	@Select("SELECT * FROM `question` WHERE teaId=#{teaId} ORDER BY qtId DESC LIMIT 1")
	Question cxxzdtmid(@Param("teaId")int teaId);
	
	//修改题目状态
	@Update("Update Question set isDel=2 where qtId=#{qtid} ")
	int sctm(@Param("qtid")int qtid);
	
	//根据id查询单个题目
	@Select("SELECT * FROM `question` WHERE qtId=#{qtid}")
	Question cxdgst(@Param("qtid")int qtid);
	
	//根据id查询题目选项
	@Select("SELECT * FROM QuesOption where qtId=#{qtid}")
	List<QuesOption> cxxx(@Param("qtid")int qtid);

	//根据id查询题目解析
	@Select("SELECT * FROM `analyze` where qtId=#{qtid} and stuId=#{uid}")
	Analyze cxjx(@Param("qtid")int qtid,@Param("uid")int uid);
	
	//修改题目
	@Update("Update Question set qtQuest=#{qtQuest},qtSendTime=NOW(),knowId=#{knowId} where qtId=#{qtId}")
	int xgtm(Question question);
	
	//修改选项
	@Update("Update QuesOption set opOrder=#{xb},rightOption=#{nr},IsRight=#{isRight} where opId=#{opId}")
	int xgxx(@Param("xb")String xb,@Param("nr")String nr,@Param("isRight")int isRight,@Param("opId")int opId);
	
	//修改解析
	@Update("Update `analyze` set analyzeContent=#{analyzeContent},analyzeTime=NOW() where analyzeId=#{analyzeId}")
	int xgjx(Analyze analyze);
	
	//删除选项
	@Delete("Delete from QuesOption where opId=#{xxid}")
	int scxx(@Param("xxid")int xxid);
	
	//查询单个选项
	@Select("SELECT COUNT(*) FROM QuesOption where opId=#{xxid}")
	int cxdgxx(@Param("xxid")int xxid);
	
	//查询考试模板
	@Select("SELECT * FROM ExamPaper e,`teacher` t,`grade` g where isForbid=1 and e.gid=g.gid and e.teaid=t.teaid")
	List<ExamPapers> cxksmb();
	
	//随机查询n道题目
	@Select("SELECT * FROM `question`  where knowid in(#{zsdid}) and isDel=1  ORDER BY RAND() LIMIT #{sum}")
	List<Questions> sjcxtm(@Param("zsdid")String zsdid,@Param("sum") int sum);
	
	//新增试卷模板
	@Insert("INSERT INTO `schoolmanage`.`exampaper` (`epName`,`score`,`testRange`,`teaId`,`epSendTime`,`gId`,`useCount`,`testTime`,`isForbid`)\r\n" + 
			"VALUES(#{epName},#{score},#{testRange},#{teaId},NOW(),#{gId},1,#{testTime},1)")
	int xzksmb(ExamPaper examPaper);
	
	//查询新增模板id
	@Select("SELECT epId FROM ExamPaper where teaId=#{uid} ORDER BY epId DESC LIMIT 1")
	int cxxzmbid(@Param("uid") int uid);
	
	//新增试卷
	@Insert("INSERT INTO `exampaperhistory` (`epId`,`paperName`,`useCount`,`createTime`,`lastUpdTime`,`lastUpdPerson`,`isForbid`,`createPerson`)\r\n" + 
			"VALUES(#{epId},#{paperName},1,NOW(),NOW(),#{lastUpdPerson},1,#{createPerson})")
	int xzsj(ExamPaperHistory sj);
	
	//查询新增试卷id
	@Select("SELECT paperId FROM `exampaperhistory` where createPerson=#{uid} ORDER BY paperId DESC LIMIT 1")
	int cxxzsjid(@Param("uid") int uid);
	
	//发布考试
	@Insert("insert into `examination` (`examPaperId`, `classId`,`teaId`,`epSendTime`, `tartTime`, `endTime`)\r\n" + 
			"values(#{examPaperId},#{classId},#{teaId},NOW(),#{startTime},#{endTime});")
	int xzks(Examination examination);
	
	//新增试卷题目
	@Insert("insert into `papertitle` (`qtId`,`examId`)values(#{qtId},#{examId})")
	int xzsjtm(PaperTitle paperTitle);
	
	//新增考试试卷模板与知识点关系表
	@Insert("insert into `exampaperknowledge` (`epId`, `knowId`, `count`)values(#{epId},#{knowId},#{count})")
	int xzmbgx(ExamPaperKnowledge mbgx);
	
	//查询老师带的班级
	@Select("select ct.*,c.cName from `ctrelation` ct,`classes` c where ct.classId=c.classId and ct.teaId=#{uid}")
	List<Ctrelations> cxtbj(@Param("uid") int uid);
	
	//查询所有试卷 
	@Select("select e.*,t.teaName,(SELECT count(*) FROM  `papertitle` p where p.examId=e.paperId)as tmsum,(SELECT ex.score*tmsum FROM `exampaper` ex where ex.epId=e.epId ) as score from `exampaperhistory` e,`teacher` t where e.createPerson=t.teaId and isForbid=1")
	List<ExamPaperHistorys> cxsysj();
	
	//查询试卷 
	@Select("select e.*,t.teaName,(SELECT count(*) FROM  `papertitle` p where p.examId=e.paperId)as tmsum,(SELECT ex.score*tmsum FROM `exampaper` ex where ex.epId=e.epId ) as score from `exampaperhistory` e,`teacher` t where e.createPerson=t.teaId and e.paperId=#{sjid} and isForbid=1")
	ExamPaperHistorys cxygsj(@Param("sjid") int sjid);
	
	//模糊查询试卷
	@Select("select e.*,t.teaName,(SELECT count(*) FROM  `papertitle` p where p.examId=e.paperId)as tmsum,(SELECT ex.score*tmsum FROM `exampaper` ex where ex.epId=e.epId ) as score from `exampaperhistory` e,`teacher` t where e.createPerson=t.teaId and isForbid=1 and (paperName like '%#{name}%' or createPerson like '%#{name}%')")
	List<ExamPaperHistorys> mhcxsj(@Param("name") String name);
	
	//查询单个模板
	@Select("select * from ExamPaper where epId=#{mbid}")
	ExamPaper cxdgmb(@Param("mbid")int mbid);
	
	//查询试卷题目的知识点和每个知识点题目的数量
	@Select("select k.knowId,count(*) as tmsum,k.knowName,ep.score from `papertitle` p,`question` q,`knowledge` k,ExamPaperHistory e,ExamPaper ep where e.paperId=p.examId and e.epId=ep.epId and p.qtid=q.qtid and k.knowId=q.knowId and p.examId=#{sjid} group by knowId")
	List<Sjtmzsd> cxsjtmzsd(@Param("sjid")int sjid);
	
	//查询试卷题目及答案解析
	@Select("select q.*,(select analyzeContent from `ANALYZE` a where a.qtId=p.qtId order by analyzeId )as jiexi from `papertitle` p,`question` q where p.qtid=q.qtid and p.examId=#{sjid}")
	List<Questions> cxsjtm(@Param("sjid")int sjid);
}
