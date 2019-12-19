package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homectrl {

	

	@RequestMapping("/")
	public String logincontroller() {
		return "login";
	}
	
}
