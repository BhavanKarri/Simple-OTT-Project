package com.mydemo.first.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mydemo.first.business.ContentBusiness;
import com.mydemo.first.entity.Content;

import jakarta.servlet.http.HttpSession;

@Component
@Controller
public class ContentController {
	
	HttpSession session;
	
	@Autowired
	private ContentBusiness contentBusiness;
	
	@RequestMapping("getContents")
	public ModelAndView getContents(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("showContent.jsp");
		try
		{
			if(session.getAttribute("admin") != null)
			{
				List<Content> contents = contentBusiness.getContents();
				session.setAttribute("contents",contents);
				//mv.addObject("contents",contents);
			}
			else
			{
				session.setAttribute("contents",null);
			}
		}
		catch(Exception e)
		{
			mv.addObject("result","Content access failed");
		}
		return mv;
	}
	
	@RequestMapping("addContent")
	public ModelAndView addContent(@ModelAttribute("content") Content content)
	{
		ModelAndView mv = new ModelAndView("adminHome.jsp");
		try
		{
			contentBusiness.addContent(content);
			mv.addObject("result","Content ADDED!!");
		}
		catch(Exception e)
		{
			mv.addObject("result","Content adding Failed!!");
		}
		return mv;
	}
	
	@RequestMapping("removeContent")
	public ModelAndView removeContent(@RequestParam("movieName") String movieName)
	{
		ModelAndView mv = new ModelAndView("adminHome.jsp");
		try
		{
			contentBusiness.removeContent(movieName);
			mv.addObject("result","Content REMOVED!!");
		}
		catch(Exception e)
		{
			mv.addObject("result","Content Removal failed!!!");
		}
		return mv;
	}
	
	@RequestMapping("showContent")
	public ModelAndView showContent(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("subscriberContent.jsp");
		try {
			if(session.getAttribute("subscriber") != null)
			{
				List<Content> contents = contentBusiness.getContents();
				//mv.addObject("contents",contents);
				session.setAttribute("contents",contents);
			}
			else
			{
				session.setAttribute("contents", null);
			}
				return mv;
		}
		catch(Exception e)
		{
			mv.addObject("result","Content access failed!!");
			return mv;
		}
	}
	
}
