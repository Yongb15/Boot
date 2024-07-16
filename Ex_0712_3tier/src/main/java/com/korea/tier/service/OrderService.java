package com.korea.tier.service;

import java.util.List;

import com.korea.tier.dto.OrderDTO;
import com.korea.tier.vo.OrderVO;

public interface OrderService {
	
	// 상품 추가
	public void order(OrderVO orderVO);
	
	// 주문 내역 조회
	public List<OrderDTO> getList(String sort);
}
