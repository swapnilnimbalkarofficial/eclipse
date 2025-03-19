package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@GetMapping(value = "/")
	public List<Employee> m1() {
		return es.findAll();
	}

	@GetMapping(value = "/findbyid/{}")
	public Employee m2(@PathVariable int id) {
		return es.findById(id);
	}

	@GetMapping(value = "/findbyname/{name}")
	public List<Employee> m3(@PathVariable String name) {
		return es.findByNameContains(name);
	}

	@GetMapping(value = "/findbyidlike/{id}")
	public List<Employee> m4(@PathVariable String id) {
		return es.findByIdLike(id);
	}

	@GetMapping(value = "/findsalarybetween/{low}/{high}")
	public List<Employee> m5(@PathVariable double low, @PathVariable double high) {
		return es.findSalaryBetween(low, high);
	}

	@GetMapping(value = "/findbyidin/{id}")
	public List<Employee> m6(@PathVariable List<Integer> id) {
		return es.findByIdIn(id);
	}
}
