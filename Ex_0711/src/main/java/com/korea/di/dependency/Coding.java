package com.korea.di.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
public class Coding {
	
	// @Autowired						// 스프링이 객체를 찾아서 필드에 직접 주입 / 잘안씀
	// private Computer computer;
	
	final Computer computer;	// @RequiredArgsConstructor와 final / 생성자 주입
}
