package com.mydemo.first.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mydemo.first.business.PaymentBusiness;
import com.mydemo.first.business.SubscriberBusiness;
import com.mydemo.first.entity.Payment;
import com.mydemo.first.entity.Subscriber;
import com.mydemo.first.entity.User;

import jakarta.servlet.http.HttpSession;

@Controller
@Component
public class PaymentController {

	HttpSession session;
	
	@Autowired
	private SubscriberBusiness subscrierBusiness;
	
	@Autowired
	private PaymentBusiness paymentBusiness;
	
	@RequestMapping("pay")
	public ModelAndView pay(@ModelAttribute("pay") Payment pay,HttpSession session)
	{
		ModelAndView mv = null;
		try
		{
			//ModelAndView mv = new ModelAndView(".jsp");
			//session.setAttribute("pay",pay);
//			User user = (User)session.getAttribute("user");
//			mv.addObject("user",user);
			paymentBusiness.pay(pay);
			Subscriber subscriber = (Subscriber)session.getAttribute("subscriber");
			subscrierBusiness.registerSubscriber(subscriber);
			mv = new ModelAndView("subscriberHome.jsp");
		}
		catch(Exception e)
		{
			mv = new ModelAndView("userHomePage.jsp");
			mv.addObject("result","Payment failed!!"+e);
		}
		return mv;
	}
}
