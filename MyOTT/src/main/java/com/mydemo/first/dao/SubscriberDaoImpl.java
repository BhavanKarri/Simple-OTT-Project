package com.mydemo.first.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mydemo.first.entity.Content;
import com.mydemo.first.entity.Subscriber;
import com.mydemo.first.entity.User;

@Component
public class SubscriberDaoImpl implements SubscriberDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	@Transactional(readOnly = false)
	public void registerSubscriber(Subscriber subscriber) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(subscriber);
	}
	
	@Override
	@Transactional(readOnly = false)
	public void updateDetails(Subscriber subscriber) {
		// TODO Auto-generated method stub
		Subscriber subscriber1 = hibernateTemplate.get(Subscriber.class, subscriber.getSname());
		subscriber1.setAge(subscriber.getAge());
		subscriber1.setEmail(subscriber.getEmail());
		subscriber1.setGender(subscriber.getGender());
		hibernateTemplate.update(subscriber1);
	}
	@Override
	public Subscriber getSubscriber(User user) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Subscriber.class,user.getUsername());
		
	}
}
