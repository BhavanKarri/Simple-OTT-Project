package com.mydemo.first.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mydemo.first.entity.Admin;
import com.mydemo.first.entity.Subscriber;

@Component
public class AdminDaoImpl implements AdminDao {

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

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public int adminLogin(Admin admin) {
		// TODO Auto-generated method stub
		Admin admin1 = (Admin)hibernateTemplate.get(Admin.class,admin.getAdminName());
		if(admin1 != null)
		{
			if(admin1.getPassword().equals(admin.getPassword()))
			{
				return 1;
			}
		}
		return -1;
	}

	@Override
	public List<Subscriber> getSubscribers() {
		List<Subscriber> subscribers = hibernateTemplate.loadAll(Subscriber.class);
		return subscribers;
	}

}
