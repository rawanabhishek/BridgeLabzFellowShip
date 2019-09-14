/******************************************************************************
 
 *  Purpose: this utility class for data structure 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/ 
package com.bridgelabz.Utility;

import java.util.Arrays;

public class DataStructureUtility {
	/****************************************************************************/
	// to check the given number is a prime number or not

	public boolean PrimeChecker(int num) {
		if (num == 0 || num == 1) {
			// science 0 and 1 are not prime number
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					// returing false if the num is not prime
					return false;
				}

			}
			// reutring true if the num is prime number
			return true;
		}
	}
	/****************************************************************************/

	/*
	 * @param one take the value of first string from user
	 * 
	 * @param two take the value of second string from user
	 * 
	 * @return boolean true if the strings are anagram else false
	 */
	public boolean Anagram(String one, String two) {

		// converting the string one to char array
		char arr1[] = one.toCharArray();

		// converting the string two to char array
		char arr2[] = two.toCharArray();

		// soting the char arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		boolean result = Arrays.equals(arr1, arr2);
		// returning the boolean value
		return result;

	}
}
