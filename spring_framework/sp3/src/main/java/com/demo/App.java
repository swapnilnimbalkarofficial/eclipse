package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	StudentDao sd = context.getBean(StudentDao.class);  

    	Student s1 = new Student();
    	s1.setName("raj");
    	s1.setCity("satara");
    	s1.setPercentage(98.40);
    	System.out.println(sd.insertStudent(s1));
    }
}
