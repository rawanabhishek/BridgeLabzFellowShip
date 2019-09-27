/******************************************************************************
 
 *  Purpose: to print the primeAnagram number between 0 to 1000 in a 2D Array
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.dataStructure.copy;

import com.bridgelabz.utility.DataStructureUtility;

public class PrimeAnagram2DArray {

	public static void main(String[] args) {
		DataStructureUtility utility = new DataStructureUtility();
		int start = 0;
		int end = 100;
		int[][] arr1 = new int[10][];
		int[][] arr2 = new int[10][];

		int j1 = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = start; j < end; j++) {
				// checking j is prime or not and returning true or flase
				if (utility.PrimeChecker(j)) {
					for (int k = j+1; k < end; k++) {
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
			arr1[i] = new int[j1];
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
					for (int k = j+1; k < end; k++) {
						// checking j is prime or not and returning true or flase
						if (utility.PrimeChecker(k)) {
							// checking j & k is anagram or not and returning true or flase
							if (utility.Anagram(String.valueOf(j), String.valueOf(k))) {

								arr1[i][j1] = j;
								arr1[i][j1 + 1] = k;
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

		start = 0;
		end = 100;
		j1 = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = start; j < end; j++) {
				// checking j is prime or not and returning true or flase
				if (utility.PrimeChecker(j)) {
					for (int k = j+1; k < end; k++) {
						// checking k is prime or not and returning true or flase
						if (utility.PrimeChecker(k)) {
							// checking j & k is anagram or not and returning true or flase
							if (!utility.Anagram(String.valueOf(j), String.valueOf(k))) {
								j1 += 1;
							}
						}
					}
				}

			}
			arr2[i] = new int[j1];
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
					for (int k = j+1; k < end; k++) {
						// checking j is prime or not and returning true or flase
						if (utility.PrimeChecker(k)) {
							// checking j & k is anagram or not and returning true or flase
							if (!(utility.Anagram(String.valueOf(j), String.valueOf(k)))) {

								 arr2[i][j1] = j;
								//arr2[i][j1] = k;
								j1 += 1;
								break;
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
		// printing the 2D array of prime and anagram
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			if (arr1[i].length != 0)

				System.out.println();
		}

		System.out.println();
		//printing the non anagram prime array
		System.out.println("The prime non anagram are ");

		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if ((arr2[i][j] != 0)) {
					System.out.print(arr2[i][j] + " ");
				}
			}
			if (arr2[i].length != 0)
				System.out.println();

		}

	}

}
