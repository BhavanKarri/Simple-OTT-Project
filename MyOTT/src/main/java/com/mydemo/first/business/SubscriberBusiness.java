package com.mydemo.first.business;

import java.util.List;

import com.mydemo.first.entity.Content;
import com.mydemo.first.entity.Subscriber;
import com.mydemo.first.entity.User;

public interface SubscriberBusiness {

	void registerSubscriber(Subscriber subscriber);
	void updateDetails(Subscriber subscriber);
	Subscriber getSubscriber(User user);
}
