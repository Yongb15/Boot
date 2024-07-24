package com.korea.board.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.board.vo.BoardVO;

@Mapper
public interface BoardMapper {

	//페이지별 게시물 조회
	public List<BoardVO> selectList(HashMap<String, Integer> map);
	
	//전체게시물조회
	public int getRowTotal();
	
	public BoardVO selectOne(int idx);
	
	public int update_readhit(int idx);
	
	public int insert(BoardVO vo);
	
	public int del_update(BoardVO vo);

	public int reply(BoardVO vo);

	public int board_update_step(BoardVO vo);
}
