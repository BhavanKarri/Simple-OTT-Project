package com.mydemo.first.dao;

import java.util.List;

import com.mydemo.first.entity.Admin;
import com.mydemo.first.entity.Subscriber;

public interface AdminDao {

	int adminLogin(Admin admin);
	List<Subscriber> getSubscribers();
}
