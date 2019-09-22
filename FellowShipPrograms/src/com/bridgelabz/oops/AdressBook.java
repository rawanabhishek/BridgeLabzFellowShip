package com.bridgelabz.oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.AdressBookModel;
import com.bridgelabz.model.Adressbook;
import com.bridgelabz.model.InventoryModel;
import com.bridgelabz.model.Person;
import com.bridgelabz.utility.ScannerUtility;

public class AdressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String sourcein = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/AdressBook.json";

		ObjectMapper mapper = new ObjectMapper();
		AdressBookModel model = new AdressBookModel();

		ArrayList<Adressbook> addresslist = new ArrayList<Adressbook>();
		ArrayList<Person> personlist = new ArrayList<Person>();
		ArrayList<Address> adress = new ArrayList<Address>();
		
		File newfile = new File(sourcein);

		if (newfile.length()!=0) {
			model = mapper.readValue(new File(sourcein), AdressBookModel.class);
			addresslist.addAll(model.getAdressbook());
			personlist.addAll(addresslist.get(0).getState());

		}

		boolean adressbook = false;
		int stateindex;
		int personindex;
		boolean statefound = false;

		while (adressbook != true) {

			System.out.println("\n Press 1 to Create new Address Book" + "\n Press 2 to Open Address Book"
					+ "\n Press 3 to close Address Book");

			switch (ScannerUtility.intScanner()) {

			case 1:

				System.out.println("\n Press 1 to Add a person" + "\n Press 2 to Edit a Person"
						+ "\n Press 3 to Sort Entries By name" + "\n Press 4 to Sort Entries By Zip"
						+ "\n Press 5 to Print Entries" + "\n Press 6 to Exit");

				switch (ScannerUtility.intScanner()) {

				case 1:
					Adressbook book = new Adressbook();
					Person person = new Person();
					Address address = new Address();

					stateindex = addresslist.size();
					System.out.println(stateindex);
					personindex = personlist.size();
					System.out.println(personindex);

					System.out.println("-------------------------------");
					System.out.println("Enter your state code :");
					String statename = ScannerUtility.stringScanner();
					book.setStatecode(statename);

					for (int i = 0; i < addresslist.size(); i++) {
						if (statename.equals(addresslist.get(i).getStatecode())) {
							statefound = true;
						}
					}

					
					
					
					System.out.println("Enter your first name :");
					String firstname = ScannerUtility.stringScanner();
					person.setFirstname(firstname);

					System.out.println("Enter your last name :");
					String lastname = ScannerUtility.stringScanner();
					person.setLastname(lastname);

					System.out.println("Enter your contact number :");
					String contact = ScannerUtility.stringScanner();
					person.setContact(contact);

					System.out.println("Enter your city ");
					String city = ScannerUtility.stringScanner();
					address.setCity(city);

					System.out.println("Enter your Zip code : ");
					String zip = ScannerUtility.stringScanner();
					address.setZipcode(zip);

					System.out.println("Enter your state name :");
					String namestate = ScannerUtility.stringScanner();
					address.setState(namestate);
					
					
					
					person.setAddress(address);
				
					adress.add(address);

					personlist.add(person);

					book.setState(personlist);
					addresslist.add(book);

					model.setAdressbook(addresslist);

					mapper.writeValue(new File(sourcein), model);

				case 2:

					if (!(addresslist.isEmpty())) {
						System.out.println("Press 1 to change address \nPress 2 to change contact");
						switch (ScannerUtility.intScanner()) {
						case 1:
							System.out.println("Press 1 to change zipcode \nPress 2 to change city");
							switch (ScannerUtility.intScanner()) {
							case 1:

								System.out.println("Enter new Zipcode");
								String newzip = ScannerUtility.stringScanner();

							case 2:
								System.out.println("Enter new city ");
								String newcity = ScannerUtility.stringScanner();

							}

						case 2:
							System.out.println("Enter your new contact");
							String newcontact = ScannerUtility.stringScanner();

						}
					}

				}

			case 2:
				System.out.println("Press 1 to open Whole adress book \nPress 2 to open  particular sate address");
				switch (ScannerUtility.intScanner()) {
				case 1:

				case 2:
				}
			case 3:
				System.out.println("Thankyou for your time ");
				adressbook = true;

			}

		}

	}

}
