/******************************************************************************
 
 *  Purpose: Given N distinct Coupon Numbers, how many random numbers do you
             need to generate distinct coupon number? This program simulates this random
             process.­ ­
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.Utility.FunctionalUtility;

public class CouponNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility = new FunctionalUtility();
		
		System.out.println("Enter the Range of N distinct Coupon Number : ");
		int range=scanner.nextInt();
		
		
		System.out.println(utility.coupon(range)+" random numbers are required to "
				+ "generate "+ range+" distinct coupon number");
		scanner.close();

	}
	
	

}
