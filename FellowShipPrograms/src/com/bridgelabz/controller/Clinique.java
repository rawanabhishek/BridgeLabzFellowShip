/******************************************************************************
 
 *  Purpose: This programme is used to manage a list of  Doctors associated 
 *           with the Clinique. 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   24-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.services.ImplClinqueServices;
import com.bridgelabz.utility.ScannerUtility;

public class Clinique {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ImplClinqueServices service = new ImplClinqueServices();
		service.readJson();
		boolean clinique = false;

		while (clinique != true) {
			System.out.println("---------------------------");
			System.out.println("Select option from menu");
			System.out.println("---------------------------");
			System.out.println("1. add doctor\n2. add patient\n3. search doctor by id\n4. search doctor by name\n5."
					+ " search doctor by specialization\n6. search patient "
					+ "by id\n7. search patient" + " by name\n8. search patient by number\n9. "
					+ "add appointment\n10. save\n11. show doctor and patient list"+"\n12. show popuplar doctor "
							+ "by no of patient"+"\n13. Exit");

			switch (ScannerUtility.intScanner()) {
			case 1:
				
				service.addDoctor();

				break;

			case 2:
                service.addPatient();
				break;

			case 3:
               service.searchDoctorById();
				break;

			case 4:
				service.searchDoctorByName();

				break;
			case 5:
				service.searchDoctorBySpecialization();

				break;
			case 6:
				service.searchPatientById();
				break;
			case 7:
				service.searchPatientByName();

				break;
			case 8:
				service.searchPatientByContact();

				break;
			case 9:
				service.appointment();

				break;
			case 10:
				System.out.println("Data has been saved ..");
                service.save();
				break;

			case 11:
				System.out.println("List of doctors ");
				service.printDoctorList();
				System.out.println();
				System.out.println("List of Patient ");
				service.printPatientList();
				System.out.println();
				System.out.println("Appointment List ");
				service.printAppointmentList();
              
				break;

			case 12:
				System.out.println("Popular Doctor is : ");
				service.popularDoctor();

                break;
				
			
				
			case 13:
				System.out.println("Thank you using our services ");
				clinique = true;
			}

		}
	}

}
