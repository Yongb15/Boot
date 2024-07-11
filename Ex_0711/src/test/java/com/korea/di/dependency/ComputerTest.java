package com.korea.di.dependency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest			// SpringBoot는 해당 어노테이션을 통해 SpringBoot 프로젝트 테스트에 필요한 모든 의존성을 제공한다.
						// 통합 테스트를 제공하는 기본적은 SpringBoot 테스트 어노테이션이다.
@Slf4j					// lombok에 있는 로그를 쓸 수 있는 어노테이션
public class ComputerTest {
	
	@Autowired				// @Autowired를 갖고있으면 스프링 컨테이너에서 만들어져있는 객체를 가져와서 넣어줌
	Coding coding;
	
	@Test
	public void computerTest() {
		
		// Coding coding = new Coding();
		log.info(coding.getComputer().toString());
	}
}
