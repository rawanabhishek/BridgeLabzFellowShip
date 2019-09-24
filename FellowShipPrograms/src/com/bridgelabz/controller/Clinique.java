
package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.AppointmentModel;
import com.bridgelabz.model.Availability;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.DoctorModel;
import com.bridgelabz.model.PatientModel;
import com.bridgelabz.model.Patients;

import com.bridgelabz.utility.ScannerUtility;
import com.bridgelabz.utility.jsonutility;

public class Clinique {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String patientsource = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/patient.json";
		String doctorsource = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/doctor.json";
		String appointmentsource = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/appointment.json";

		DoctorModel modelDoctor = new DoctorModel();
		PatientModel modelPatient = new PatientModel();
		AppointmentModel modelAppointment = new AppointmentModel();

		int doctorid = 0;
		int patientid = 10;
    
		int nopatient = 0;
		ArrayList<Appointment> appoint = new ArrayList<Appointment>();
		ArrayList<Doctor> doctor = new ArrayList<Doctor>();
		ArrayList<Patients> patient = new ArrayList<Patients>();

		File doctorfile = new File(doctorsource);
		File patientfile = new File(patientsource);
		File appointmentfile = new File(appointmentsource);

		if (doctorfile.exists() && doctorfile.length() > 0) {
			modelDoctor = (DoctorModel) jsonutility.readMapper(doctorsource, modelDoctor);
			doctor.addAll(modelDoctor.getDoctor());
			doctorid = doctor.size();

		}

		if (patientfile.exists() && patientfile.length() > 0) {
			modelPatient = (PatientModel) jsonutility.readMapper(patientsource, modelPatient);
			patient.addAll(modelPatient.getPatient());
			patientid = patient.size();
		}
		if (appointmentfile.exists() && appointmentfile.length() > 0) {
			modelAppointment = (AppointmentModel) jsonutility.readMapper(appointmentsource, modelAppointment);
			appoint.addAll(modelAppointment.getAppoinment());
			

		}
		boolean clinique = false;

		while (clinique != true) {
			System.out.println("---------------------------");
			System.out.println("Select option from menu");
			System.out.println("---------------------------");
			System.out.println("1. add doctor\n2. add patient\n3. search doctor by id\n4. search doctor by name\n5."
					+ " search doctor by specialization\n6. search doctor by availability\n7. search patient "
					+ "by id\n8. search patient" + " by name\n9. search patient by number\n10. "
					+ "add appointment\n11. save\n12. exit");

			switch (ScannerUtility.intScanner()) {
			case 1:
				Doctor doc = new Doctor();
				Availability availability = new Availability();

				doctorid += 1;
				doc.setId(doctorid);
				System.out.println("Enter Doctor name :");
				String docname = ScannerUtility.stringScanner();

				System.out.println("Enter Doctor specialization : ");
				String spec = ScannerUtility.stringScanner();

				System.out.println("Enter availability date : ");
				String avail = ScannerUtility.stringScanner();

				System.out.println("Enter availability start time : ");
				int timestart = ScannerUtility.intScanner();

				System.out.println("Enter availabilty end time :");
				int timeout = ScannerUtility.intScanner();

				doc.setNoofpatient(nopatient);
				doc.setName(docname);
				doc.setSpecialization(spec);
				availability.setTimein(timestart);
				availability.setTimeout(timeout);
				availability.setDate(avail);

				doc.setAvailablity(availability);
				doctor.add(doc);

				modelDoctor.setDoctor(doctor);
				jsonutility.writeMapper(doctorsource, modelDoctor);
				System.out.println("Doctor added successfully..");
				break;

			case 2:

				Patients pa = new Patients();

				patientid += 10;
				pa.setId(patientid);
				System.out.println("Enter patient name :");
				String paname = ScannerUtility.stringScanner();
				System.out.println("Enter patient contact");
				String pacontact = ScannerUtility.stringScanner();
				System.out.println("Enter patient age");
				int paage = ScannerUtility.intScanner();

				pa.setAge(paage);
				pa.setContact(pacontact);
				pa.setName(paname);

				patient.add(pa);
				modelPatient.setPatient(patient);
				jsonutility.writeMapper(patientsource, modelPatient);
				System.out.println("Pateint added succesfully ....");
				break;

			case 3:

				if (doctor.isEmpty()) {
					System.out.println("Sorry but there are no doctors to search ");

				} else {
					System.out.println("Enter doctor id :");
					int docsearchid = ScannerUtility.intScanner();

					for (int i = 0; i < doctor.size(); i++) {
						if (docsearchid == doctor.get(i).getId()) {
							System.out.println(">Doctor Found< ");
							System.out.println(doctor.get(i).toString());
							break;
						}
					}

				}
				break;

			case 4:

				if (doctor.isEmpty()) {
					System.out.println("Sorry but there are no doctors to search ");

				} else {
					System.out.println("Enter doctor name :");
					String docsearchname = ScannerUtility.stringScanner();

					for (int i = 0; i < doctor.size(); i++) {
						if (docsearchname.equals(doctor.get(i).getName())) {
							System.out.println(">Doctor Found< ");
							System.out.println(doctor.get(i).toString());
							break;
						}
					}

				}
				break;
			case 5:

				if (doctor.isEmpty()) {
					System.out.println("Sorry but there are no doctors to search ");

				} else {
					System.out.println("Enter doctor specilization :");
					String docsearchspecilization = ScannerUtility.stringScanner();
					for (int i = 0; i < doctor.size(); i++) {
						if (docsearchspecilization.equals(doctor.get(i).getSpecialization())) {
							System.out.println(">Doctor Found< ");
							System.out.println(doctor.get(i).toString());
							break;
						}
					}
				}
				break;
			case 6:

				if (doctor.isEmpty()) {
					System.out.println("Sorry but there are no doctors to search ");

				} else {
					System.out.println("Enter doctor by availability : ");
					String docsearchdate = ScannerUtility.stringScanner();
					for (int i = 0; i < doctor.size(); i++) {
						if (docsearchdate.equals(doctor.get(i).getAvailablity().getDate())) {
							System.out.println(">Doctor Found< ");
							System.out.println(doctor.get(i).toString());
							break;
						}
					}
				}
				break;
			case 7:
				if (patient.isEmpty()) {
					System.out.println("Sorry but there are no patient to search ");
				} else {
					System.out.println("Enter patient id :");
					int pasearchid = ScannerUtility.intScanner();
					for (int i = 0; i < patient.size(); i++) {
						if (pasearchid == patient.get(i).getId()) {
							System.out.println(">Patient Found< ");
							System.out.println(patient.get(i).toString());
							break;
						}
					}

				}
				break;
			case 8:
				if (patient.isEmpty()) {
					System.out.println("Sorry but there are no patient to search ");
				} else {
					System.out.println("Enter patient name :");
					String pasearchname = ScannerUtility.stringScanner();
					for (int i = 0; i < patient.size(); i++) {
						if (pasearchname.equals(patient.get(i).getName())) {
							System.out.println(">Patient Found< ");
							System.out.println(patient.get(i).toString());
							break;
						}
					}
				}
				break;
			case 9:
				if (patient.isEmpty()) {
					System.out.println("Sorry but there are no patient to search ");
				} else {
					System.out.println("Enter patient contact : ");
					String pasearchcontact = ScannerUtility.stringScanner();
					for (int i = 0; i < patient.size(); i++) {
						if (pasearchcontact.equals(patient.get(i).getContact())) {
							System.out.println(">Patient Found< ");
							System.out.println(patient.get(i).toString());
							break;
						}
					}
				}
				break;
			case 10:
				System.out.println("-----ADD APPOINTMENT-----");
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
							nopatient = doctor.get(i).getNoofpatient();

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

										jsonutility.writeMapper(appointmentsource, modelAppointment);
										jsonutility.writeMapper(doctorsource, modelDoctor);

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

					break;

				}
				break;

			case 11:
				System.out.println("Data has been saved ..");
				jsonutility.writeMapper(patientsource, modelPatient);
				jsonutility.writeMapper(doctorsource, modelDoctor);
				break;

			case 12:
				System.out.println("Thank you using our services ");
				clinique = true;

			}

		}
	}

}
