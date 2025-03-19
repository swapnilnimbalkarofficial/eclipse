package com.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		EmployeeService es = context.getBean(EmployeeService.class);
		/*
		 * Employee e= new Employee(); e.setName("mahesh"); e.setCompany("tcs");
		 * e.setDesignation("java developer"); e.setSalary(12000); e.save(es);
		 * 
		 * for (int i=1; i<5000;i++) { Employee e= new Employee(); StringBuilder
		 * name=new StringBuilder(); StringBuilder designation=new StringBuilder();
		 * StringBuilder company=new StringBuilder(); StringBuilder salary=new
		 * StringBuilder(); for(int j=1; j<=15; j++) { name.append((char)(new
		 * Random().nextInt(26)+65)); company.append((char)(new
		 * Random().nextInt(26)+65)); designation.append((char)(new
		 * Random().nextInt(26)+65)); salary.append((char)(new
		 * Random().nextInt(26)+65)); } e.setName(name.toString());
		 * e.setDesignation(designation.toString()); e.setCompany(company.toString());
		 * e.setSalary((double) (new Random().nextInt(100)*1000)); es.save(e);
		 */
//		System.out.println(es.deleteById(50));
		System.out.println(es.deleteBySalary(0));

	}
}
