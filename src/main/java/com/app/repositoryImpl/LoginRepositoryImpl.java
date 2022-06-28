package com.app.repositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.mapper.UserRowMapper;
import com.app.model.User;
import com.app.repository.LoginRepository;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from user", new UserRowMapper());
	}

	@Override
	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
