/******************************************************************************
 
 *  Purpose:  this is utility class for Algorithm Programs 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

import java.util.Arrays;

public class AlgorithmUtility {

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

	/****************************************************************************/
	// to print the prime number in a given range

	public void primeRange(int start, int end) {
		int temp = 0;
		int count = 0;
		// start the loop from start and ending at end
		for (int i = start; i < end; i++) {
			
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					temp++;
					
				}
			}
			if (temp == 0 && i!=0 && i!=1) {
				System.out.print(i + " ");
				if(count==25) {
				count = 0;
				}
			}
			
			temp = 0;
		}

	}
	
	/****************************************************************************/
	// to check the given number is a prime number or not
	
	public boolean PrimeChecker(int num) {
		if(num ==0 || num==1) {
			// science 0 and 1 are not prime number
			return false;
		}
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					//returing false if the num is not prime
					return false;
				}
				
			}
			//reutring true if the num is prime number
			return true;
		}
	}
	
	/****************************************************************************/
	// to check the given number is pallindrom or not

	
	public boolean pallindrom(int num) {
		int rem ,sum=0 ;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			return true;
		}
		else {
			return false;
		}
	}
}
