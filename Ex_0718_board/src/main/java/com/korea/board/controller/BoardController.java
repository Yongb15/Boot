package com.korea.board.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.board.common.Common;
import com.korea.board.common.Common.Board;
import com.korea.board.service.BoardService;
import com.korea.board.util.Paging;
import com.korea.board.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
	private final BoardService boardService;
	
	@GetMapping("board_list")
	public String list(Model model, @RequestParam(name="page", required=false, defaultValue="1") int page) {		// page는 값이 안들어오면 무조건 1이 들어감!

		int start = (page - 1) * Common.Board.BLOCKLIST + 1;
		int end = start + Common.Board.BLOCKLIST - 1;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("start", start);
		map.put("end", end);		
		
		// 페이지 번호에 따른 전체 게시글 조회
		List<BoardVO> list = boardService.selectList(map);				// list에 있는 것은 start와 end에 따라 조회가 된 게시글 10개씩 가지고 있음
		
		model.addAttribute("list", list);
		
		// 전체 게시물 수 구하기
		int rowTitle = boardService.getRowTotal();
		
		
		// 페이지 메뉴 생성하기
		String pageMenu = Paging.getPaging("board_list", page, rowTitle, Board.BLOCKLIST, Board.BLOCKPAGE);	// 목적지 /  

		model.addAttribute("pageMenu", pageMenu);
		
		return "/board/board_list";
	}
}
