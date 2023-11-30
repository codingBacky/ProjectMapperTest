package com.shard.controller;

import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.shard.service.CartService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@SessionAttributes({"user", "token"})
@RequestMapping("/order/*")
@Log4j
@RequiredArgsConstructor
public class CartController {
	
	@Autowired
	private CartService cartservice;
	
	@GetMapping("/cart")
	public void cart(String email, int itemNum) {
		 cartservice.initCart("email15@gmail.com", OptionalInt.of(1), "S");
		
	}
	@GetMapping("/checkOut")
	public void checkOut() {
		
	}
	
}