package com.bridgelabz.oops;

import java.io.FileInputStream;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.AdressBookModel;
import com.bridgelabz.model.Adressbook;
import com.bridgelabz.model.Gj;
import com.bridgelabz.model.Mh;
import com.bridgelabz.model.Mp;
import com.bridgelabz.model.Wb;
import com.bridgelabz.utility.ScannerUtility;
import com.bridgelabz.handler.LinkedList;

public class AdressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String sourcein = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/AdressBook.json";

		ObjectMapper mapper = new ObjectMapper();
		AdressBookModel model=new AdressBookModel();
		model=mapper.readValue(new FileInputStream(sourcein), AdressBookModel.class);
		
		
		
	    LinkedList<Adressbook> adresslist=new LinkedList<Adressbook>();
	    
		LinkedList<Mh> mhlist = new LinkedList<Mh>();
		LinkedList<Mp> mplist = new LinkedList<Mp>();
		LinkedList<Wb> wblist = new LinkedList<Wb>();
		LinkedList<Gj> gjlist = new LinkedList<Gj>();

		adresslist.addAll(model.getAdressbook());
		mhlist.addAll(adresslist.getData(0).getMh());
		mplist.addAll(adresslist.getData(1).getMp());
		wblist.addAll(adresslist.getData(2).getWb());
		gjlist.addAll(adresslist.getData(3).getGj());

		boolean adressbook = false;
		int stateindex;
		boolean statefound = false;

		while (adressbook != true) {

			System.out.println("\n Press 1 to Create new Address Book" + "\n Press 2 to Open Address Book"
					+ "\n Press 3  to close Address Book" + "\n Press 4 to save Address Book"
					+ "\n Press 5 to SaveAs Address Book" + "\n Press 6 to Exit");

			switch (ScannerUtility.intScanner()) {

			case 1:
				System.out.println("Enter your state code");
				String statecode = ScannerUtility.stringScanner();

				// boolean yes=adresslist.Search(statecode, adresslist.getSize());

				for (int i = 0; i < adresslist.getSize(); i++) {
					System.out.println(adresslist.getData(i).getStatename());
					if (statecode.equals(adresslist.getData(i).getStatename())) {

						statefound = true;
					}
				}

				if (statefound == true) {
					System.out.println("\n Press 1 to Add a person" + "\n Press 2 to Edit a Person"
							+ "\n Press 3  to Sort Entries By name" + "\n Press 4 to Sort Entries By Zip"
							+ "\n Press 5 to Print Entries" + "\n Press 6 to Exit");

				} else {
					
					
					System.out.println();
					for (int i = 0; i < adresslist.getSize(); i++) {
						System.out.println(adresslist.getData(i).getStatename());
						
					}

				}

			case 2:
			case 3:
			case 4:
			case 5:
			case 6:

			}

		}

	}

}
