package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	List<Employee> findAll();

	Employee findById(int id);

	List<Employee> findByNameContains(String name);

	List<Employee> findByIdLike(String id);

	List<Employee> findSalaryBetween(double low, double high);

	List<Employee> findByIdIn(List<Integer> id);

}
