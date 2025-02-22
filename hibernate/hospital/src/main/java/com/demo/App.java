package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Bill;
import com.model.Department;
import com.model.Doctor;
import com.model.Patient;
import com.model.Resceptionist;
import com.model.Room;
import com.model.Staff;

import HBUtil.HBUtils;

public class App {
    public static void main(String[] args) {
    	Session session = HBUtils.sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	/*
    	Room r = new Room();
    	r.setRtype("Gastroenterology");
    	r.setRlocation("Eighth Floor");
    	session.save(r);
    	*/
    
    	/* to provide random doctors for department
    	 * OneToMany
    	int a[]= {2,1,3,4,1,2,5,1,3,8,7,4,6};
    	for(int i=0; i<a.length; i++)
    	{
    		Doctor d1= session.get(Doctor.class, i+1);
    		Department s = session.get(Department.class, a[i]);
    		d1.setDepartment(s);
    	}
    	*/
    	/*@ManyToOne
    	
    	int a[]= {6,4,13,10,1,9,13,3,5,12,2,12,7,4,1,6,3,8,5,2,2,8,11,10,7,1,2,11,9,3};
    	for(int i=0;i<a.length; i++)
    	{
    		Patient p = session.get(Patient.class,i+1);
    		Doctor d = session.get(Doctor.class, a[i]);
    		p.setDoctor(d);
    	}
    	*/
    	
    	/*@ManyToOne
    	
    	int a[]= {4,9,1,14,20,15,2,5,8,13,10,3,18,16,1,11,6,19,17,21,7,12};
    	for(int i=0; i<a.length; i++)
    	{
    		Bill b = session.get(Bill.class,i+1);
    		Patient p = session.get(Patient.class, a[i]);
    		b.setPatient(p);
    	}
    	@ManyToOne
    	int a[]= {5,1,4,3,6,2,7,3,2,4,7,5,2,6,1,7,3,6,2,4,5};
    	for(int i=0; i<a.length;i++)
    	{
    		Bill b = session.get(Bill.class, i+1);
    		Resceptionist r = session.get(Resceptionist.class, a[i]);
    		b.setResceptionist(r);
    	}
    	@M
    	
    	int a[]= {4,9,1,14,20,15,2,5,8,13,10,3,18,16,1,11,6,19,17,21,7,12};
    	for(int i=0; i<a.length; i++)
    	{
    		Bill b = session.get(Bill.class, i+1);
    		Patient p = session.get(Patient.class, a[i]);
    		b.setPatient(p);
    	}
    	
    	Doctor d= session.get(Doctor.class, 12);
    	System.out.println(d);
    	List<Patient>list=d.getPatient();
    	for(Patient p:list)
    		System.out.println(p);
    	*/
    	Room r = session.get(Room.class, 8);
    	System.out.println(r);
    	Patient p = session.get(Patient.class,10);
    	System.out.println(p);
    	
    	tx.commit();
    	session.close();				
    }
}