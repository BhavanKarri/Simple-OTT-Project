package com.mydemo.first.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mydemo.first.entity.Subscriber;
import com.mydemo.first.entity.User;

@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void updatePassword(String username,String updatedPassword) {
		
		User user = hibernateTemplate.get(User.class,username);
		user.setPassword(updatedPassword);
		
		hibernateTemplate.update(user);
		
	}

	@Override
	public int verifyLogin(User user) {
		
		User user1 = hibernateTemplate.get(User.class, user.getUsername());
		System.out.println(user.getId()+" "+user.getUsername());
		Subscriber subscriber = hibernateTemplate.get(Subscriber.class,user.getUsername());
		if(user1 != null)
		{
			if(user1.getPassword().equals(user.getPassword()))
			{
				if(subscriber != null)
				{
					return 1;		//subscriber
				}
				else
				{
					return 0;		//user not subscriber
				}
			}
			else
			{
				return -2;			//user but wrong password
			}
		}
		return -1;					//not a user
	}

	@Override
	@Transactional(readOnly = false)
	public void registerUser(User user) {
		
		//String query = "Insert into user values(?,?)";
		hibernateTemplate.save(user);
	}

}
