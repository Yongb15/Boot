package com.korea.tier.service;

import org.springframework.stereotype.Service;

import com.korea.tier.dao.OrderDAO;
import com.korea.tier.dao.ProductDAO;
import com.korea.tier.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
	
	final OrderDAO orderDAO;
	final ProductDAO productDAO;
	
	@Override
	public void order(OrderVO orderVO) {
		orderDAO.save(orderVO);
		productDAO.setProductStock(orderVO);
	}
}
