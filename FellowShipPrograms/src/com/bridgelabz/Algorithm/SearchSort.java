package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.Utility.AlgorithmUtility;

public class SearchSort {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		Scanner scanner = new Scanner(System.in);
		
		//unsorted integer array
		int arr[] = { 5,6,4,1,2,8,9};
		
		//unsorted String array
		String str[] = { "baudi","abhi","karan","akansh","viany","rishi"};
		
		//calling utility class to perform bubble sort of integer
		utility.bubbleSortInteger(arr);
		System.out.println();
		double time1=utility.elapsedTime();
		System.out.println("Elpased time for bubble sort of  integter is "+time1+" milliseconds");
		System.out.println();
		
		//calling utility class to perform bubble sort of String
		utility.bubbleSortString(str);
		System.out.println();
		 double time2=utility.elapsedTime();
		 System.out.println("Elapsed time for bubble sort of string is "+time2+" milliseconds");
		 System.out.println();
		 
		//calling utility class to perform Insertion sort of integer
		utility.insertionSortInteger(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		double time3=utility.elapsedTime();
		System.out.println("Elapsed time for insertion sort of integer is "+time3+" milliseconds");
		 System.out.println();
		 
		 
		//calling utility class to perform insertion sort of string
		 utility.insertionSortString(str);
		 for(int i=0;i<str.length;i++) {
				System.out.print(str[i]+" ");
			}
		 System.out.println();
		 double time4=utility.elapsedTime();
		 System.out.println("Elapsed time for insertion sort of String is "+time4+" milliseconds");
		System.out.println();
		
		
		System.out.println("Enter a key value to search ");
		int key = scanner.nextInt();
		

		System.out.println("Enter a key value to search ");
		String keyStr = scanner.next();
		
		//calling utility class to perform binary search of Integer
		utility.binarySearchInt(arr, key);
		double time5=utility.elapsedTime();
		System.out.println("Elapsed time for binary search of integer is "+time5+" milliseconds");
		System.out.println();
		
		//calling utility class to perform binary search of string
		utility.binarySearchString(str, keyStr);
		double time6=utility.elapsedTime();
		System.out.println("Elapsed time for binary search of string is "+time6+" milliseconds");
		
		scanner.close();
	}

}
