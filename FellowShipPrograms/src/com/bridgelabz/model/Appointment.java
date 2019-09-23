package com.bridgelabz.model;

public class Appointment {
	private int doctorid;
	private String doctorname;
	private String doctotavailability;
	private String patientname;
	private int patientid;
	private String patientcontact;
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getDoctotavailability() {
		return doctotavailability;
	}
	public void setDoctotavailability(String doctotavailability) {
		this.doctotavailability = doctotavailability;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientcontact() {
		return patientcontact;
	}
	public void setPatientcontact(String patientcontact) {
		this.patientcontact = patientcontact;
	}
	@Override
	public String toString() {
		return "Appointment [doctorid=" + doctorid + ", doctorname=" + doctorname + ", doctotavailability="
				+ doctotavailability + ", patientname=" + patientname + ", patientid=" + patientid + ", patientcontact="
				+ patientcontact + "]";
	}
	
	

}
