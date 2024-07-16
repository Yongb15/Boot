package com.korea.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.rest.dao.OrderDAO;
import com.korea.rest.dao.ProductDAO;
import com.korea.rest.dto.OrderDTO;
import com.korea.rest.vo.OrderVO;

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
