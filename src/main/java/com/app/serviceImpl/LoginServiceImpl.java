package com.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.LoginRepository;
import com.app.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;

	@Override
	public List<User> getAllUsers() {
		return loginRepository.getAllUsers();
	}

	@Override
	public Optional<User> getUserById(String id) {
		return loginRepository.getUserById(id);
	}

	@Override
	public Optional<User> getUserByName(String userName) {
		return loginRepository.getUserById(userName);
	}

}
