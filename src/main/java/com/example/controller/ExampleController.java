package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "this is docker intgeration demo";
	}

}
