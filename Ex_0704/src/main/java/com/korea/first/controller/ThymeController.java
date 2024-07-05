package com.korea.first.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.first.vo.MemberVO;

@Controller
public class ThymeController {
	@RequestMapping("/ex01")
	public String ex01(Model model) {
		model.addAttribute("lastName", "lee");
		model.addAttribute("firstName", "GilDong");		
		return "ex01";
	}
	
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		model.addAttribute("list",list);
		model.addAttribute("num",1);
		return "ex02";
	}
	
	@RequestMapping("/ex03")
	public String ex03(Model model) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("딸기");
		fruits.add("포도");
		fruits.add("배");
		
		List<MemberVO> list = new ArrayList<>();
		list.add(new MemberVO("홍길동", 20));
		list.add(new MemberVO("김길동", 30));
		list.add(new MemberVO("이길동", 40));
		list.add(new MemberVO("박길동", 50));
		list.add(new MemberVO("조길동", 60));	
		
		model.addAttribute("fruits",fruits);
		model.addAttribute("list",list);
		
		return "ex03";
	}
}
