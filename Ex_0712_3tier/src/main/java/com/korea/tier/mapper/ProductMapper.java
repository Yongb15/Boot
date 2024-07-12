package com.korea.tier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.tier.vo.ProductVO;

@Mapper
public interface ProductMapper {
	
	// 상품추가
	public void insert(ProductVO productVO);
	
	public List<ProductVO> selectAll();			// 2 받아야하므로 반환형이 List형
}
