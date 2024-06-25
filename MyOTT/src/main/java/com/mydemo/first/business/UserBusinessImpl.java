package com.mydemo.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mydemo.first.dao.UserDao;
import com.mydemo.first.entity.User;

@Component
public class UserBusinessImpl implements UserBusiness {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void updatePassword(String username,String updatedPassword) {
		
		userDao.updatePassword(username,updatedPassword);
	}

	@Override
	public int verifyLogin(User user) {
		return userDao.verifyLogin(user);
	}

	@Override
	public void registerUser(User user) {
		
		userDao.registerUser(user);
	}

}
