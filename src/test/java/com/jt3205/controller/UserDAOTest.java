package com.jt3205.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jt3205.domain.UserVO;
import com.jt3205.persistence.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDAOTest {
	@Inject
	private UserDAO dao;
	
	//@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime());
	}
	
	//@Test
	public void testInsertUser() throws Exception {
		UserVO vo = new UserVO();
		vo.setUid("test");
		vo.setUpw("1234");
		vo.setUname("테슼트");
		vo.setUpoint(0);
		dao.insertUser(vo);
	}
	
	@Test
	public void testReadUser() throws Exception {
		UserVO temp = dao.readUser("test");
		System.out.println(temp.toString());
	}
	
	@Test
	public void testReadWithPW() throws Exception {
		UserVO temp = dao.readWithPw("test", "1234");
		System.out.println(temp.toString());
	}

}
