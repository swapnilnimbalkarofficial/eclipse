package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
	
	Employee save(Employee e);//for insert and update
	
	@Query(value="delete from Employee where id:id")
	@Modifying//dml query
	int deleteById(@Param("id") int id);
	
	@Query(value="delete from Empolyee where salary=:salary")
	@Modifying
	int deleteBySalary(@Param("salary")double salary);
	
	@Query(value="select from Employee where salary ")
	Employee findById(int id);
}
 