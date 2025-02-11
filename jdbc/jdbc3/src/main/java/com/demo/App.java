package com.demo;
import com.model.Student;

public class App {
    public static void main(String[] args) 
    {
    	StudentDao sd= new StudentDao();
    	
//    	Student s1 =new Student();
//    	s1.setName("Sachin Supekar");
//    	s1.setCity("Katraj");
//    	s1.setPercentage(94.60);
//    	System.out.println(sd.insertStudent(s1));
    	System.out.println(sd.deleteStudentById(1));
    }
    
}
