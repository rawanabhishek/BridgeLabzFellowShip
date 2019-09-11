/******************************************************************************
 
 *  Purpose:  this is utility class for functional Programs 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

import java.util.Scanner;

public class FunctionalUtility {

	Scanner scanner = new Scanner(System.in);

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
		int win = 0, loss = 0, bets = 0;

		for (int i = 0; i < num; i++) {
			double value = Math.random();
			if (value > 0.5) {
				stake++;
				win++;
				bets++;

			} else {
				stake--;
				loss++;
				bets++;
			}

			if (stake == goal || stake == 0) {
				break;
			}
		}
		System.out.println("No of wins is " + win);
		double averagewin = (win * 100) / bets;
		double averageloss = (loss * 100) / bets;
		System.out.println("Average  wins is " + averagewin);
		System.out.println("Average  loss is " + averageloss);

	}

	/******************************************************************************/
	// Purpose : to generate random number in a given range

	public int random(int range) {
		return (int) (Math.random() * range);
	}

	/******************************************************************************/
	// Purpose : to print the no of wins , average win and average loss

	public int coupon(int range) {
		int count = 0;
		int distinct = 0;
		int value;
		boolean isCollected[] = new boolean[range];
		while (distinct < range) {
			value = random(range);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}

		return count;

	}

	/******************************************************************************/
	// Purpose : to take input from user to store value in a array

	public void ScanIntArray(int arr[][], int row, int coloumn) {

		System.out.println("Enter the value for [row][coloumn] for Integer array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.println("[" + i + "] " + "[" + j + "]");
				arr[i][j] = scanner.nextInt();

			}

		}

	}

	/******************************************************************************/
	// Purpose : to print value of a given array

	public void printIntArray(int arr[][], int row, int coloumn) {
		System.out.println("The integer array is ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}

	/******************************************************************************/
	// Purpose : to take input from user to store value in a array

	public void ScanDoubleArray(double arr[][], int row, int coloumn) {

		System.out.println("Enter the value for [row][coloumn] for Double Array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.println("[" + i + "] " + "[" + j + "]");
				arr[i][j] = scanner.nextDouble();

			}

		}

	}

	/******************************************************************************/
	// Purpose : to print value of a given array

	public void printDoubleArray(double arr[][], int row, int coloumn) {
		System.out.println("The Double array is ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(arr[i][j] + "  ");

			}
			System.out.println();
		}
	}

	/******************************************************************************/
	// Purpose : to take input from user to store value in a array

	public void ScanBooleanArray(boolean arr[][], int row, int coloumn) {
		System.out.println("Enter the value for [row][coloumn] for boolean Array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.println("[" + i + "] " + "[" + j + "]");
				arr[i][j] = scanner.nextBoolean();

			}

		}
	}

	/******************************************************************************/
	// Purpose : to print value of a given array

	public void printBooleanArray(boolean arr[][], int row, int coloumn) {
		System.out.println("The boolean array is ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(arr[i][j] + "  ");

			}
			System.out.println();
		}
	}

	/******************************************************************************/
	// Purpose : to print the sum of three numbers whose values are equal to zero

	public void triplets(int[] arr, int n) {
		int found = 0;
		// prints if triplets with zero sum is found
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

						found++;
					}
				}
			}
		}
		// If no triplet with 0 sum found in array
		if (found == 0)
			System.out.println(" not exist ");

	}

	/******************************************************************************/
	/*
	 * Purpose: to find the euclidean distance
	 * 
	 * @param x to take the value of x from the user
	 * 
	 * @param y to take the value of y from the user
	 * 
	 * @return return the value of distance
	 */
	public Double Distance(double x, double y) {
		double distance = Math.sqrt(x * x + y * y);

		return distance;
	}

	/********************************************************************************/
	/*
	 * Purpose: to find the root of the quadratic equation
	 * 
	 * @param a taking value of a from user
	 * 
	 * @param b taking value of b from user
	 * 
	 * @param c taking value of c from user
	 * 
	 * @return
	 */
	public String Quadratic(double a, double b, double c) {
		// calculating delta
		double delta = (b * b - (4 * a * c));

		// calculating the first root
		double root1 = (-b + Math.sqrt(delta) / (2 * a));

		// calculating the second root
		double root2 = (-b - Math.sqrt(delta) / (2 * a));

		// returing the value of root 1 and root 2
		return "Root   is  : " + root1 + " and  " + root2;

	}

	/****************************************************************************************************/
	/*
	 * Purpose: to find the windchill temperature in farenheit
	 * 
	 * @return return wind chill temperature
	 */

	public String wind(double temperature, double windspeed) {

		// checking weather the temprature is less than 51 and windspped lies between 3
		// to 121
		while (!(temperature >= 50) || !(windspeed >= 120 || windspeed < 3)) {
			double windchill = 35.74 + 0.6215 * temperature
					+ (0.4275 * temperature - 35.75) * Math.pow(windspeed, 0.16);
			return "the wind Chill in Fahrenheit is : " + windchill;

		}
		return "Wrong input";

	}

	/*************************************************************************************************/
	// Purpose: to find the elapsed time

	private final long start;

	public FunctionalUtility() {
		start = System.currentTimeMillis();
	}

	// return the elapsed time
	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}
	
	/*************************************************************************************************/
	// Purpose: to permute the string 

	public void permute(String str,int start, int size) {
		if(size==start) {
			System.out.println(str);
		}
		else {
			for(int i=start;i<=size;i++) {
				str=swap(str,start,i);
				permute(str,start+1,size );
				str=swap(str,start,i);
			}
		}
		
	}

	public String swap(String str, int i, int j) {
		char temp;
		char[] arr=str.toCharArray();
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		return String.valueOf(arr);
	}

}
