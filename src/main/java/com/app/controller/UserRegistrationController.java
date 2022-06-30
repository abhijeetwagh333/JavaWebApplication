package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.payload.request.SignUpRequest;

@RestController
@RequestMapping("/api")
public class UserRegistrationController {

	Logger logger = LoggerFactory.getLogger(UserRegistrationController.class);
	
	
	

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody SignUpRequest signUpRequest) {
		logger.info("registerUser ", signUpRequest.toString());
		
		return ResponseEntity.ok(signUpRequest);
	}

	@PostMapping("/signout")
	public ResponseEntity<?> logoutUser() {
		return null;

	}
}
