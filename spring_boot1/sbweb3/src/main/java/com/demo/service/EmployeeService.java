package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	List<Employee> findAll();

	Employee findById(int id);

	List<Employee> findByNameContains(String name);

	List<Employee> findByIdLike(String id);

	List<Employee> findSalaryBetween(double low, double high);

	List<Employee> findByIdIn(List<Integer> id);

	List<Employee> findByIdIn(Integer id);
}
