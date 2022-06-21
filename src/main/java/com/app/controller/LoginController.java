package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping("/getMessage")
	public String getMessage() {
		logger.info(" Loggin controller getMessage method ");
		return "this is docker intgeration demo";
	}

}
