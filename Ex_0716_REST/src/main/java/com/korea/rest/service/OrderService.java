package com.korea.rest.service;

import java.util.List;

import com.korea.rest.dto.OrderDTO;
import com.korea.rest.vo.OrderVO;

public interface OrderService {
	
	// 상품 추가
	public void order(OrderVO orderVO);
	
	// 주문 내역 조회
	public List<OrderDTO> getList(String sort);
}
