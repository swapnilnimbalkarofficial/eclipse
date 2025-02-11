package com.demo;

import com.dao.StudentDao;
import com.model.Student;

public class App {
    public static void main(String[] args) {
        Student s1= new Student();
        StudentDao sd= new StudentDao();
        s1.setName("Vinay Patil");
        s1.setCity("Pune");
        s1.setPercentage(89.12);
        System.out.println(sd.insertStudent(s1));
    }
}
