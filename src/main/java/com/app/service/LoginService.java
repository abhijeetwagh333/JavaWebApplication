package com.app.service;

import java.util.List;

import com.app.model.User;

public interface LoginService {

	public List<User> getAllUsers();
	
	public User getUserById(String id);
}
