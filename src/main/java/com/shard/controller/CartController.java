package com.shard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@SessionAttributes({"user", "token"})
@RequestMapping("/shard/order/*")
@Log4j
@RequiredArgsConstructor
public class CartController {
	
	@GetMapping("/cart")
	public void cart() {
		
	}
	@GetMapping("/checkOut")
	public void checkOut() {
		
	}
}