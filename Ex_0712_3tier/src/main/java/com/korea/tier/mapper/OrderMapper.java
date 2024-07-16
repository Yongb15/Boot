package com.korea.tier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.tier.dto.OrderDTO;
import com.korea.tier.vo.OrderVO;

@Mapper
public interface OrderMapper {
	
	// 주문하기
	public void insert(OrderVO ordervo);
	
	// 주문 내역 조회
	public List<OrderDTO> selectAll(String sort);
}
