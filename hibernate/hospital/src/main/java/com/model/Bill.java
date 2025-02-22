package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String amount;
	@ManyToOne
	private Patient patient;
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@ManyToOne
	private Resceptionist resceptionist;
	public Resceptionist getResceptionist() {
		return resceptionist;
	}
	public void setResceptionist(Resceptionist resceptionist) {
		this.resceptionist = resceptionist;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", description=" + description + ", amount=" + amount + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
