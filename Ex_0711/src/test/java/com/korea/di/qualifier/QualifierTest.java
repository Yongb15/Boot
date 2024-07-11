package com.korea.di.qualifier;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class QualifierTest {
	
	@Autowired
	// @Qualifier("laptop")					// 2개 이상의 객체가 들어갈 경우 사용
	Computer computer;
	
	@Test
	public void computerTest() {
		log.info(computer.getScreenWidth() + "");
	}
}