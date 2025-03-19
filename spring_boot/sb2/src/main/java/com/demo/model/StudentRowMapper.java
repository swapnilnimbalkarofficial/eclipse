package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class StudentRowMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s1= new Student();
		s1.setId(rs.getInt("id"));
		s1.setName(rs.getString("name"));
		s1.setCity(rs.getString("city"));
		s1.setPercentge(rs.getDouble("percentage"));
		return s1;
	}
	
}
