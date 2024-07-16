package com.korea.tier.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.tier.dto.OrderDTO;
import com.korea.tier.service.OrderService;
import com.korea.tier.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/order/*")
public class OrderController {
	
	final OrderService orderService;
	
	@GetMapping("done")
	public RedirectView order(OrderVO orderVO) 
	{
		// 임의로 전달
//		OrderVO vo = new OrderVO();
//		
//		vo.setProductId(1);
//		vo.setProductCount(5);
//		
//		orderService.order(vo);
		
		System.out.println("주문 개수 : " + orderVO.getProductCount());
		
		orderService.order(orderVO);			// 주문과 동시에 재고도 같이 차감
		
		return new RedirectView("/product/list");
	}
	
	@GetMapping("list")
	public String list(@RequestParam(required = false) String sort, Model model)
	{
		if(sort == null)
		{
			sort = "recent";
		}
		List<OrderDTO> list = orderService.getList(sort);
		
		model.addAttribute("sort", sort);
		model.addAttribute("orders", list);
		
		return "/order/order-list";
	}
}
