/******************************************************************************
 
 *  Purpose:  ­ ­> to stimulate a  gambler who start with $stake and place fair $1 bets until
                 he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number 
                 of times he/she wins and the number of bets he/she makes. Run the experiment N
                 times, averages the results, and prints them out.
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class Gambling {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility = new FunctionalUtility();
		
		System.out.println("Enter Stake");
		int stake=scanner.nextInt();
		System.out.println("Enter Goal");
		int goal=scanner.nextInt();
		System.out.println("Enter Number of times");
		int num=scanner.nextInt();
		
		utility.gambler( stake, goal , num);
		
		scanner.close();
		

	}

}
