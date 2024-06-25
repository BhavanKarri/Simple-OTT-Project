package com.mydemo.first.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mydemo.first.dao.SubscriberDao;
import com.mydemo.first.entity.Content;
import com.mydemo.first.entity.Subscriber;
import com.mydemo.first.entity.User;

@Component
public class SubscriberBusinessImpl implements SubscriberBusiness {

	@Autowired
	private SubscriberDao subscriberDao;

	@Override
	public void registerSubscriber(Subscriber subscriber) {
		// TODO Auto-generated method stub
		subscriberDao.registerSubscriber(subscriber);
	}

	@Override
	public void updateDetails(Subscriber subscriber) {
		// TODO Auto-generated method stub
		subscriberDao.updateDetails(subscriber);
	}

	public SubscriberDao getSubscriberDao() {
		return subscriberDao;
	}

	public void setSubscriberDao(SubscriberDao subscriberDao) {
		this.subscriberDao = subscriberDao;
	}

	@Override
	public Subscriber getSubscriber(User user) {
		// TODO Auto-generated method stub
		return subscriberDao.getSubscriber(user);
	}
	

}
