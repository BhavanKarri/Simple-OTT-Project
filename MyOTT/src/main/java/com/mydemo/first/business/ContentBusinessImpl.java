package com.mydemo.first.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mydemo.first.dao.ContentDao;
import com.mydemo.first.entity.Content;

@Component
public class ContentBusinessImpl implements ContentBusiness {

	@Autowired
	ContentDao contentDao;
	
	@Override
	public List<Content> getContents() {
		// TODO Auto-generated method stub
		return contentDao.getContents();

	}

	@Override
	public void addContent(Content content) {
		// TODO Auto-generated method stub
		contentDao.addContent(content);
	}

	@Override
	public void removeContent(String movieName) {
		// TODO Auto-generated method stub
		contentDao.removeContent(movieName);
	}

}
