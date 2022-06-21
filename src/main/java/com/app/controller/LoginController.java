package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "this is docker intgeration demo";
	}

}
