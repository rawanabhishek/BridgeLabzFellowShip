package com.bridgelabz.model;

import com.bridgelabz.model.Availability;

public class Doctor {
	
	private String name;
	private int id;
	private String specialization;
	private Availability availablity;
	private int noofpatient;
	public int getNoofpatient() {
		return noofpatient;
	}
	public void setNoofpatient(int noofpatient) {
		this.noofpatient = noofpatient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	

	public Availability getAvailablity() {
		return availablity;
	}
	public void setAvailablity(Availability availablity) {
		this.availablity = availablity;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", specialization=" + specialization + ", availablity="
				+ availablity + ", noofpatient=" + noofpatient + "]";
	}
	

}
