package com.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.User;

public class UserListRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		return User.builder().id(rs.getLong("id")).email(rs.getString("email")).name(rs.getString("name"))
				.password(rs.getString("password")).build();
	}

}
