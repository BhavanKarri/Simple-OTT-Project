package com.mydemo.first.dao.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mydemo.first.entity.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow (ResultSet rs, int rowNum) throws SQLException{
		
		User user = new User();
		user.setId(rs.getInt(1));
		user.setUsername(rs.getString(2));
		user.setPassword(rs.getString(3));
		return user;
	}
}

