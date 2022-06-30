package com.app.repositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.model.User;
import com.app.repository.LoginRepository;

@Repository
public class LoginRepositoryImpl implements LoginRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<User> getAllUsers() {
		return jdbcTemplate.query("select * from user", BeanPropertyRowMapper.newInstance(User.class));
	}

	@Override
	public Optional<User> getUserById(String id) {
		User user = jdbcTemplate.queryForObject("select * from user where id=?", BeanPropertyRowMapper.newInstance(User.class), id);
		return Optional.ofNullable(user);
	}

	@Override
	public Optional<User> getUserByName(String userName) {
		User user = jdbcTemplate.queryForObject("select * from user where name=?", BeanPropertyRowMapper.newInstance(User.class), userName);
		return Optional.ofNullable(user);
	}

}
