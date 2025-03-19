package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {
	
	private JdbcTemplate j;
	public void setJ(JdbcTemplate j) {
		this.j = j; 
	} 	
	public int insertStudent(Student s) {

		String sql="insert into Student(name,city,percentage)values(?,?,?)";
		return j.update(sql, new Object[] {s.getName(),s.getCity(),s.getPercentage()});
	}
}
