package com.dao;

public interface EmployeeDao {

	@Override
	public List<Employee> findAll(){
		return sf.getCurrentSession().createCriteria(Employee.class).list();
	}
}
