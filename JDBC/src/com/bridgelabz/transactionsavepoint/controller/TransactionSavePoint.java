/******************************************************************************
 
 *  Purpose: program to perform transaction save point using prepared statement
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.transactionsavepoint.controller;

import com.bridgelabz.transactionsavepoint.service.ImplSavePoint;

public class TransactionSavePoint {
	public static void main(String[] args) throws Exception {
		
		System.out.println(" Transaction Using Save point");
		
		ImplSavePoint utility=new ImplSavePoint();
		
		utility.savePoint();
		
		System.out.println("Transaction using Save point  performed successfully");
		
		
		

	}

}
