
/******************************************************************************
 
 *  Purpose:  to print the harmonic number 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class HarmonicNumber {

	public static void main(String[] args) {
		FunctionalUtility utility = new FunctionalUtility();
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter a value for command line argument : ");

		int n = Integer.parseInt(args[0]);

		utility.Harmonic(n);
		
		scanner.close();

	}

}
