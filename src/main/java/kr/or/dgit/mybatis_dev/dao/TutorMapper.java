package kr.or.dgit.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.Tutors;

public interface TutorMapper {
	Tutors findTutorById(int id);
}
