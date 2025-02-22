package com.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String rtype;
	private String rlocation;

	@OneToMany(mappedBy = "room")
	private List<Patient>patient=new LinkedList();
	
	@ManyToMany(mappedBy="room")
	private List<Staff> staff = new LinkedList();
	public List<Staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", rtype=" + rtype + ", rlocation=" + rlocation + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRtype() {
		return rtype;
	}
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	public String getRlocation() {
		return rlocation;
	}
	public void setRlocation(String rlocation) {
		this.rlocation = rlocation;
	}

}
