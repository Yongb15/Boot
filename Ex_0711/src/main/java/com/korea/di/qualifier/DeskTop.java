package com.korea.di.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DeskTop") @Primary	// @Primary를 붙이면 기본적으로 사용 가능
public class DeskTop implements Computer {
	
	@Override
	public int getScreenWidth() {
		return 1920;
	}
}
