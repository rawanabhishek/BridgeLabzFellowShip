
/******************************************************************************
 
 *  Purpose:  to print the harmonic number 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.Utility.FunctionalUtility;

public class HarmonicNumber {

	public static void main(String[] args) {
		FunctionalUtility utility = new FunctionalUtility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for command line argument : ");

		int n = scanner.nextInt();

		utility.Harmonic(n);

	}

}
