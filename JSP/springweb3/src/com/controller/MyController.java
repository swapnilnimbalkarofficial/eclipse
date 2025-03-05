package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
		
		@GetMapping(value="/")
		public ModelAndView m1(ModelAndView m)
		{
			System.out.println("we are in m1 method");
			m.setViewName("home.jsp");
			return m;
		}

}
