package com.jt3205.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jt3205.domain.BoardVO;
import com.jt3205.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	@Inject
	private BoardDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	//@Test
	public void testCreate() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setTitle("새로운 글의 제목입니다.");
		vo.setContent("글 내용입니다! 글 내용입니다! 글 내용입니다! 글 내용입니다! 글 내용입니다! ");
		vo.setWriter("jt3205");
		dao.create(vo);
	}
	
	//@Test
	public void testRead() throws Exception {
		logger.info(dao.read(3).toString());
	}
	
	//@Test
	public void testGetList() throws Exception {
		List<BoardVO> voList = new ArrayList<BoardVO>();
		voList = dao.listAll();
		
		for(BoardVO vo : voList){
			logger.info(vo.toString());
		}
	}
	
	//@Test
	public void testUpdate() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setBno(3);
		vo.setTitle("수정된 제목입니다");
		vo.setContent("수정된 내용입니다. 이 내용은 수정되었습니다");
		dao.update(vo);
	}
	
	//@Test
	public void testDelete() throws Exception {
		dao.delete(3);
	}

}
