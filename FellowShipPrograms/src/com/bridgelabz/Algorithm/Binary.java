/******************************************************************************
 
 *  Purpose:  to convert a decimal number into a binary number 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.Utility.AlgorithmUtility;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AlgorithmUtility utility = new AlgorithmUtility();

		System.out.println("Enter a number you want to convert into Binary : ");
		int num = scanner.nextInt();

		
		//calling the utility function to convert decimal to binary
		utility.decimaltobinary(num);

		System.out.println();
		//calling the swapnibble function and storing it in z 
		int z = utility.swapnibble(num);
		
		System.out.println("result : " + z);
		scanner.close();
	}

}
