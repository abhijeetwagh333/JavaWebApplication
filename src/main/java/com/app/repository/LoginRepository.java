package com.app.repository;

import java.util.List;

import com.app.model.User;

public interface LoginRepository {

	public List<User> getAllUsers();

	public User getUserById(String id);

}
