package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public class UserMapperImpl implements UserPicMapper {
	private String Namespace ="kr.or.dgit.mybatis_dev.dao.UserPicMapper.";
	private static final Log log = LogFactory.getLog(UserMapperImpl.class);

	private SqlSession sqlSession;
	
	
	public UserMapperImpl(SqlSession sqlSession) {
		super();
		this.sqlSession = sqlSession;
	}

	@Override
	public int insertUserPic(UserPic userPic) {
		log.debug("insertUserPic()");
		return sqlSession.insert(Namespace+"insertUserPic", userPic);
	}

	@Override
	public UserPic selectUserPicById(int id) {
		log.debug("selectUserPicById()");
		return sqlSession.selectOne(Namespace+"selectUserPicById", id);
	}
}
