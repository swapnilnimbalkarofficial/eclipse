package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.HBUtils;

public class StudentDao {
	
	private Session sesssion= HBUtils.sf.openSession();
	private Transaction tx= session.beginTranslation();
	private void closeConnection() {
		tx.commit();
		session.close();
		
	}
	public List<Student> findAll(){
		return session.create
	}

}
