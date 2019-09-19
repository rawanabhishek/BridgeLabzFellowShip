/******************************************************************************
 
 *  Purpose:Program to construct an algorithm to  input a string of characters 
 *          and check whether it is a palindrome.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.dataStructure;

import java.util.Arrays;

import com.bridgelabz.handler.QueueLinkedList;


public class PalindromeChecker {

	public static void main(String[] args) {
		
		QueueLinkedList<Character> utility2= new QueueLinkedList<Character>();
		//string to check it is palindrom or not
		String str = "rada";
		
		//converting the above to character array
		char[] arr = str.toCharArray();

		
		//creating two character array of lenth str string
		char[] str1 = new char[arr.length];
		char[] str2 = new char[arr.length];
		
		//enquing the arr[] data
 		for (int i = 0; i < arr.length; i++) {
			utility2.addRear(arr[i]);
		}

 		//dequeuing the arr[] from front 
		for (int i = 0; i < arr.length; i++) {

			str1[i] = (char) utility2.removeFront();
		}
		
		//enquing the arr[] data again
		for (int i = 0; i < arr.length; i++) {
			utility2.addRear(arr[i]);
		}
	
		//dequeing the arr[] from back
		for (int i = 0; i<arr.length; i++) {
			str2[i]=utility2.removeRear();
			
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(str1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.println(str2[i]+" ");
		}
		
		//comparing str1 and str2 array and priting it is palindrome or not
		if(Arrays.equals(str1, str2)) {
			System.out.println("The given string is pallindrom");
		}else {
			System.out.println("The given string is not pallindrom");
		}

	}

}
