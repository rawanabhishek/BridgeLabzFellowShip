package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.handler.LinkedList;
import com.bridgelabz.model.Company;
import com.bridgelabz.model.Companymodel;
import com.bridgelabz.utility.ScannerUtility;

public class CompanyShares {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String sourceCompany = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/Company.json";

		ObjectMapper mapper = new ObjectMapper();

		Companymodel model = new Companymodel();

		model = mapper.readValue(new File(sourceCompany), model.getClass());

		LinkedList<Company> list = new LinkedList<Company>();
		list.addAll(model.getCompany());
		
		list.show();
		
		
//
//		System.out.println("Enter the company symbol :"+list.getData(0));
//		String symbol = ScannerUtility.stringScanner();
//		boolean companyFound = false;
//		int companyindex = 0;
//		int companysize = list.getSize();
//		System.out.println(companysize);
//		for (int i = 0; i < companysize; i++) {
//			if (symbol.equals(list.getData(i))) {
//				companyindex = i;
//				companyFound = true;
//
//			}
//			if (companyFound == true) {
//				break;
//			}
//		}
//		int exit = 0;
//		System.out.println("Press 1 to add shares \nPress 2 to delete shares \nPress 3 to exit");
//		int choice = ScannerUtility.intScanner();
//
//		while (exit != 1) {
//			switch (choice) {
//			  
//
//			case 1:
//				System.out.println("Enter the number of share you want to add ");
//				int addShares=ScannerUtility.intScanner();
//				
//
//			case 2:
//				System.out.println("Enter the number of share you want to delete ");
//				int deleteShares=ScannerUtility.intScanner();
//				//if(deleteShares<=list.getData(companyindex))
//				
//				
//			case 3:
//				System.out.println("Thank you for your time.");
//				exit=1;
//
//			}
//		}

	}

}
