/******************************************************************************
 
 *  Purpose: To create and maintin a adress book where you can perfrom functions 
 *           like add person ,delete person ,edit person ,save file ,save as file
 *           and exit 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   23-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.AdressBookModel;

import com.bridgelabz.model.Person;
import com.bridgelabz.utility.ScannerUtility;

public class AdressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String sourcein = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/AdressBook.json";
		String sourceout = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/AdressBookSaveAs.json";

		ObjectMapper mapper = new ObjectMapper();
		AdressBookModel model = new AdressBookModel();

		ArrayList<Person> personlist = new ArrayList<Person>();
		

		File newfile = new File(sourcein);

		if (newfile.length() != 0) {
			model = mapper.readValue(new File(sourcein), AdressBookModel.class);

			personlist.addAll(model.getPerson());

		}

		boolean adressbook = false;

		int personindex = 0;

		while (adressbook != true) {
			System.out.println("-----------------------------------------");

			System.out.println("\n Press 1 to Create new Address Book" + "\n Press 2 to Open Address Book"
					+ "\n Press 3 to save Adress Book " + "\n Press 4 to SaveAs " + "\n Press 5 to Exit");

			switch (ScannerUtility.intScanner()) {

			case 1:
				System.out.println("-----------------------------------------");

				System.out.println("\n Press 1 to Add a person" + "\n Press 2 to Edit a Person"
						+ "\n Press 3 to Sort Entries By name" + "\n Press 4 to Sort Entries By Zip"
						+ "\n Press 5 to Print Entries" + "\n Press 6 to delete Person" + "\n Press 7 to Exit");

				switch (ScannerUtility.intScanner()) {

				case 1:
					boolean isContact = false;
					Person person = new Person();
					Address address = new Address();

					System.out.println("-------------------------------");

					System.out.println("Enter your contact number :");
					String contact = ScannerUtility.stringScanner();

					for (int i = 0; i < personlist.size(); i++) {
						if (contact.equals(personlist.get(i).getContact())) {
							isContact = true;
							
						}

					}

					if (isContact == true) {
						System.out.println("Person already exist");
						break;
					}

					System.out.println("Enter your first name :");
					String firstname = ScannerUtility.stringScanner();

					System.out.println("Enter your last name :");
					String lastname = ScannerUtility.stringScanner();

					System.out.println("Enter your city ");
					String city = ScannerUtility.stringScanner();

					System.out.println("Enter your Zip code : ");
					String zip = ScannerUtility.stringScanner();

					System.out.println("Enter your state name :");
					String namestate = ScannerUtility.stringScanner();

					person.setFirstname(firstname);
					person.setLastname(lastname);
					person.setContact(contact);
					address.setCity(city);
					address.setZipcode(zip);
					address.setState(namestate);

					person.setAddress(address);
					personlist.add(person);

					model.setPerson(personlist);

					mapper.writeValue(new File(sourcein), model);
					break;

				case 2:

					boolean contactfound = false;

					System.out.println("Enter your contact number :");
					String con = ScannerUtility.stringScanner();

					for (int i = 0; i < personlist.size(); i++) {
						if (con.equals(personlist.get(i).getContact())) {
							contactfound = true;
							personindex = i;
						}

					}
					if (contactfound == true) {
						System.out.println(">Data found< ");
					} else {
						System.out.println(">Data not found< ");
						break;
					}

					System.out.println("Press 1 to change address \nPress 2 to change contact");

					switch (ScannerUtility.intScanner()) {
					case 1:

						System.out.println("Press 1 to change zipcode \nPress 2 to change city");
						switch (ScannerUtility.intScanner()) {
						case 1:

							System.out.println("Enter your new ZipCode :");
							String zip1 = ScannerUtility.stringScanner();
							personlist.get(personindex).getAddress().setZipcode(zip1);

							model.setPerson(personlist);

							mapper.writeValue(new File(sourcein), model);
							break;

						case 2:

							System.out.println("Enter your  new city name :");
							String city1 = ScannerUtility.stringScanner();

							personlist.get(personindex).getAddress().setCity(city1);

							model.setPerson(personlist);

							mapper.writeValue(new File(sourcein), model);
							break;

						}
						break;

					case 2:

						System.out.println("Enter your new contact");
						String newcontact = ScannerUtility.stringScanner();

						personlist.get(personindex).setContact(newcontact);

						model.setPerson(personlist);

						mapper.writeValue(new File(sourcein), model);
						break;

					}
					break;

				case 3:
					System.out.println("Sorting by name ");
					for (int i = 0; i < personlist.size() - 1; i++) {
						for (int j = 0; j < personlist.size() - i - 1; j++) {

							if (personlist.get(j).getLastname().compareTo(personlist.get(j + 1).getLastname()) > 0) {
								Object temp = personlist.get(j);
								personlist.set(j, personlist.get(j + 1));
								personlist.set(j + 1, (Person) temp);

							}
						}
					}
					model.setPerson(personlist);

					mapper.writeValue(new File(sourcein), model);
					break;

				case 4:

					System.out.println("Sorting by zipCode");
					for (int i = 0; i < personlist.size() - 1; i++) {
						for (int j = 0; j < personlist.size() - i - 1; j++) {

							if (personlist.get(j).getAddress().getZipcode()
									.compareTo(personlist.get(j + 1).getAddress().getZipcode()) > 0) {
								Object temp = personlist.get(j);
								personlist.set(j, personlist.get(j + 1));
								personlist.set(j + 1, (Person) temp);

							}
						}

					}
					model.setPerson(personlist);

					mapper.writeValue(new File(sourcein), model);
					break;

				case 5:

					System.out.println("Printing all data...");

					for (int i = 0; i < personlist.size(); i++) {
						System.out.println(personlist.get(i).toString());

					}
					break;
				case 6:
					int counter = 1;
					if (counter > 0) {
						System.out.println("Enter Persons contact you want to delete details:");
						String search = ScannerUtility.stringScanner();
						int indexOfPerson = 0;
						boolean isFoundPerson = false;
						for (int i = 0; i < personlist.size(); i++) {
							if (search.equals(personlist.get(i).getContact())) {
								isFoundPerson = true;
								indexOfPerson = i;
								break;
							}
						}
						if (isFoundPerson) {
							personlist.remove(indexOfPerson);
							counter--;
							System.out.println();
							System.out.println("Delete completed");

							model.setPerson(personlist);

							mapper.writeValue(new File(sourcein), model);

						} else
							System.out.println("No person found with this number");
					} else
						System.out.println("No records to delete");

					break;

				case 7:
					System.out.println("Thankyou for your time ");
					adressbook = true;

				}
				break;
			case 2:
				System.out.println("Printing all data...");

				for (int i = 0; i < personlist.size(); i++) {
					System.out.println(personlist.get(i).toString());

				}
				break;

			case 3:
				System.out.println("Adress book Saved ");
				mapper.writeValue(new File(sourcein), model);
				break;

			case 4:
				System.out.println("Saved As has been Done ..");
				mapper.writeValue(new File(sourceout), model);
				break;

			case 5:
				System.out.println("Thankyou for your time ");
				adressbook = true;

			}

		}
	}

}
