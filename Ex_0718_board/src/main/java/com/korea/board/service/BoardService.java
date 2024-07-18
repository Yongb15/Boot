package com.korea.board.service;

import java.util.HashMap;
import java.util.List;

import com.korea.board.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> selectList(HashMap<String, Integer> map);
	
	public int getRowTotal();
}
