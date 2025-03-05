package com.controller;

import org.springframework.web.servlet.ModelAndView;

import com.service.EmployeeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController{
	
	@Autowired
	private EmployeeService es;
	@GetMapping(value="/")
	public ModelAndView m1(ModelAndView m) {
		System.out.println("we are in m1 method");
		m.addObject("employees",es.findAll());
		m.setViewName("home.jsp");
		return m;
	}
}
