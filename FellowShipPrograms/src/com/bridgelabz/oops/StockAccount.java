/******************************************************************************
 
 *  Purpose: StockAccount.java implements a data type that  might be used by a 
 *           financial institution to keep track of customer information.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Company;
import com.bridgelabz.model.Companymodel;
import com.bridgelabz.model.Customer;
import com.bridgelabz.model.CustomerModel;
import com.bridgelabz.model.Transactions;
import com.bridgelabz.model.TransactionsModel;
import com.bridgelabz.utility.ScannerUtility;
import com.bridgelabz.utility.jsonutility;

public class StockAccount {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		// source file for json files
		String sourceCompany = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/Company.json";
		String sourceCustomer = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/Customer.json";
		String sourceTransaction = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/transaction.json";
		String sourceCompanyOut = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/companyout.json";
		String sourceCustomerOut = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/customerout.json";
		ObjectMapper mapper = new ObjectMapper();

		// creating object for model class
		Companymodel company = new Companymodel();
		CustomerModel customer = new CustomerModel();
		TransactionsModel transactionmodel=new TransactionsModel();
		 
          transactionmodel.setTransaction("Transactions");
       
        
		// creating arraylist of object
		List<Company> companylist = new ArrayList<>();
		List<Customer> customerlist = new ArrayList<>();
		ArrayList<Transactions> transactionlist = new ArrayList<Transactions>();

		company = (Companymodel) jsonutility.readMapper(sourceCompany, company);
		customer = (CustomerModel) jsonutility.readMapper(sourceCustomer, customer);
		
		
        File file=new File(sourceTransaction);
        if(file.length()>0) {
        	transactionmodel=mapper.readValue(new File(sourceTransaction), TransactionsModel.class);
        	transactionlist.addAll(transactionmodel.getTransactions());
        	
        }
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HHmmss");

		companylist.addAll(company.getCompany());
		customerlist.addAll(customer.getCustomer());
		
		


		int companyindex = 0;
		int customerindex = 0;
		int transactioncount=0;

		// validating the customer id
		boolean customerFound = false;
		System.out.println("Enter you id : ");
		String id = ScannerUtility.stringScanner();
		int customersize = customer.getCustomer().size();
		int companysize = company.getCompany().size();
		for (int i = 0; i < customersize; i++) {
			if (id.equals(customerlist.get(i).getid())) {
				customerFound = true;
				customerindex = i;

			}
			if (customerFound == true) {
				break;
			}
		}
		
		
		int choice = 0;
		int exit=0;
		while (exit != 1) {
			if(customerFound == false) {
				System.out.println("Wrong user id ");
				break;
				
			}
			
			// asking for user to perform operation
			if (customerFound == true) {
				System.out.println("----------------------------------");
				System.out.println("Press 1 to Buy Shares \nPress 2 to Sell Shares" + " \nPress 3 to"
						+ " ViewReport \nPress 4 to Exit");
				choice = ScannerUtility.intScanner();
			}

			boolean companyFound = false;
			switch (choice) {
			case 1:
				

				System.out.println("Enter company Symbol : ");
				String symbol = ScannerUtility.stringScanner();

				// validating the company id
				for (int i = 0; i < companysize; i++) {
					if (symbol.equals(companylist.get(i).getSymbol())) {
						companyindex = i;
						companyFound = true;

					}
					if (companyFound == true) {
						break;
					}
				}

				if (companyFound == true) {
					System.out.println("Enter the number of shares you want to buy ");
					int buy = ScannerUtility.intScanner();
					

							System.out.println("Do you want to save your transaction (yes/no)");
							String save = ScannerUtility.stringScanner();

							if (save.equals("yes")) {
								transactioncount++;
								
								if (buy <= companylist.get(companyindex).getShares()) {
									int purchaseAmount = companylist.get(companyindex).getSharesprice() * buy;
									if (customerlist.get(customerindex).getBalance() >= purchaseAmount) {

										customerlist.get(customerindex)
												.setBalance(customerlist.get(customerindex).getBalance() - purchaseAmount);

										customerlist.get(customerindex)
												.setShares(customerlist.get(customerindex).getShares() + buy);

										companylist.get(companyindex).setShares(companylist.get(companyindex).getShares() - buy);

										companylist.get(companyindex).setTotalvalue(companylist.get(companyindex).getTotalvalue()
												- buy * companylist.get(companyindex).getSharesprice());

										LocalDateTime now = LocalDateTime.now();

										String transactionID = dateTimeFormatter2.format(now)
												+ companylist.get(companyindex).getSymbol()
												+ customerlist.get(customerindex).getid();

										Transactions transaction = new Transactions();
			                            
										transaction.setTransactionid(transactionID);
										transaction.setAmount(purchaseAmount);
										transaction.setBuyer(customerlist.get(customerindex).getid());
										transaction.setSeller(companylist.get(companyindex).getSymbol());
										transaction.setDate(dateTimeFormatter.format(now));

										transactionlist.add(transaction);
								
								
								System.out.println("----------------------------------");
								System.out.println("Customer Name: "+customerlist.get(customerindex).getName());
								System.out.println("Shares Buyed : "+buy);
								System.out.println("Customer balance:"+customerlist.get(customerindex).getBalance());
								System.out.println("Customer Shares :"+customerlist.get(customerindex).getShares());
								
//								System.out.println("----------------------------------");
//								System.out.println("Transaction Date:"+transactionlist.get(0).getDate());
//								System.out.println("Transaction Id:"+transactionlist.get(0).getTransactionid());
//								System.out.println("transaction Amount:"+transactionlist.get(0).getAmount());
//								System.out.println("Buyer :"+transactionlist.get(0).getBuyer());
//								System.out.println("Seller :"+transactionlist.get(0).getSeller());
								
								
								transactionmodel.setTransactions(transactionlist);
								mapper.writeValue(new File(sourceCompanyOut), company.getCompany());
								mapper.writeValue(new File(sourceCustomerOut), customer.getCustomer());
								mapper.writeValue(new File(sourceTransaction), transactionmodel);

							} else {
								System.out.println("You transaction was not considered ");
								break;
								
							}
							break;

						} else {
							System.out.println("you have insufficent amount ");
							break;
						}
					} else {
						System.out.println("Company does not have that much shares ");
						break;
					}
				} else {
					System.out.println("Wrong company ");
					break;
				}

			case 2:
				System.out.println("Enter the number of share you want to sell");
				int share = ScannerUtility.intScanner();

				System.out.println("Enter the company symbol ");
				String sym = ScannerUtility.stringScanner();

				for (int i = 0; i < companysize; i++) {
					if (sym.equals(companylist.get(i).getSymbol())) {
						companyindex = i;
						companyFound = true;

					}
					if (companyFound == true) {
						break;
					}
				}

				if (companyFound == true) {
					if (share <= customerlist.get(customerindex).getShares()) {
						customerlist.get(customerindex).setShares(customerlist.get(customerindex).getShares() - share);
						customerlist.get(customerindex).setBalance(customerlist.get(customerindex).getBalance()
								- share * companylist.get(companyindex).getSharesprice());

						companylist.get(companyindex).setShares(companylist.get(companyindex).getShares() + share);

						companylist.get(companyindex).setTotalvalue(companylist.get(companyindex).getTotalvalue()
								+ share * companylist.get(companyindex).getSharesprice());

						LocalDateTime now = LocalDateTime.now();

						String transactionID = dateTimeFormatter2.format(now)
								+ companylist.get(companyindex).getSymbol() + customerlist.get(customerindex).getid();

						Transactions transaction = new Transactions();

						transaction.setTransactionid(transactionID);
						transaction.setAmount(share * companylist.get(companyindex).getSharesprice());
						transaction.setSeller(customerlist.get(customerindex).getid());
						transaction.setBuyer(companylist.get(companyindex).getSymbol());
						transaction.setDate(dateTimeFormatter.format(now));

						transactionlist.add(transaction);

						System.out.println("Do you want to save your transaction ");
						String save = ScannerUtility.stringScanner();

						if (save.equals("yess")) {
							transactioncount++;
							System.out.println("----------------------------------");
							System.out.println("Comapany Name: "+companylist.get(companyindex).getName());
							System.out.println("Shares Buyed : "+share);
							System.out.println("Company Value:"+companylist.get(companyindex).getTotalvalue());
							System.out.println("Company shares price:"+companylist.get(0).getSharesprice());
							System.out.println("Company  Shares :"+companylist.get(companyindex).getShares());
					
							
					
							jsonutility.writeMapper(sourceCompanyOut, company);
						//	mapper.writeValue(new File(sourceCompanyOut), company.getCompany());
							jsonutility.writeMapper(sourceCustomerOut, customer);
							//mapper.writeValue(new File(sourceCustomerOut), customer.getCustomer());
							
							jsonutility.writeMapper(sourceTransaction, transactionmodel);
							//mapper.writeValue(new File(sourceTransaction), transactionlist);

						} else {
							System.out.println("You transaction was nott considered ");
							break;
						}

						break;

					} else {
						System.out.println("You dont have that much shares ");
						break;
					}
				} else {
					System.out.println("Wrong company id ");
					break;
					
				}
				
			case 3:
				if(transactioncount!=0) {
					for(int i=0;i<transactionlist.size();i++) {
						System.out.println("----------------------------------");
					System.out.println("Transaction Date:"+transactionlist.get(i).getDate());
					System.out.println("Transaction Id:"+transactionlist.get(i).getTransactionid());
					System.out.println("transaction Amount:"+transactionlist.get(i).getAmount());
				
					System.out.println("Buyer :"+transactionlist.get(i).getBuyer());
					System.out.println("Seller :"+transactionlist.get(i).getSeller());
					}
				}else {
					System.out.println("You have no transactions ");
					break;
					
				}
				break;
			
				
				
				
			case 4:
				System.out.println("Thank you for your time ");
				exit=1;
				
				

			}

		}
	}

}
