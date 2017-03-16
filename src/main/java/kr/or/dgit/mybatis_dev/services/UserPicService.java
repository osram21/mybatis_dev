package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dao.UserMapperImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static final Logger logger = Logger.getLogger(UserPicService.class);
	private static final UserPicService instance = new UserPicService();

	public static UserPicService getInstance() {
		return instance;
	}

	private UserPicService() {
	}

	public UserPic findUserPicById(int id) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			UserMapperImpl userPicMapper = new UserMapperImpl(sqlSession);
			UserPic userPic =  userPicMapper.selectUserPicById(id);
			sqlSession.commit();
			return userPic;
		}
	}

	public int insertUserPic(UserPic userPic) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			UserMapperImpl userPicMapper = new UserMapperImpl(sqlSession);
			int res = userPicMapper.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		}
	}
}
