package com.mydemo.first.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mydemo.first.business.SubscriberBusiness;
import com.mydemo.first.business.UserBusiness;
import com.mydemo.first.entity.Subscriber;
import com.mydemo.first.entity.User;

import jakarta.servlet.http.HttpSession;

@Component
@Controller
public class UserController {
	
	private  HttpSession session;
	
	@Autowired
	private SubscriberBusiness subscriberBusiness;
	
	@Autowired
	private UserBusiness userBusiness;
	
	@RequestMapping("updatePassword")
	public void updatepassword(@RequestParam("username") String username,@RequestParam("updatedPassword") String updatedPassword, @RequestParam("id") String id)
	{
		ModelAndView mv = new ModelAndView("userLogin.jsp");
		
		userBusiness.updatePassword(username, updatedPassword);
		
		mv.addObject("updatePassword","password updated");
	}
	
	@RequestMapping("userLogin")
	public ModelAndView login(@ModelAttribute("user") User user, HttpSession session)
	{
		try
		{
			ModelAndView mv = null;
			int verifyResult = userBusiness.verifyLogin(user);
			if(verifyResult == 1)
			{
				mv = new ModelAndView("subscriberHome.jsp");
				//User user1 = new User(user.getUsername(), user.getPassword(), user.getId());
				//mv1.addObject("user",user);
				Subscriber subscriber = subscriberBusiness.getSubscriber(user);
				session.setAttribute("subscriber",subscriber);
			}
			else if(verifyResult == 0)
			{
				mv = new ModelAndView("userHomePage.jsp");
				mv.addObject("user",user);
				session.setAttribute("user",user);
				
			}
			else if(verifyResult == -1)
			{
				mv = new ModelAndView("userLogin.jsp");
				mv.addObject("verifyResult","No user with specified details!!");
			}
			else if(verifyResult == -2)
			{
				mv = new ModelAndView("userLogin.jsp");
				mv.addObject("verifyResult","Wrong Password!!!");
			}
			return mv;
		}
		catch(Exception e)
		{
			ModelAndView mv = new ModelAndView("userLogin.jsp");
			mv.addObject("verifyResult","No user Found!!!");
			return mv;
		}
	}
	
	@RequestMapping("userRegister")
	public ModelAndView register(User user)
	{
		try
		{
			ModelAndView mv = null;
			userBusiness.registerUser(user);
			mv = new ModelAndView("userLogin.jsp");
			mv.addObject("verifyResult","Registration successful! please login!");
			return mv;
		}
		catch(Exception e)
		{
			ModelAndView mv = new ModelAndView("UserRegister.jsp");
			mv.addObject("verifyResult","registration failed!! ");
			return mv;
		}
	}	
	
	@RequestMapping("subscribeMap")
	public ModelAndView subscribe(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("subscribe.jsp");
		User user = (User)session.getAttribute("user");
		mv.addObject("user",user);
		return mv;
	}
}
