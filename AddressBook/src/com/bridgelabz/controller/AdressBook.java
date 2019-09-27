/******************************************************************************
 
 *  Purpose: To create and maintin a adress book where you can perfrom functions 
 *           like add person ,delete person ,edit person ,save file ,save as file
 *           and exit 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   23-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.service.AddressBookServices;
import com.bridgelabz.utility.ScannerUtility;

public class AdressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, InterruptedException {

		AddressBookServices service = new AddressBookServices();
		service.readJson();

		boolean adressbook = false;
		while (adressbook != true) {
		System.out.println("-----------------------------------------");

		System.out.println("\n Press 1 to Create new Address Book" + "\n Press 2 to Open Address Book"
				+ "\n Press 3 to save Adress Book " + "\n Press 4 to SaveAs " + "\n Press 5 to Exit");

		

			switch (ScannerUtility.intScanner()) {

			case 1:
				System.out.println("-----------------------------------------");

				System.out.println("\n Press 1 to Add a person" + "\n Press 2 to Edit a Person"
						+ "\n Press 3 to Sort Entries By Last Name" + "\n Press 4 to Sort Entries By Zip"
						+ "\n Press 5 to Print Entries" + "\n Press 6 to delete Person" + "\n Press 7 to Exit");

				switch (ScannerUtility.intScanner()) {

				case 1:

					service.addPerson();

					break;

				case 2:
					service.editPerson();
					break;

				case 3:
					service.sortName();
					break;

				case 4:
					service.sortzip();

					break;

				case 5:
					service.printEntries();

					break;
				case 6:
					service.deletePerson();
					break;

				case 7:
					System.out.println("Thankyou for your time ");
					adressbook = true;

				}
				break;
			case 2:
				service.printEntries();
				break;

			case 3:
				service.saveAddressBook();

				break;

			case 4:
				service.savedAs();

				break;

			case 5:
				System.out.println("Thankyou for your time ");
				adressbook = true;

			}
		}
	}
}
