/******************************************************************************
 
 *  Purpose:Program to construct an algorithm to  input a string of characters 
 *          and check whether it is a palindrome.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.DataStructure;

import java.util.Arrays;

import com.bridgelabz.DatastructureUtility.QueueUtility;

public class PalindromeChecker {

	public static void main(String[] args) {
		QueueUtility<Character> utility = new QueueUtility<Character>();
		
		//string to check it is palindrom or not
		String str = "radar";
		
		//converting the above to character array
		char[] arr = str.toCharArray();

		
		//creating two character array of lenth str string
		char[] str1 = new char[arr.length];
		char[] str2 = new char[arr.length];
		
		//enquing the arr[] data
 		for (int i = 0; i < arr.length; i++) {
			utility.enQueue(arr[i]);
		}

 		//dequeuing the arr[] from front 
		for (int i = 0; i < arr.length; i++) {

			str1[i] = utility.deQueue();
		}
		
		//enquing the arr[] data again
		for (int i = 0; i < arr.length; i++) {
			utility.enQueue(arr[i]);
		}
		
		//dequeing the arr[] from back
		for (int i = arr.length-1; i >=0; i--) {

			str2[i] = utility.deQueue();
		}
		
		//comparing str1 and str2 array and priting it is palindrome or not
		if(Arrays.equals(str1, str2)) {
			System.out.println("The given string is pallindrom");
		}else {
			System.out.println("The given string is not pallindrom");
		}

	}

}
