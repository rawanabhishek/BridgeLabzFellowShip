
/******************************************************************************
 
 *  Purpose:  to flip coin n number of times and print the average head and tail
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.Utility.FunctionalUtility;

public class FlipCoin {

	public static void main(String[] args) {
		
		       Scanner  scanner = new Scanner(System.in);
		       FunctionalUtility utility = new FunctionalUtility();
		       int flip;
		       System.out.println("Enter the Number of times you want to flip Coin : ");
		       flip =scanner.nextInt();
		       
		       System.out.println(utility.Coin(flip));
		       
		       scanner.close();
			}

	

}
