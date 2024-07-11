package com.korea.first.vo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data

public class MemberVO {
	private String name;
	private int age;
	
	public MemberVO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public MemberVO() {
		
	}	
}
