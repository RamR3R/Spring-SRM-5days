package com.javaTraining.firstApplication.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/hi")
	public String firstMethod()
	{
		return "Hi, My name is Spring Boot.";
	}
	
}

