package com.mydemo.first.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mydemo.first.business.AdminBusiness;
import com.mydemo.first.business.ContentBusiness;
import com.mydemo.first.business.SubscriberBusiness;
import com.mydemo.first.entity.Content;
import com.mydemo.first.entity.Subscriber;
import com.mydemo.first.entity.User;

import jakarta.servlet.http.HttpSession;

@Controller
@Component
public class SubscriberController {

	HttpSession session;
	
	@Autowired
	private ContentBusiness contentBusiness;
	
	@Autowired
	private SubscriberBusiness subscriberBusiness;
	
	@Autowired
	private AdminBusiness adminBusiness;
	
	@RequestMapping("subscribe")
	public ModelAndView subscribe(Subscriber subscriber, HttpSession session)
	{
		ModelAndView mv = new ModelAndView("payment.jsp");
		session.setAttribute("subscriber", subscriber);
		mv.addObject("subscriber",subscriber);
		//ModelAndView mv;
//		try {
//			subscriberBussiness.registerSubscriber(subscriber);
//			mv = new ModelAndView("subscriberHome.jsp");
//			
//		}
//		catch(Exception e)
//		{
//			mv = new ModelAndView("subscribe.jsp");
//			mv.addObject("result","subscription failed "+e);
//		}
		return mv;
	}
	
	@RequestMapping("viewSubscriberDetails")
	public ModelAndView viewDetails(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("subscriberDetails.jsp");
		Subscriber subscriber = (Subscriber)session.getAttribute("subscriber");
		mv.addObject(subscriber);
		return mv;
	}
	
	@RequestMapping("updateSubscriberDetails1")
	public ModelAndView updateDetails1(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("updateSubscriberDetails.jsp");
		Subscriber subscriber = (Subscriber)session.getAttribute("subscriber");
		mv.addObject(subscriber);
		return mv;
	}
	
	@RequestMapping("updateSubscriberDetails2")
	public ModelAndView updateDetails2(Subscriber subscriber,HttpSession session)
	{
		ModelAndView mv = new ModelAndView("subscriberHome.jsp");
		try
		{
			subscriberBusiness.updateDetails(subscriber);
			session.setAttribute("subscriber", subscriber);
			mv.addObject("updateResult","Subscriber Details Updated successfully!!!");
			return mv;
		}
		catch(Exception e)
		{
			mv.addObject("updateResult","Upadtion Failed!!!"+e);
			return mv;
		}
	}
	
	@RequestMapping("getSubscribers")
	public ModelAndView getSubscribers(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("listOfSubscribers.jsp");
		if(session.getAttribute("admin") != null)
		{
			List<Subscriber> subscribers = adminBusiness.getSubscribers();
			String s = "heloo world";
			//System.out.println("result: "+"hello"+"result: "+"hello");
			session.setAttribute("subscribers", subscribers);
		}
		else
		{
			session.setAttribute("subscribers", null);
		}
		//mv.addObject("result",s);
		return mv;
	}
	
	
	@RequestMapping("logout")
	public String logout(HttpSession session)
	{
		//ModelAndView mv = new ModelAndView("home.jsp");
//		session.setAttribute("subscriber",null);
//		session.setAttribute("user", null);
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("returnToSubscriberHome")
	public ModelAndView returnHome(HttpSession session)
	{
		
		ModelAndView mv = new ModelAndView("subscriberHome.jsp");
		//Subscriber user = (Subscriber)session.getAttribute("");
		return mv;
	}
}