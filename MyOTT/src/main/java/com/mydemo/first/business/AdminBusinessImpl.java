package com.mydemo.first.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mydemo.first.dao.AdminDao;
import com.mydemo.first.entity.Admin;
import com.mydemo.first.entity.Subscriber;

@Component
public class AdminBusinessImpl implements AdminBusiness {

	@Autowired
	AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public int adminLogin(Admin admin) {
		return adminDao.adminLogin(admin);
	}

	@Override
	public List<Subscriber> getSubscribers() {
		return adminDao.getSubscribers();
	}

}
