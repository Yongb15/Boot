package com.korea.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication			// 컴포런트 스캔을 가지고있음	/ 컴포넌트를 갖고 있는 클래스들을 메모리에 올림
public class Ex0711Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex0711Application.class, args);
	}

}
