package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.dao.StudentDao;
import com.demo.model.Student;
 
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(App.class,args);
		StudentDao sd= context.getBean(StudentDao.class);
		/*
		Student s1= new Student();
		s1.setName("vishwas");
		s1.setCity("bhor");
		s1.setPercentge(89.12);
		System.out.println(sd.insertStudent(s1));
	
		System.out.println(sd.deleteStudentByid(2));
		
		Student s1= sd.findStudentById(2);
		System.out.println(s1);
		*/
		
		Student s1= (Student) sd.findAllStudent();
		System.out.println(s1);
		
	}

}
