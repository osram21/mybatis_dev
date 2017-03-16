package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.CourseService;

public class CourseServiceTest {
	private static CourseService courseService;
	@BeforeClass
	   public static void setUpBeforeClass() throws Exception {
	      courseService = CourseService.getInstance();
	   }

	   @AfterClass
	   public static void tearDownAfterClass() throws Exception {
	      courseService = null;
	   }

	   @Test
	   public void testSearchCourse() {
		   Map<String, Object> param = new HashMap<>();
		   param.put("tutorId",1);
		   param.put("courseName", "%java%");
		   param.put("startDate", "2013-01-01");
		   param.put("endDate", "2013-05-01");
		   List<Course> searchCourse = courseService.searchCourse(param);
		   Assert.assertNotNull(searchCourse);
	   }
	   
	   @Test
	   public void testSearchChooseCourse() {
		   Map<String, Object> map = new HashMap<String,Object>();
		   map.put("searchBy", "Tutor");
		   map.put("tutorId", 1);
		   List<Course> searchChooseCourse = courseService.searchChooseCourse(map);
		   Assert.assertNotNull(searchChooseCourse);
	   }
	   
	  @Test
	   public void testSearchWhereCourse() {
		   Map<String, Object> map = new HashMap<String,Object>();
		   map.put("tutorId",1);
		   
		   List<Course> searchWhereCourse = courseService.searchWhereCourse(map);
		   Assert.assertNotNull(searchWhereCourse);
	   }
	  
	  @Test
	   public void testSearchTrimCourse() {
		   Map<String, Object> map = new HashMap<String,Object>();
		   map.put("tutorId",1);
		   map.put("courseName", "%java%");
		   List<Course> searchTrimCourse = courseService.searchTrimCourse(map);
		   Assert.assertNotNull(searchTrimCourse);
	   }
	  
	 /* @Test
	   public void testSearchForeachCourseByTutors() {
		   List<Integer> tutorIds = new ArrayList<Integer>();
		   tutorIds.add(1);
		   tutorIds.add(2);
		   Map<String, Object> map = new HashMap<String,Object>();
		   map.put("tutorIds",tutorIds);
		   map = null;
		   List<Course> searchForeachCourseByTutors = courseService.searchForeachCourseByTutors(map);
		   Assert.assertNotNull(searchForeachCourseByTutors);
	   }*/

}
