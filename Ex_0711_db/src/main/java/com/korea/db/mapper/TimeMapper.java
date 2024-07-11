package com.korea.db.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper			// 쿼리문을 호출하기 위한 인터페이스
				// DAO대신 Mapper 어노테이션을 사용한다(마이바티스 3.0이상)
				// @Mapper 어노테이션을 사용하면 Bean으로 등록되며 Service단에서 주입하여 사용할 수 있다.
				// 메서드명은 Mapper.xml 파일의 id와 맞춰야한다.
public interface TimeMapper {
	
}
