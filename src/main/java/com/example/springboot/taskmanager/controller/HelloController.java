package com.example.springboot.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "<center><h1>Hello World</h1><center>";
	}
	
}
