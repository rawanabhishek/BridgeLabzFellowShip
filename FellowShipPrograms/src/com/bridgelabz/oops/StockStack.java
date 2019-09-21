package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.handler.LinkedList;
import com.bridgelabz.model.Company;
import com.bridgelabz.model.Companymodel;
import com.bridgelabz.model.Customer;
import com.bridgelabz.model.CustomerModel;

public class StockStack {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String sourceCompany = "/home/admin1/FellowShip/FellowShipPrograms/src/com/"
				+ "bridgelabz/json/Company.json";
		String sourceCustomer = "/home/admin1/FellowShip/FellowShipPrograms/src/com/"
				+ "bridgelabz/json/Customer.json";
		
		ObjectMapper mapper = new ObjectMapper();

		// creating object for model class
		Companymodel company = new Companymodel();
		CustomerModel customer = new CustomerModel();
		
		LinkedList<Company> companylist = new LinkedList<Company>();
		LinkedList<Customer> customerlist = new LinkedList<Customer>();
		
		
		company = mapper.readValue(new File(sourceCompany), Companymodel.class);
		customer = mapper.readValue(new File(sourceCustomer), CustomerModel.class);
		
		companylist.addAll(company.getCompany());
		
		//System.out.println(companylist.getData(0).getClass()
		
	}

}
