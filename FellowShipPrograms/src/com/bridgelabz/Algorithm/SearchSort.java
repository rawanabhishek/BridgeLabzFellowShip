package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.Utility.AlgorithmUtility;

public class SearchSort {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		Scanner scanner = new Scanner(System.in);
		int arr[] = { 5,6,4,1,2,8,9};
		String str[] = { "baudi","abhi","karan","akansh","viany","rishi"};
		utility.bubbleSortInteger(arr);
		
		System.out.println();
		utility.bubbleSortString(str);
		 System.out.println();
		 
		 
		utility.insertionSortInteger(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		 System.out.println();
		 utility.insertionSortString(str);
		 
		 for(int i=0;i<str.length;i++) {
				System.out.print(str[i]+" ");
			}
		System.out.println();
		System.out.println("Enter a key value to search ");
		int key = scanner.nextInt();

		System.out.println("Enter a key value to search ");
		String keyStr = scanner.next();
		utility.binarySearchInt(arr, key);
		utility.binarySearchString(str, keyStr);
	}

}
