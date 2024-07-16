package com.korea.rest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.korea.rest.dto.OrderDTO;
import com.korea.rest.mapper.OrderMapper;
import com.korea.rest.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class OrderDAO {
	
	final OrderMapper orderMapper;
	
	// 주문하기
	public void save(OrderVO orderVO) {
		orderMapper.insert(orderVO);		// 메서드 호출
	}
	
	// 상품 조회
	public List<OrderDTO> findAll(String sort) {
		return orderMapper.selectAll(sort);
	}
	
}
