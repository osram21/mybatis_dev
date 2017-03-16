package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentMapper {
	Student selectStudentByNoforResultMap(Student student);
	List<Student> selectStudentByAllforResultMap();
	
	Map<String,Object> selectStudentByNoforHashMap(Student student);
	List<Map<String,Object>> selectStudentByAllforHashMap();
	
	Student selectStudentByNoforWithAddress(Student student);
	
	Student selectStudentByNoAssociationAddress(Student student);
	
	int insertStudent(Student student);
	int updateSetStudent(Student student);
}