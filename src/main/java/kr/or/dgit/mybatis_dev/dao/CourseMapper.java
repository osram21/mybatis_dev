package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Course;

public interface CourseMapper {
	List<Course> searchCourse(Map<String, Object>param);
	List<Course> searchChooseCourse(Map<String, Object>map);
	List<Course> searchWhereCourse(Map<String, Object>map);
	List<Course> searchTrimCourse(Map<String, Object>map);
	List<Course> searchForeachCourseByTutors(Map<String, Object>map);
}
