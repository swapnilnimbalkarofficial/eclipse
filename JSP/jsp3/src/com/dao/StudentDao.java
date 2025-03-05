package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.HBUtils;

public class StudentDao {
	private Session session = HBUtils.sf.openSession();
	private Transaction tx = session.beginTransaction();

	private void closeConnection() {
		tx.commit();
		session.close();
	}

	public List<Student> findAll() {
		return session.createCriteria(Student.class).list();

	}

	public int insertStudent(Student s) {
		int result = (int) session.save(s);
		closeConnection();
		return result;
	}

	public int deleteById(int id) {
		int check = session.createQuery("delete from Student where id=:a").setParameter("a", id).executeUpdate();
		closeConnection();
		return check;
	}
	
	public Student findStudentById(int id) {
		return session.get(Student.class, id);
	}
}
