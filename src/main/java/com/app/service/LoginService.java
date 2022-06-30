package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.model.User;

public interface LoginService {

	public List<User> getAllUsers();
	
	public Optional<User> getUserById(String id);
	
	public Optional<User> getUserByName(String userName);
}
