package com.korea.rest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.rest.vo.OrderVO;
import com.korea.rest.vo.ProductVO;

@Mapper
public interface ProductMapper {
	
	// 상품추가
	public void insert(ProductVO productVO);
	
	// 상품조회
	public List<ProductVO> selectAll();			// 2 받아야하므로 반환형이 List형
	
	// 재고수정
	public void updateStock(OrderVO orderVO);
}
