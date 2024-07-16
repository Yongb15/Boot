package com.korea.tier.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.tier.dao.OrderDAO;
import com.korea.tier.dao.ProductDAO;
import com.korea.tier.dto.OrderDTO;
import com.korea.tier.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
	
	final OrderDAO orderDAO;
	final ProductDAO productDAO;
	
	@Override
	public void order(OrderVO orderVO) {
		productDAO.setProductStock(orderVO);
		orderDAO.save(orderVO);
	}

	@Override
	public List<OrderDTO> getList(String sort) {
		return orderDAO.findAll(sort);
	}
	
	
}
