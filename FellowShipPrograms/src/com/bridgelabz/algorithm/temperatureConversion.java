/******************************************************************************
 
 *  Purpose:  Program to convert the temperature according to the user prefernce
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class temperatureConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AlgorithmUtility utility = new AlgorithmUtility();
		int choice ;
		
		System.out.println("Enter your choice  \n"
				+ " 1. for Celsius to fahranheit \n"
				+ " 2. For fahranheit ti Celsius ");
		
		//scanning the choice of the user
		choice = scanner.nextInt();
		
		//entering a temperature 
		System.out.println("Enter A Temperature ");
		double temperature=scanner.nextDouble();
		
		
		//calling the utility class
		System.out.println(utility.tempconversion(temperature, choice));
		
		scanner.close();

	}

}
