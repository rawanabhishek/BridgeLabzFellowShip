/******************************************************************************
 
 *  Purpose: to calcuate the monthly payment 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AlgorithmUtility utility = new AlgorithmUtility();
		System.out.println("Enter the Principal Amount : ");
		double principal = scanner.nextDouble();

		System.out.println("Enter the Total No of Years : ");
		double years = scanner.nextDouble();

		System.out.println("Enter the Rate Of Interest : ");
		double rate = scanner.nextDouble();

		//calling the utility to print the montly payment user have to make
		utility.Interest(principal, years, rate);

		scanner.close();

	}

}
