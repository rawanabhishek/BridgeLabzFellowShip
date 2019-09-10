package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.Utility.AlgorithmUtility;

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
