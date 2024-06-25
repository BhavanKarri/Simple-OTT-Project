package com.mydemo.first.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Component
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("home.jsp");
		return mv;
	}
}