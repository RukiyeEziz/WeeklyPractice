package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello") //the @ReuqestMapping maps only to the GET method by default, otherwise specify the annotation use other HTTP methods 
	public String sayHello() {
		return "Hello from Spring Boot!";
	}
	
	
}
