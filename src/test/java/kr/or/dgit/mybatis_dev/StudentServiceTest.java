package kr.or.dgit.mybatis_dev;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		studentService = null;
	}
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}

	
	////////////////////////////////////////
	@Test
	public void testselectStudentByNoforResultMap() {
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = studentService.selectStudentByNoforResultMap(student);
		Assert.assertNotNull(selectStudent);
	}
	
	@Test
	public void testselectStudentByAllforResultMap() {
		List<Student> lists = studentService.selectStudentByAllforResultMap();
		List<Student> emptyLists = Collections.emptyList();
		Assert.assertNotEquals(emptyLists, lists);
	}
	
}
