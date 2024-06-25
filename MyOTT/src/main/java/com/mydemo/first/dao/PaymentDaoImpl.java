package com.mydemo.first.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mydemo.first.entity.Payment;

@Component
public class PaymentDaoImpl implements PaymentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	
	@Transactional(readOnly = false)
	@Override
	public void pay(Payment payment) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(payment);
	}

}
