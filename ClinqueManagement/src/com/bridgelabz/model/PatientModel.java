package com.bridgelabz.model;

import java.util.List;

public class PatientModel {
	private List<Patients> patient;

	public List<Patients> getPatient() {
		return patient;
	}

	public void setPatient(List<Patients> patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "PatientModel [patient=" + patient + "]";
	}

}
