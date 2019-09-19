/******************************************************************************
 
 *  Purpose:  Program to find the square root of a number 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class Sqrt {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		AlgorithmUtility utility = new AlgorithmUtility();
		
		System.out.println("Enter a number you want to find the square root  : ");
	      int  c =scanner.nextInt();
	     
	      
		if(c>0) {
	       double result=utility.Square(c);
	       System.out.println("the square root of : "+c+ " is "+result);
	       
		}
		else {
			System.out.println("Enter a positive integer ");
		}
	      
		scanner.close();

	}

}
