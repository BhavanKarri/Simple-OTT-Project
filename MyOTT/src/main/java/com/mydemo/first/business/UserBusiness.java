package com.mydemo.first.business;

import com.mydemo.first.entity.User;

public interface UserBusiness {
	
	int verifyLogin(User user);
	void updatePassword(String username,String updatedPassword);
	void registerUser(User user);
}
