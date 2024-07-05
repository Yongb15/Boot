package com.korea.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Confuguration, @EnableAutoConfiguration, @ComponentScan 세 가지를 하나로 합친 어노테이션
// @Confuguration : 해당 클래스가 설정파일임을 알려주는 용도
// @ComponentScan : 컴포넌트 어노테이션이 달린 클래스를 찾아서 메모리에 올려주는 어노테이션
// @EnableAutoConfiguration : 스프링의 다양한 설정이 자동으로 구성되고 완료됨
public class Ex0704Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex0704Application.class, args);
	}

}
