/******************************************************************************
 
 *  Purpose:  this is utility class for functional Programs 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class FunctionalUtility {

	/******************************************************************************/
	// to replace the name in the given string
	public void ReplaceName(String str, String name) {

		String RecString = "";

		if (str.length() > 3) {
			RecString = str.replace("<<UserName>>", name);

		}

		System.out.println(RecString);
	}

	/******************************************************************************/

	// to flip a coin n number of times and give the percentage of head and tail
	public String Coin(int flip) {
		int head = 0, tail = 0;
		for (int i = 0; i < flip; i++) {
			double flipping = Math.random();

			if (flipping <= 0.5) {
				System.out.println(" Heads ");
				head++;
			} else {
				System.out.println(" Tails");
				;
				tail++;
			}

		}

		double averagehead = (int) head * 100 / flip;

		double averagetail = (int) tail * 100 / flip;

		return "Percentage of Head is " + averagehead + " Percentage of tail is " + averagetail;
	}

	/******************************************************************************/

	/*
	 * Purpose: to Check the given year is a leap year or not
	 * 
	 * @param year take input from user to check the leap year
	 * 
	 * @return return true if it is leap year else return false
	 */

	public Boolean Leapyear(int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else if (year % 4 == 0 && year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/******************************************************************************/
	// Purpose: to print the table of Power of 2

	public void Power(int number) {
		for (int i = 0; i <= number; i++) {

			int Table = (int) Math.pow(2, i);
			System.out.println("2 ^ " + i + " =" + Table);

		}

	}

}
