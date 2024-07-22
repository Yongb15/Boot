package com.korea.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.board.dao.BoardDAO;
import com.korea.board.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardDAO boardDAO;

	@Override
	public List<BoardVO> selectList(HashMap<String, Integer> map) {
		return boardDAO.selectList(map);
	}

	@Override
	public int getRowTotal() {
		return boardDAO.getRowTotal();
	}

	@Override
	public BoardVO selectOne(int idx) {
		return boardDAO.selectOne(idx);
	}

	@Override
	public int update_readhit(int idx) {
		return boardDAO.update_readhit(idx);
	}

	@Override
	public int insert(BoardVO vo) {
		return boardDAO.insert(vo);
	}



}






