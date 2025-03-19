package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao ed;

	@Override
	public List<Employee> findAll() {

		return ed.findAll();
	}

	@Override
	public Employee findById(int id) {
		return ed.findById(20);
	}

	@Override
	public List<Employee> findByNameContains(String name) {
		return ed.findByNameContains(name);
	}

	@Override
	public List<Employee> findByIdLike(String id) {
		return ed.findByIdLike(id);
	}

	@Override
	public List<Employee> findSalaryBetween(double low, double high) {
		return ed.findSalaryBetween(low, high);
	}

	@Override
	public List<Employee> findByIdIn(List<Integer> id) {
		return ed.findByIdIn(id);
	}

	@Override
	public List<Employee> findByIdIn(Integer id) {
		return ed.findByIdIn(id);
	}
}
