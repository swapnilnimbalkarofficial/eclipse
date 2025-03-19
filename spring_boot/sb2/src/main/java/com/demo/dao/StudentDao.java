package com.demo.dao;
import org.springframework.jdbc.core.RowMapper;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;
import com.demo.model.Student;
import com.demo.model.StudentRowMapper;

@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate j;
	public int insertStudent(Student s) 
	{
		String sql="insert into student (name,city,percentage) values(?,?,?)";
		return j.update(sql, new Object[] {s.getName(),s.getCity(),s.getPercentge()});
	}
	
	public int deleteStudentByid(int id){
		String sql="delete from Student where id=?";
		return j.update(sql,id);	
	}
	
	public Student findStudentById(int id) {
		Student s1=null;
	    String sql = "select id, name, city, percentage from student where id=?";
	    List<Student> list = j.query(sql, new StudentRowMapper(), id);
	    if (!list.isEmpty()) {
	        s1= list.get(0);
	    }
		return s1;
	}
	
	public List<Student> findAllStudent(){
		String sql="select id, name, city, percentage from student";
		try {
			return JdbcTemplate.query(sql, new StudentRowMapper());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	public int updateStudent(Student s) {
		String sql="update student set name=?, percentage=?, where id=?";
		return j.update(sql, new Object[] {s.getName(), s.getCity(), s.getPercentge(), s.getId()});
	}
	*/
}
	