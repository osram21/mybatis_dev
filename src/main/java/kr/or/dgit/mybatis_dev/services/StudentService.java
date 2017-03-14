package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.StudentMapper";
	
	public Student selectStudentByNoforResultMap(Student student){
		log.debug("selectStudentByNoforResultMap");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoforResultMap", student);
		}
	}
	
	public List<Student> selectStudentByAllforResultMap(){
		log.debug("selectStudentByAllforResultMap");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllforResultMap();
		}
	}
	
	public Map<String,Object> selectStudentByNoforHashMap(Student student){
		log.debug("selectStudentByNoforHashMap");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoforHashMap", student);
		}
	}
	
	public List<Map<String,Object>> selectStudentByAllforHashMap(){
		log.debug("selectStudentByAllforHashMap");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace+".selectStudentByAllforHashMap");
		}
	}
	
	public Student selectStudentByNoforWithAddress(Student student){
		log.debug("selectStudentByNoforWithAddress");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoforWithAddress",student);
		}
	}
	
	public Student selectStudentByNoAssociationAddress(Student student){
		log.debug("selectStudentByNoAssociationAddress");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".selectStudentByNoAssociationAddress", student);
		}
	}
}
