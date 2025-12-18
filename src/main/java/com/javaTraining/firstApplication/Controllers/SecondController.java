package com.javaTraining.firstApplication.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {
	
	@GetMapping()
	public String SecondMethod() {
		return "Hi from Second Method";
	}
	
	

}
