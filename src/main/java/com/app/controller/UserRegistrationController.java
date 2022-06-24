package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRegistrationController {

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser() {
		return null;

	}
	
	@PostMapping("/signout")
	public ResponseEntity<?> logoutUser() {
		return null;

	}
}
