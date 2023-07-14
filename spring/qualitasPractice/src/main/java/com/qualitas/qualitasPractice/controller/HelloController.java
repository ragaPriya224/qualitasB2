package com.qualitas.qualitasPractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String getDetail() {
		return "welcome user! it's 2023";
	}
	
	
}
