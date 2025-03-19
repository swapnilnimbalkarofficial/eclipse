package com.demo;
import com.dao.EmployeeDao;
import com.model.Employee;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        EmployeeDao ed=context.getBean(EmployeeDao.class); 
        
        Employee e= new Employee();
        e.setName("vijay mane");
        e.setCompany("tcs");
        e.setDesignation("java dev");
        e.setSalary((double) 12000);
        
        System.out.println(ed.insertEmployee(e));
         
        
    }
}
     