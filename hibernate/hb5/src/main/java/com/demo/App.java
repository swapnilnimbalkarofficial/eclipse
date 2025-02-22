package com.demo;

import com.model.Student;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.model.Gift;
import com.model.Laptop;
import com.model.Student;

import HBUtil.HBUtils;

public class App {
    public static void main(String[] args) {
    	Session session = HBUtils.sf.openSession();
    	 
    	Student s1= session.get(Student.class, 3);
    	System.out.println(s1);
    	System.out.println(s1.getLaptop());
    	
    	Session baji = HBUtils.sf.openSession();
    	Session rushikesh = HBUtils.sf.openSession();
    
    	
    	/*  
    	int a[]= {3,2,8,7,2,1,5,2,6,3,2,7,4,5,2,7,3,4,5,3,3,2,2,1};
    	for(int i=0; i<a.length;i++) {
    		Gift g= session.get(Gift.class, i+1);
    		Student s=session.get(Studento.class, a[i]);
    		g.setStudent(s);
    	}
    	
    	
   
    	Gift g = session.get(Gift.class, 8);
    	System.out.println(g);
    	System.out.println(g.getStudent());
    	
    	Student s =session.get(Student.class, 2);
    	System.out.println(s);
    	System.out.println(s.getGifts().size());
    	List<Gift> list = s.getGifts();
    	for(Gift g: list)
    		System.out.println(g);
    	
    	String s1[]= {"engineering", "management", "medical science"};
    	
    	for(int i=0; i<s1.length; i++)
    	{
    	}	
    	tx.commit();
    	session.close();
    	*/
    	
    	
    	
    }
}
