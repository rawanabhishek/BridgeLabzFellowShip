/******************************************************************************
 
 *  Purpose: to print the prime number between 0 to 1000 in a 2D Array
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/ 
package com.bridgelabz.dataStructure.copy;


import com.bridgelabz.utility.DataStructureUtility;

public class Prime2DArray {

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
					j1++;
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
					arr[i][j1] = j;
					j1++;
				}

			}
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		//printing the 2D array of prime
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
