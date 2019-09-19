/******************************************************************************
 
 *  Purpose: ­Create  A library for reading in 2D arrays of integers, doubles, or booleans from
             standard input and printing them out to standard output.­
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility = new FunctionalUtility();
		System.out.println("Enter the value for row : ");
		int row=scanner.nextInt();
		System.out.println("Enter the Value for coloumn : ");
		int coloumn=scanner.nextInt();
		
		//initializing the int array
		int arr[][] = new int[row][coloumn];
		
		//initializing the double array
		double arr1[][]=new double[row][coloumn];
		
		//initializing the boolean array
		boolean arr2[][]=new boolean[row][coloumn];
		
		//calling the utility function to scan integer array
		utility.ScanIntArray(arr,row ,coloumn);
		
		//calling the utility function to print integer array
		utility.printIntArray(arr, row, coloumn);
		
		System.out.println();
		//calling the utility function to scan double array
		utility.ScanDoubleArray(arr1, row, coloumn);
		
		//calling the utility function to print double array
		utility.printDoubleArray(arr1, row, coloumn);
		
		System.out.println();
		//calling the utility function to scan boolean array
		utility.ScanBooleanArray(arr2, row, coloumn);
		
		//calling the utility function to print boolean array
		utility.printBooleanArray(arr2, row, coloumn);
		
		scanner.close();
	}

}
