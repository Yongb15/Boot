package com.korea.rest.service;

import java.util.List;

import com.korea.rest.vo.ProductVO;

public interface ProductService {
	
	// 상품 추가
	public void register(ProductVO productVO);
	
	// 상품 조회
	public List<ProductVO> getList();
}
