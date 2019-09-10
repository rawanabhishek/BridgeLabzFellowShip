
/******************************************************************************
 
 *  Purpose: to check two string are anagram of each other 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.Utility.AlgorithmUtility;

public class Anagram {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		AlgorithmUtility utility = new AlgorithmUtility();

		//taking first string from user
		System.out.println("Enter String 1 : ");
		
		String one = scanner.nextLine();

		//taking second string from user
		System.out.println("Enter String 2 : ");
		String two = scanner.nextLine();

		//calling the utility 
		if (utility.Anagram(one, two)) {
			System.out.println("the given strings are anagram ");
		} else {
			System.out.println("the given strings are not anagram ");
		}
		
		scanner.close();
	}

}
