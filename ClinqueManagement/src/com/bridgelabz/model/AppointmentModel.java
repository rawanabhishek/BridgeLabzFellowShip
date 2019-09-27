package com.bridgelabz.model;

import java.util.List;

public class AppointmentModel {
	private List<Appointment> appoinment;

	@Override
	public String toString() {
		return "AppointmentModel [appoinment=" + appoinment + "]";
	}

	public List<Appointment> getAppoinment() {
		return appoinment;
	}

	public void setAppoinment(List<Appointment> appoinment) {
		this.appoinment = appoinment;
	}

}
