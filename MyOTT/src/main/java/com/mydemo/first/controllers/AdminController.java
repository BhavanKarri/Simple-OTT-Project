package com.mydemo.first.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mydemo.first.business.AdminBusiness;
import com.mydemo.first.entity.Admin;
import com.mydemo.first.entity.Subscriber;
import com.mydemo.first.entity.User;

import jakarta.servlet.http.HttpSession;

@Controller
@Component
public class AdminController {
	
	@Autowired
	AdminBusiness adminBusiness;
	
	HttpSession session;
	
	@RequestMapping("adminLogin")
	public ModelAndView login(@ModelAttribute("admin") Admin admin, HttpSession session)
	{
		ModelAndView mv = null;
		try
		{
			if(adminBusiness.adminLogin(admin) == 1)
			{
				session.setAttribute("admin", admin);
				mv = new ModelAndView("adminHome.jsp");
				return mv;
			}
			else
			{
				mv = new ModelAndView("adminLogin.jsp");
				session.setAttribute("admin", admin);
				mv.addObject("verifyResult","Invalid Credentials!!!");
				return mv;
			}
		}
		catch(Exception e)
		{
			mv = new ModelAndView("adminLogin.jsp");
			mv.addObject("verifyResult","No Admin Found!!!");
			return mv;
		}
	}
	
	
	@RequestMapping("adminLogout")
	public String logout(HttpSession session)
	{
//		ModelAndView mv = new ModelAndView("home.jsp");
//		session.setAttribute("admin",null);
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("returnToAdminHome")
	public ModelAndView returnHome(HttpSession session)
	{
		
		ModelAndView mv = new ModelAndView("adminHome.jsp");
		//Subscriber user = (Subscriber)session.getAttribute("");
		return mv;
	}
}
