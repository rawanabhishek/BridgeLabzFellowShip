/******************************************************************************
 
 *  Purpose: to print the primeAnagram number between 0 to 1000 in a 2D Array
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/ 
package com.bridgelabz.DataStructure;


import com.bridgelabz.Utility.DataStructureUtility;

public class PrimeAnagram2DArray {

	public static void main(String[] args) {
		DataStructureUtility utility = new DataStructureUtility();
		int start = 0;
		int end = 100;
		int[][] arr = new int[10][];

		
		int j1 = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = start; j < end; j++) {
				// checking j is prime or not and returning true or flase
				if (utility.PrimeChecker(j)) {
					for (int k = j + 1; k < end; k++) {
						// checking k is prime or not and returning true or flase
						if (utility.PrimeChecker(k)) {
							// checking j & k is anagram or not and returning true or flase
							if (utility.Anagram(String.valueOf(j), String.valueOf(k))) {
								j1 += 2;
							}
						}
					}
				}

			}
			arr[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;
		}

		j1 = 0;
		start = 0;
		end = 100;
		for (int i = 0; i < 10; i++) {
			for (int j = start; j < end; j++) {
				// checking j is prime or not and returning true or flase
				if (utility.PrimeChecker(j)) {
					for (int k = j + 1; k < end; k++) {
						// checking j is prime or not and returning true or flase
						if (utility.PrimeChecker(k)) {
							// checking j & k is anagram or not and returning true or flase
							if (utility.Anagram(String.valueOf(j), String.valueOf(k))) {

								arr[i][j1] = j;
								arr[i][j1+1] = k;
								j1 += 2;
							}
						}
					}
				}
			}
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		System.out.println("The prime anagram are ");
		
		System.out.println();
		//printing the 2D array of prime and anagram
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			if (arr[i].length != 0)
				System.out.println();
		}
			
		}

	

}
