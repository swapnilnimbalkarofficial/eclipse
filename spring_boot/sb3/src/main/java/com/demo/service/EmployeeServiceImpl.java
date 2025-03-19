package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao ed; 
	
	public Employee save(Employee e) {
		return ed.save(e);
	}

	@Override
	public int deleteById(int id) {
		return ed.deleteById(id);
	}

	@Override
	public int deleteBySalary(double salary) {
		return ed.deleteBySalary(salary);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
