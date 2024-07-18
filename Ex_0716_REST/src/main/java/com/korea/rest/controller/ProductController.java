package com.korea.rest.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korea.rest.service.ProductService;
import com.korea.rest.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product/*")
public class ProductController {
	
	private final ProductService productService;
	
	@GetMapping("product/list")
	public String list(Model model) {
		List<ProductVO> list = productService.getList();
		
		model.addAttribute("productForm", new ProductVO());
		model.addAttribute("list", list);
		
		return "product-list";
	}
	
	@PostMapping("new")
	@ResponseBody					// JSON의 키값이 VO의 필드로 들어감!
	public void register(@RequestBody ProductVO productVO) {
		productService.register(productVO);
	}
	
	// 업데이트된 재고를 조회
	@GetMapping("{productId}")
	@ResponseBody
	public ProductVO getProduct(@PathVariable("productId") int productId) {
		
		return productService.getProduct(productId);
	}
	
	// HTTP 공부하기!
	// DB도 다룰줄 알아야 함!
	// 로직을 구현!(Java 등등) -> 프로젝트의 구성(아키텍처)
	// @PutMapping
	// @DeleteMapping
}
