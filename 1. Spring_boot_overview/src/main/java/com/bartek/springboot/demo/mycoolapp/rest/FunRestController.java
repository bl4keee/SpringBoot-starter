package com.bartek.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the server is: " + LocalDateTime.now();
	}
}
