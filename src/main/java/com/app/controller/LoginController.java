package com.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.LoginService;

@RestController
@RequestMapping("/api/users")
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	LoginService loginService;

	@GetMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public List<User> getAllUsers() {
		return loginService.getAllUsers();
	}

	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public User getUserById(@PathVariable(name = "id") String id) {
		return loginService.getUserById(id).get();
	}

	@GetMapping(value = "/{name}", produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public User getUserByName(@PathVariable(name = "name") String userName) {
		return loginService.getUserById(userName).get();
	}
}
