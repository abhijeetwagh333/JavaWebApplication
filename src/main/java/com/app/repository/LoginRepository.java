package com.app.repository;

import java.util.List;
import java.util.Optional;

import com.app.model.User;

public interface LoginRepository {

	public List<User> getAllUsers();

	public Optional<User> getUserById(String id);
	
	public Optional<User> getUserByName(String userName);

}
