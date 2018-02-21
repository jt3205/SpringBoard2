package com.jt3205.persistence;

import java.util.List;

import com.jt3205.domain.BoardVO;

public interface BoardDAO {

	// 글 작성
	public void create(BoardVO vo) throws Exception;

	// 글 읽기
	public BoardVO read(int bno) throws Exception;

	// 글 수정
	public void update(BoardVO vo) throws Exception;

	// 글 삭제
	public void delete(int bno) throws Exception;

	// 글 목록
	public List<BoardVO> listAll() throws Exception;
}
