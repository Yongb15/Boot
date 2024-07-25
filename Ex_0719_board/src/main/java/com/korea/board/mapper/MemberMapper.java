package com.korea.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.korea.board.vo.BoardVO;
import com.korea.board.vo.MemberVO;

@Mapper
public interface MemberMapper {

	public MemberVO loginCheck(String id);

	public MemberVO checkId(String id);

	public int join(MemberVO vo);
}
