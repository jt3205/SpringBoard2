package com.jt3205.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jt3205.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.jt3205.mapper.UserMapper";
	
	@Override
	public String getTime(){
		return sqlSession.selectOne(namespace + ".getTime");
	}
	
	@Override
	public void insertUser(UserVO vo){
		sqlSession.insert(namespace + ".insertUser", vo);
	}

	@Override
	public UserVO readUser(String uid) throws Exception {
		return (UserVO) sqlSession.selectOne(namespace + ".selectUser", uid);
	}
	
	@Override
	public UserVO readWithPw(String uid, String pw) throws Exception {
		Map<String, Object> paramMap = new HashMap<String,Object>();
		
		paramMap.put("uid", uid);
		paramMap.put("upw", pw);
		
		return sqlSession.selectOne(namespace + ".readWithPW", paramMap);
	}

}
