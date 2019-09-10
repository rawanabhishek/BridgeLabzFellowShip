/******************************************************************************
 
 *  Purpose:  Program to calculate the minimum number  of Notes as well as the Notes to be 
 *            returned by the Vending Machine as a Change
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.Utility.AlgorithmUtility;

public class VendingMachine {
	
  	
  	
	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		Scanner scanner = new Scanner(System.in);
		int[] notes = { 1000,500,100,50,10,5,2,1};

		//ask the user enter the money
		System.out.print("Enter the Amount:");
		int money =scanner.nextInt();

		// Creating The Object of Vending MAchine class
		utility.calculate(money,notes);
		//System.out.println("Total Number of Notes are :"+total);


		scanner.close();
	}

}
