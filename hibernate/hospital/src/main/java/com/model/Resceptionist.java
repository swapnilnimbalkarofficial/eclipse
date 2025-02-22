package com.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Resceptionist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private String phoneno;
	@OneToMany(mappedBy = "resceptionist")
	private List<Bill> bill = new LinkedList();
	public List<Bill> getBill() {
		return bill;
	}
	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Resceptionist [id=" + id + ", name=" + name + ", gender=" + gender + ", phoneno=" + phoneno + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
}
