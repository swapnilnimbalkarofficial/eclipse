package com.demo;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class App {
    public static void main(String[] args) {
        Configuration con = new Configuration().configure();
        //session factory can be achieve by using buildsessionfactory() method of config class
        SessionFactory sf= con.buildSessionFactory();
        //acheive instance of session
        Session session=sf.openSession();
        //for commit changes
        Transaction tx= session.beginTransaction();
        
//        Student s = new Student();
//        s.setName("abhay");
//        s.setCity("satara");
//        s.setPercentage(85.60);
//        session.save(s);
//        tx.commit();
//        session.close();
        
//        for inerting value into table
//        Student s= new Student();
//        s.setId(2);
//        s.setName("mno");
//        s.setCity("thane");
//        s.setPercentage(90.60);
//        session.save(s);
//        tx.commit();
//        session.close();
        
        //deleting values from table
//        Student s= new Student();
//        s.setId(4);
//        session.delete(s);
//        session.save(s);
//        tx.commit();
//        session.close();
      
        }
        		
 }
