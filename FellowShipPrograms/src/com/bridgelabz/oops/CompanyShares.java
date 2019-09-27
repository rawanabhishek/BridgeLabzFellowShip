/******************************************************************************
 
 *  Purpose: Maintaining the List of CompanyShares in a Linked List So new 
 *           CompanyShares can be added or removed easily. 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;


import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;


import com.bridgelabz.handler.LinkedList;
import com.bridgelabz.model.Company;
import com.bridgelabz.model.Companymodel;
import com.bridgelabz.utility.ScannerUtility;
import com.bridgelabz.utility.jsonutility;

public class CompanyShares {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String sourceCompany = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/Company.json";

		

		Companymodel model = new Companymodel();

		model = (Companymodel) jsonutility.readMapper(sourceCompany, model);

		LinkedList<Company> list = new LinkedList<Company>();
		list.addAll(model.getCompany());

		System.out.println("Enter the company symbol :");
		String symbol = ScannerUtility.stringScanner();
		boolean companyFound = false;
		int companyindex = 0;
		int companysize = list.getSize();

		for (int i = 0; i < companysize; i++) {
			if (symbol.equals(list.getData(i).getSymbol())) {
				companyindex = i;
				companyFound = true;

			}
			if (companyFound == true) {
				break;
			}
		}
		int exit = 0;

		while (exit != 1) {
			if (companyFound == false) {
				System.out.println("Wrong company symbol  ");
				break;

			}
			System.out.println("--------------------------------------");
			System.out.println("Press 1 to add shares \nPress 2 to delete shares \nPress 3 to exit");
			int choice = ScannerUtility.intScanner();

			switch (choice) {

			case 1:
				System.out.println("Enter the number of share you want to add ");
				int addShares = ScannerUtility.intScanner();
				System.out.println("--------------------------------------");
				System.out.println("----Before Adding Company status----");
				System.out.println("Company Name :" + list.getData(companyindex).getName());
				System.out.println("Company Shares :" + list.getData(companyindex).getShares());
				System.out.println("Company Total Value: " + list.getData(companyindex).getTotalvalue());

				list.getData(companyindex).setShares(list.getData(companyindex).getShares() + addShares);
				list.getData(companyindex).setTotalvalue(list.getData(companyindex).getTotalvalue()
						+ addShares * list.getData(companyindex).getSharesprice());

				System.out.println("--------------------------------------");
				System.out.println("----After Adding Company status----");
				System.out.println("Company Name :" + list.getData(companyindex).getName());
				System.out.println("Company Shares  :" + list.getData(companyindex).getShares());
				System.out.println("Company Total Value :" + list.getData(companyindex).getTotalvalue());

				break;

			case 2:
				System.out.println("Enter the number of share you want to delete ");
				int deleteShares = ScannerUtility.intScanner();
				if (deleteShares <= list.getData(companyindex).getShares()) {
					System.out.println("--------------------------------------");
					System.out.println("----Before Deleting Company status----");
					System.out.println("Company Name :" + list.getData(companyindex).getName());
					System.out.println("Company Shares  :" + list.getData(companyindex).getShares());
					System.out.println("Company Total Value :" + list.getData(companyindex).getTotalvalue());
					list.getData(companyindex).setShares(list.getData(companyindex).getShares() - deleteShares);
					list.getData(companyindex).setTotalvalue(list.getData(companyindex).getTotalvalue()
							- deleteShares * list.getData(companyindex).getSharesprice());

					System.out.println("--------------------------------------");
					System.out.println("----Afte Deleting Company status----");
					System.out.println("Company Name :" + list.getData(companyindex).getName());
					System.out.println("Company Shares :" + list.getData(companyindex).getShares());
					System.out.println("Company Total Value :" + list.getData(companyindex).getTotalvalue());
					break;
				}

			case 3:
				System.out.println("Thank you for your time.");
				exit = 1;

			}
		}

	}

}
