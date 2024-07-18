package com.korea.board.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	private int idx;
	private int readhit;
	private int ref;
	private int step;
	private int depth;
	private int del_info;
	
	private String name;
	private String subject;
	private String content;
	private String pwd;
	private String ip;
	private String regdate;
}
