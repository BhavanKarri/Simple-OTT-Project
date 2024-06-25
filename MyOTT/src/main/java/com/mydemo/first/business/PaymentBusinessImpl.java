package com.mydemo.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mydemo.first.dao.PaymentDao;
import com.mydemo.first.entity.Payment;

@Component
public class PaymentBusinessImpl implements PaymentBusiness {

	@Autowired
	private PaymentDao paymentDao;
	
	@Override
	public void pay(Payment payment) {
		// TODO Auto-generated method stub
		paymentDao.pay(payment);
	}

}
