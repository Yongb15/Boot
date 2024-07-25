package com.korea.board.dao;

import org.springframework.stereotype.Repository;

import com.korea.board.mapper.MemberMapper;
import com.korea.board.vo.BoardVO;
import com.korea.board.vo.MemberVO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberDAO {

	final MemberMapper memberMapper;
	
	public MemberVO loginCheck(String id) {
		return memberMapper.loginCheck(id);
	}

	public MemberVO checkId(String id) {
		return memberMapper.checkId(id);
	}

	public int join(MemberVO vo) {
		return memberMapper.join(vo);
	}
}
