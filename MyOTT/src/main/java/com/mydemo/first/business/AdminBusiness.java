package com.mydemo.first.business;

import java.util.List;

import com.mydemo.first.entity.Admin;
import com.mydemo.first.entity.Subscriber;

public interface AdminBusiness {
	
	int adminLogin(Admin admin);
	List<Subscriber> getSubscribers();

}
