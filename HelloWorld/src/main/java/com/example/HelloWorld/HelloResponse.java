package com.example.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResponse {

	@GetMapping
	public String sayHello() {
		System.out.println("sdfds");
		return "welcome to spring boot";
	}
	
}
