/******************************************************************************
 
 *  Purpose: this is services class for address book To create and maintin a adress 
 *           book where you can perfrom functions like add person ,delete person ,edit person ,
 *           save file ,save as file and exit
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   25-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.AdressBookModel;
import com.bridgelabz.model.Person;
import com.bridgelabz.utility.ScannerUtility;
import com.bridgelabz.utility.jsonutility;

public class AddressBookServices implements addressbookinterface {

	static String sourcein = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/AdressBook.json";
	String sourceout = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/AdressBookSaveAs.json";

	ObjectMapper mapper = new ObjectMapper();
	AdressBookModel model = new AdressBookModel();

	ArrayList<Person> personlist = new ArrayList<Person>();

	int personindex = 0;

	/**
	 * purpose :-to add person to the address book
	 */
	@Override
	public void addPerson() throws JsonGenerationException, JsonMappingException, IOException {
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
		isContact = true;

		person.setFirstname(firstname);
		person.setLastname(lastname);
		person.setContact(contact);
		address.setCity(city);
		address.setZipcode(zip);
		address.setState(namestate);

		person.setAddress(address);
		personlist.add(person);

	
		
		printEntries();
//		model.setPerson(personlist);
//
//		mapper.writeValue(new File(sourcein), model);

	}

	/**
	 * purpose :- to edit person details of address book
	 */
	@Override
	public void editPerson() throws JsonGenerationException, JsonMappingException, IOException {
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

		case 2:

			System.out.println("Enter your new contact");
			String newcontact = ScannerUtility.stringScanner();

			personlist.get(personindex).setContact(newcontact);

			model.setPerson(personlist);

			mapper.writeValue(new File(sourcein), model);
			break;

		}

	}

	/**
	 * purpose :-to sort addressbook by last name
	 */
	@Override
	public void sortName() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Sorting by name.. ");

		Collections.sort(personlist, (e1, e2) -> e1.getLastname().compareTo(e2.getLastname()));
		printEntries();

		System.out.println("Sorting done.");

	}

	/**
	 * purpose :-to sort address book by zipcode
	 */
	@Override
	public void sortzip() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Sorting by zipCode");

		Collections.sort(personlist, (e1, e2) -> e1.getAddress().getZipcode().compareTo(e2.getAddress().getZipcode()));
		printEntries();
		System.out.println("Sorting done.");

	}

	/**
	 * purpose :- to print all the entries of the address book
	 */
	@Override
	public void printEntries() {
		System.out.println("Printing   all data ...");

//		personlist.forEach(i -> System.out.println(i.getFirstname() + "  " + i.getLastname() + " " + i.getContact()
//				+ "  " + "  " + i.getAddress().getCity() + "  " + i.getAddress().getZipcode() + "  "
//				+ i.getAddress().getState()));

		
		personlist.forEach(System.out::println);
	}

	/**
	 * purpose :- to delete a specific person object from address book
	 */
	@Override
	public void deletePerson() throws JsonGenerationException, JsonMappingException, IOException {
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

	}

	/**
	 * purpose :-to save address book data to the respository
	 */
	@Override
	public void saveAddressBook() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Adress book Saved ");
		mapper.writeValue(new File(sourcein), model);

	}

	/**
	 * purpose :-to save address book to the new repository
	 */
	@Override
	public void savedAs() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Enter the name of the file ");
		String fileName = ScannerUtility.stringScanner();
		System.out.println("A file name with "+fileName+".json has been created");
		mapper.writeValue(
				new File("/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/" + fileName + ".json"),
				model);
		

	}

	/**
	 * purpose :-to read the data from the repository
	 */
	public void readJson() throws JsonParseException, JsonMappingException, IOException {
		File newfile = new File(sourcein);

		if (newfile.length() != 0) {
			model = (AdressBookModel) jsonutility.readMapper(sourcein, model);

			personlist.addAll(model.getPerson());

		}

	}

}
