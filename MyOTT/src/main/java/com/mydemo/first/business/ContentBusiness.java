package com.mydemo.first.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mydemo.first.entity.Content;

public interface ContentBusiness {
	
	List<Content> getContents();
	void addContent(Content content);
	void removeContent(String movieName);
}
