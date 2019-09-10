/******************************************************************************
 
 *  Purpose:  this is utility class for functional Programs 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class FunctionalUtility {

	/******************************************************************************/
	// to replace the name in the given string
	public void ReplaceName(String str, String name) {

		String RecString = "";

		if (str.length() > 3) {
			RecString = str.replace("<<UserName>>", name);

		}

		System.out.println(RecString);
	}

	/******************************************************************************/

	// to flip a coin n number of times and give the percentage of head and tail
	public String Coin(int flip) {
		int head = 0, tail = 0;
		for (int i = 0; i < flip; i++) {
			double flipping = Math.random();

			if (flipping <= 0.5) {
				System.out.println(" Heads ");
				head++;
			} else {
				System.out.println(" Tails");
				;
				tail++;
			}

		}

		double averagehead = (int) head * 100 / flip;

		double averagetail = (int) tail * 100 / flip;

		return "Percentage of Head is " + averagehead + " Percentage of tail is " + averagetail;
	}

	/******************************************************************************/

	/*
	 * Purpose: to Check the given year is a leap year or not
	 * 
	 * @param year take input from user to check the leap year
	 * 
	 * @return return true if it is leap year else return false
	 */

	public Boolean Leapyear(int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else if (year % 4 == 0 && year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/******************************************************************************/
	// Purpose: to print the table of Power of 2

	public void Power(int number) {
		for (int i = 0; i <= number; i++) {

			int Table = (int) Math.pow(2, i);
			System.out.println("2 ^ " + i + " =" + Table);

		}

	}

	/******************************************************************************/
	// Purpose: to print harmonic number

	public void Harmonic(int n) {
		double sum = 0;
		if (n >= 1) {
			for (int i = 1; i <= n; i++) {
				double Hn = 1.0 / i;

				sum += Hn;

			}

			System.out.println("The  Hamrmonic Number is  :" + sum);
		}

	}

	/******************************************************************************/
	// Purpose: to compute factor of given numbers
	public void factorcompute(int number) {

		for (int i = 2; i * i <= number; i++) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}

		}

		if (number > 1)
			System.out.println(number);
		else
			System.out.println();

	}

	
	/******************************************************************************/
	// Purpose : to print the no of wins , average win and average loss 

	
	public void gambler(int stake, int goal, int num) {
		int win=0,loss=0,bets=0;
		
		for(int i=0;i<num;i++) {
		double value= Math.random();
		if(value>0.5) {
			stake++;
			win++;
			bets++;
			
		}
		else {
			stake--;
			loss++;
			bets++;
		}
		
		if(stake==goal || stake==0) {
			break;
		}
		}
		 System.out.println("No of wins is "+win);
		 double averagewin=(win*100)/bets;
		 double averageloss=(loss*100)/bets;
		 System.out.println("Average  wins is "+averagewin);
		 System.out.println("Average  loss is "+averageloss);
		
		
		
	}
	/******************************************************************************/
	// Purpose : to generate random number in a given range
	
	public int random(int range) {
		return (int)(Math.random()*range);
	}
	
	
	/******************************************************************************/
	// Purpose : to print the no of wins , average win and average loss 
	
	public int coupon(int range) {
		int count=0;
		int distinct=0;
		int value;
		boolean isCollected[]=new boolean[range];
		while(distinct<range) {
			 value=random(range);
			 count++;
			 if(!isCollected[value]) {
				 distinct++;
				 isCollected[value]=true;
			 }
		}
		
		return count;
		
		
		
	}
	
}
