package com.app.repository;

import java.util.List;

import com.app.model.User;

public interface RegistrationRepository {

	public List<User> findAll();

	public User findById(Long id);

	public int save(User user);
	
	public int update(User user);

	public int deleteById(Long id);

}
