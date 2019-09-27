package com.bridgelabz.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.AppointmentModel;
import com.bridgelabz.model.Availability;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.DoctorModel;
import com.bridgelabz.model.PatientModel;
import com.bridgelabz.model.Patients;
import com.bridgelabz.utility.ScannerUtility;
import com.bridgelabz.utility.jsonutility;

public class ImplClinqueServices implements ClinqueInterface {

	String patientsource = "/home/admin1/FellowShip/ClinqueManagement/src/com/bridgelabz/repository/patient.json";
	String doctorsource = "/home/admin1/FellowShip/ClinqueManagement/src/com/bridgelabz/repository/doctor.json";
	String appointmentsource = "/home/admin1/FellowShip/ClinqueManagement/src/com/bridgelabz/repository/appointment.json";

	List<Appointment> appoint = new ArrayList<>();
	List<Doctor> doctor = new ArrayList<>();
	List<Patients> patient = new ArrayList<>();

	DoctorModel modelDoctor = new DoctorModel();
	PatientModel modelPatient = new PatientModel();
	AppointmentModel modelAppointment = new AppointmentModel();

	@Override
	public void addDoctor() {

		Doctor doc = new Doctor();
		int doctorid = doctor.size();
		int nopatient = doc.getNoofpatient();
		Availability availability = new Availability();

		doctorid += 1;
		doc.setId(doctorid);
		System.out.println("Enter Doctor name :");

		doc.setName(ScannerUtility.stringScanner());
		System.out.println("Enter Doctor specialization : ");

		doc.setSpecialization(ScannerUtility.stringScanner());

		System.out.println("Enter availability date : ");

		availability.setDate(ScannerUtility.stringScanner());

		System.out.println("Enter availability start time : ");

		availability.setTimein(ScannerUtility.intScanner());
		System.out.println("Enter availabilty end time :");

		availability.setTimeout(ScannerUtility.intScanner());

		doc.setNoofpatient(nopatient);
		doc.setAvailablity(availability);

		doctor.add(doc);

		System.out.println("Doctor added successfully..");

	}

	@Override
	public void addPatient() {

		Patients pa = new Patients();
		int patientid = patient.size() * 10;
		patientid += 11;
		pa.setId(patientid);
		System.out.println("Enter patient name :");
		pa.setName(ScannerUtility.stringScanner());

		System.out.println("Enter patient contact");
		pa.setContact(ScannerUtility.stringScanner());

		System.out.println("Enter patient age");
		pa.setAge(ScannerUtility.intScanner());

		patient.add(pa);
		

		System.out.println("Pateint added succesfully ....");

	}

	@Override
	public void searchDoctorById() {
		if (doctor.isEmpty()) {
			System.out.println("Sorry but there are no doctors to search ");

		} else {
			System.out.println("Enter doctor id :");
			int docsearchid = ScannerUtility.intScanner();
			doctor.forEach(i -> {
				if (docsearchid == i.getId()) {
					System.out.println(i);
				}
			});

		}

	}

	@Override
	public void searchDoctorByName() {

		if (doctor.isEmpty()) {
			System.out.println("Sorry but there are no doctors to search ");

		} else {
			System.out.println("Enter doctor name :");
			String docsearchname = ScannerUtility.stringScanner();
			doctor.forEach(i -> {
				if (docsearchname.equals(i.getName())) {
					System.out.println(i);
				}
			});

		}

	}

	@Override
	public void searchDoctorBySpecialization() {

		if (doctor.isEmpty()) {
			System.out.println("Sorry but there are no doctors to search ");

		} else {
			System.out.println("Enter doctor specilization :");
			String docsearchspecilization = ScannerUtility.stringScanner();
			doctor.forEach(i -> {
				if (docsearchspecilization.equals(i.getName())) {
					System.out.println(i);
				}
			});

		}

	}

	@Override
	public void searchPatientById() {

		if (patient.isEmpty()) {
			System.out.println("Sorry but there are no patient to search ");
		} else {
			System.out.println("Enter patient id :");
			int pasearchid = ScannerUtility.intScanner();
			patient.forEach(i -> {
				if (pasearchid == i.getId()) {
					System.out.println(i);
				}
			});

		}

	}

	@Override
	public void searchPatientByName() {
		if (patient.isEmpty()) {
			System.out.println("Sorry but there are no patient to search ");
		} else {
			System.out.println("Enter patient name :");
			String pasearchname = ScannerUtility.stringScanner();
			patient.forEach(i -> {
				if (pasearchname.equals(i.getName())) {
					System.out.println(i);
				}
			});
		}

	}

	@Override
	public void searchPatientByContact() {
		if (patient.isEmpty()) {
			System.out.println("Sorry but there are no patient to search ");
		} else {
			System.out.println("Enter patient contact : ");
			String pasearchcontact = ScannerUtility.stringScanner();
			patient.forEach(i -> {
				if (pasearchcontact.equals(i.getContact())) {
					System.out.println(i);
				}
			});
		}

	}

	@Override
	public void appointment() {
		System.out.println("-----ADD APPOINTMENT-----");
		 int doctorid=doctor.size();
		 //int patientid=patient.size()*10;
		System.out.println("Enter Specialized doctor to treat from ..");
		String appdoc = ScannerUtility.stringScanner();
		boolean docfound = false;
		int docindex = 0;
		int idpatient = 0;
		int indexpatient = 0;
		String doctorname = "";
		for (int i = 0; i < doctor.size(); i++) {
			if (appdoc.equals(doctor.get(i).getSpecialization())) {
				docfound = true;
				docindex = i;

			}
		}

		if (docfound == true) {
			System.out.println("Below are the list of doctor for " + appdoc);
			for (int i = 0; i < doctor.size(); i++) {
				if (doctor.get(i).getSpecialization().equals(appdoc)) {
					System.out.println(doctor.get(i).toString());

				}
			}
			System.out.println("Enter the doctor id from which you want to take appointment .");
			int appid = ScannerUtility.intScanner();

			for (int i = 0; i < doctor.size(); i++) {
				if (appid == doctor.get(i).getId()) {
					System.out.println("Doctor is avail at " + doctor.get(i).getAvailablity().getDate());
					System.out.println("You want to take appointment on this date (yes/no)");
					 doctorid = i + 1;

					doctorname = doctor.get(i).getName();
					int nopatient = doctor.get(i).getNoofpatient();

					String choice = ScannerUtility.stringScanner();
					if (choice.equals("yes")) {
						System.out.println(doctor.get(i).toString());
						System.out.println("Enter time for appointment .");
						int time = ScannerUtility.intScanner();
						if ((time == doctor.get(i).getAvailablity().getTimein()
								|| time == doctor.get(i).getAvailablity().getTimeout())) {

							if (doctor.get(docindex).getNoofpatient() < 5) {
								System.out.println("Enter your Patient id..");
								int patientappointmentid = ScannerUtility.intScanner();
								for (int j = 0; j < patient.size(); j++) {
									if (patientappointmentid == patient.get(j).getId()) {
										System.out.println("Your appointment has been booked ..");
										idpatient = patient.get(j).getId();
										indexpatient = j;
										nopatient += 1;

									}
								}

								Appointment appointment = new Appointment();
								appointment.setDoctorid(doctorid);

								doctor.get(docindex).setNoofpatient(nopatient);
								modelDoctor.setDoctor(doctor);
								appointment.setPatientname(patient.get(indexpatient).getName());
								;
								appointment.setPatientcontact(patient.get(indexpatient).getContact());
								appointment.setPatientid(idpatient);
								appointment.setDoctotavailability(choice);
								appointment.setDoctorname(doctorname);

								appoint.add(appointment);
								modelAppointment.setAppoinment(appoint);



							} else {
								System.out.println("No of patient is full ");
							}

						} else {
							System.out.println("Sorry you have selected wrong time ");
							break;
						}
					}

				}
			}
		}

	}

	@Override
	public void printDoctorList() {

		doctor.forEach(System.out::println);

	}

	@Override
	public void readJson() {

		File doctorfile = new File(doctorsource);
		File patientfile = new File(patientsource);
		File appointmentfile = new File(appointmentsource);

		if (doctorfile.exists() && doctorfile.length() > 0) {
			try {
				modelDoctor = (DoctorModel) jsonutility.readMapper(doctorsource, modelDoctor);
			} catch (IOException e) {

				e.printStackTrace();
			}
			doctor.addAll(modelDoctor.getDoctor());

		}

		if (patientfile.exists() && patientfile.length() > 0) {
			try {
				modelPatient = (PatientModel) jsonutility.readMapper(patientsource, modelPatient);
			} catch (IOException e) {

				e.printStackTrace();
			}
			patient.addAll(modelPatient.getPatient());

		}
		if (appointmentfile.exists() && appointmentfile.length() > 0) {
			try {
				modelAppointment = (AppointmentModel) jsonutility.readMapper(appointmentsource, modelAppointment);
			} catch (IOException e) {

				e.printStackTrace();
			}
			appoint.addAll(modelAppointment.getAppoinment());

		}

	}

	@Override
	public void printPatientList() {
		patient.forEach(System.out::println);

	}

	@Override
	public void printAppointmentList() {
		appoint.forEach(System.out::println);

	}

	@Override
	public void save() {
		
		modelDoctor.setDoctor(doctor);
		modelPatient.setPatient(patient);
		
		try {
			jsonutility.writeMapper(appointmentsource, modelAppointment);
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			jsonutility.writeMapper(doctorsource, modelDoctor);
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			jsonutility.writeMapper(patientsource, modelPatient);
		} catch (IOException e) {

			e.printStackTrace();
		}


	}

	@Override
	public void popularDoctor() {

		if (doctor.isEmpty()) {
			System.out.println("Sorry but there are no doctors to search ");

		} else {

			

			int max = Integer.MIN_VALUE;
			int index = -1;
			for (int i = 0; i < doctor.size(); i++) {
				if (max < doctor.get(i).getNoofpatient()) {
					max = doctor.get(i).getNoofpatient();
					index = i;
				}
			}
		

			if (index > -1) {
              System.out.println(doctor.get(index).toString());
				
			}
		}
	}

}
