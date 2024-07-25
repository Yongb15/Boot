package com.korea.board.service;

import org.springframework.stereotype.Service;

import com.korea.board.dao.MemberDAO;
import com.korea.board.vo.BoardVO;
import com.korea.board.vo.MemberVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	
	final MemberDAO memberDAO;
	
	public MemberVO loginCheck(String id) {
		return memberDAO.loginCheck(id);
	}

	public MemberVO checkId(String id) {
		return memberDAO.checkId(id);
	}

	public int join(MemberVO vo) {
		// TODO Auto-generated method stub
		return memberDAO.join(vo);
	}
}
