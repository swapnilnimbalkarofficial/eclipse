package com.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Repository
public interface EmployeeService {
	Employee save(Employee e);
	int deleteById(int id);
	int deleteBySalary(@Param("salary")double salary);
	List<Employee> findAll();
}
 