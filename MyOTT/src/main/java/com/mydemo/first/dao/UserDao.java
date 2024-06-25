package com.mydemo.first.dao;

import com.mydemo.first.entity.User;

public interface UserDao {

	int verifyLogin(User user);
	void updatePassword(String username, String updatedPassword);
	void registerUser(User user);
}
