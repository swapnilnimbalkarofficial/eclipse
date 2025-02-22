package com.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HBUtils {
	public static SessionFactory sf = new Configuration()
			.setProperties(myProperties()) 
			.addAnnotatedClass(Employee.class)
			.buildSessionFactory();
	
	public static Properties myProperties()
	{
		Properties p = new Properties();
		p.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/jap73");
		p.setProperty("hibernate.connection.username","root");
		p.setProperty("hibernate.connection.password", "Swapnil@123");
		
		p.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql","false");
		p.setProperty("hibernate.format_sql", "true");
		return p;
	}
	

}
