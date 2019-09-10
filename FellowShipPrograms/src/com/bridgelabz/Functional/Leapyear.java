
/******************************************************************************
 
 *  Purpose:  to check the given year is a leap year or not 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.Utility.FunctionalUtility;

public class Leapyear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility = new FunctionalUtility();

		System.out.println("Enter a year to check it is Leap Year or Not ");
		int year = scanner.nextInt();
		if (year > 1582) {
			if (utility.Leapyear(year)) {
				System.out.println("The " + year + " is a leap year");
			} else {
				System.out.println("The " + year + " is not  a leap year");
			}
		}

		scanner.close();

	}

}
