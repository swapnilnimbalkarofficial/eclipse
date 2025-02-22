package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.model.Employee;
import com.util.HBUtils;

public class App {
	public static void main(String[] args) {
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
//		Employee e =(Employee) session.createCriteria(Employee.class)
//		.add(Restrictions.eq("salary",session.createCriteria(Employee.class)
//				.setProjection(Projections.max("salary"))
//				.uniqueResult()))
//		.uniqueResult();
//		System.out.println(e);
		
//		Employee e = (Employee) session.createCriteria(Employee.class)
//		.add(Restrictions.eq("salary",session.createCriteria(Employee.class)
//		.add(Restrictions.lt("salary", session.createCriteria(Employee.class)
//		.setProjection(Projections.max("salary"))
//		.uniqueResult()))
//		.setProjection(Projections.max("salary"))
//		.uniqueResult()))
//		.uniqueResult();
//		System.out.println(e);
		
		Employee e = (Employee) session.createCriteria(Employee.class)
		.add(Restrictions.eq("salary", session.createCriteria(Employee.class)
		.add(Restrictions.lt("salary", session.createCriteria(Employee.class)
		.add(Restrictions.lt("salary", session.createCriteria(Employee.class)
		.setProjection(Projections.max("salary"))
		.uniqueResult()))
		.setProjection(Projections.max("salary"))
		.uniqueResult()))
		.setProjection(Projections.max("salary"))
		.uniqueResult()))
		.uniqueResult();
		System.out.println(e);
	
		tx.commit();
		session.close();
	}
}
