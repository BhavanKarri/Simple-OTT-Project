package com.mydemo.first.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mydemo.first.entity.Content;

public interface ContentDao {
	List<Content> getContents();
	void addContent(Content content);
	void removeContent(String movieName);
}
