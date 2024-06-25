package com.mydemo.first.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mydemo.first.entity.Content;

@Component
public class ContentDaoImpl implements ContentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public List<Content> getContents() {
		// TODO Auto-generated method stub
		List<Content> contents = hibernateTemplate.loadAll(Content.class);
		return contents;
	}

	@Override
	@Transactional(readOnly = false)
	public void addContent(Content content) {
		hibernateTemplate.save(content);
	}

	@Transactional(readOnly = false)
	@Override
	public void removeContent(String movieName) {
		// TODO Auto-generated method stub
		Content content = hibernateTemplate.get(Content.class, movieName);
		hibernateTemplate.delete(content);
	}

}
