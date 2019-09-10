
/******************************************************************************
 
 *  Purpose:  ­ Computes the prime factorization of N using brute force.
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.Utility.FunctionalUtility;

public class Factors {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility = new FunctionalUtility();

		System.out.println("Enter a Number ");
		int number = scanner.nextInt();

		utility.factorcompute(number);

		scanner.close();
	}

}
