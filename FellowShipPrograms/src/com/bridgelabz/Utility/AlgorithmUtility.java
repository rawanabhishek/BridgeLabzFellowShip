/******************************************************************************
 
 *  Purpose:  this is utility class for Algorithm Programs 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {

	Scanner scanner = new Scanner(System.in);

	/****************************************************************************/

	/*
	 * @param one take the value of first string from user
	 * 
	 * @param two take the value of second string from user
	 * 
	 * @return boolean true if the strings are anagram else false
	 */
	public boolean Anagram(String one, String two) {

		// converting the string one to char array
		char arr1[] = one.toCharArray();

		// converting the string two to char array
		char arr2[] = two.toCharArray();

		// soting the char arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		boolean result = Arrays.equals(arr1, arr2);
		// returning the boolean value
		return result;

	}

	/****************************************************************************/
	// to print the prime number in a given range

	public void primeRange(int start, int end) {
		int temp = 0;
		int count = 0;
		// start the loop from start and ending at end
		for (int i = start; i < end; i++) {

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					temp++;

				}
			}
			if (temp == 0 && i != 0 && i != 1) {
				System.out.print(i + " ");
				if (count == 25) {
					count = 0;
				}
			}

			temp = 0;
		}

	}

	/****************************************************************************/
	// to check the given number is a prime number or not

	public boolean PrimeChecker(int num) {
		if (num == 0 || num == 1) {
			// science 0 and 1 are not prime number
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					// returing false if the num is not prime
					return false;
				}

			}
			// reutring true if the num is prime number
			return true;
		}
	}

	/****************************************************************************/
	// to check the given number is pallindrom or not

	public boolean pallindrom(int num) {
		int rem, sum = 0;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}

	/****************************************************************************/
	// to perform binary search on integer array
	public void binarySearchInt(int[] arr, int key) {
		// 1 2 4 5 6 8 9
		int li, hi, mi;
		int size = arr.length;

		li = 0;
		hi = size - 1;
		mi = (li + hi) / 2;

		// taking the while till li is equal to hi
		while (li <= hi) {

			// mi is equal to key printing the position and breaking the loop
			if (arr[mi] == key) {
				System.out.println("The Integerkey is at " + mi + " position");
				break;
			} else if (arr[mi] > key) {

				hi = mi - 1;
				mi = (li + hi) / 2;
			} else {
				li = mi + 1;
				mi = (li + hi) / 2;
			}

		}

	}

	/****************************************************************************/
	// to perform binary search on string array

	public void binarySearchString(String[] arr, String keyStr) {
		int li, hi, mi;
		int size = arr.length;

		li = 0;
		hi = size - 1;
		mi = (li + hi) / 2;

		// taking the while till li is equal to hi
		while (li <= hi) {

			// mi is equal to key printing the position and breaking the loop
			if (arr[mi].equals(keyStr)) {
				System.out.println("The Stringkey is at " + mi + " position");
				break;
			} else if (arr[mi].compareTo(keyStr) > 0) {

				hi = mi - 1;
				mi = (li + hi) / 2;
			} else {
				li = mi + 1;
				mi = (li + hi) / 2;
			}

		}

	}

	/****************************************************************************/
	// to perform insertion sort on integer

	public void insertionSortInteger(int arr[]) {

		int key;
		int j;

		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}

	}

	/****************************************************************************/
	// to perform insertion sort on String

	public void insertionSortString(String arr[]) {

		String key;
		int j;

		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && (arr[j].compareTo(key) > 0)) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

		}

	}

	/****************************************************************************/
	// to perform bubble sort on intger

	public void bubbleSortInteger(int a[]) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;

				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/****************************************************************************/
	// to perform bubble sort on string

	public void bubbleSortString(String a[]) {
		String temp;
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = 1;

				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/****************************************************************************/
	// to clalcute the notes of n notes to be given to user

	public void calculate(int money, int[] notes) {
		int i = 0;
		int rem;

		// calling calculate Function
		while (money > 0) {
			if (money >= notes[i]) {
				// logic for Calculating The notes
				int calNotes = money / notes[i];
				rem = money % notes[i];
				money = rem;
				// total += calNotes;
				System.out.println(notes[i] + " Notes ---> " + calNotes);
			}
			i++;
		}
	}

	/******************************************************************************/
	/*
	 * Purpose: to Check the given year is a leap year or not
	 * 
	 * @param year take input from user to check the leap year
	 * 
	 * @return return weather the given year is a leap year or not
	 */
	public boolean LeapyearChecker(int year) {
		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			return true;
		}

		else {
			return false;
		}
	}

	/********************************************************************************/
	// Purpose: to print on which day the particular date falls

	public boolean DaysWeek(int date, int month, boolean LeapyearChecker) {

		switch (month) {

		case 1:
			if (date >= 1 && date <= 31) {
				return true;
			} else {
				return false;
			}

		case 2:
			if (LeapyearChecker) {
				if (date >= 1 && date <= 29) {
					return true;
				} else {
					return false;
				}
			} else {

				if (date >= 1 && date <= 28) {
					return true;
				} else {
					return false;
				}
			}

		case 3:
			if (date > 0 && date <= 31) {
				return true;
			} else {
				return false;
			}

		case 4:
			if (date > 0 && date <= 30) {
				return true;
			} else {
				return false;
			}

		case 5:
			if (date > 0 && date <= 31) {
				return true;
			} else {
				return false;
			}

		case 6:
			if (date > 0 && date <= 30) {
				return true;
			} else {
				return false;
			}

		case 7:
			if (date > 0 && date <= 31) {
				return true;
			} else {
				return false;
			}

		case 8:
			if (date > 0 && date <= 31) {
				return true;
			} else {
				return false;
			}

		case 9:
			if (date > 0 && date <= 30) {
				return true;
			} else {
				return false;
			}

		case 10:
			if (date > 0 && date <= 31) {
				return true;
			} else {
				return false;
			}

		case 11:
			if (date > 0 && date <= 30) {
				return true;
			} else {
				return false;
			}

		case 12:
			if (date > 0 && date <= 31) {
				return true;
			} else {
				return false;
			}

		}
		return false;
	}

	/*************************************************************************************/
	// Purpose: formula to validate the day

	public static int DayValidate(int date, int month, int year) {

		int y1 = year - (14 - month) / 12;
		int x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		int m1 = month + 12 * ((14 - month) / 12) - 2;
		int d1 = (int) (date + x + 31 * m1 / 12) % 7;

		return d1;

	}

	/********************************************************************************/
	// Purpose: to find the windchill temperature in farenheit

	// @return return wind chill temperature

	public String tempconversion(double temperature, int choice) {
		if (choice == 1) {
			double CelsiustoFehranheit = (temperature * 9 / 5) + 32;
			return "The Temperature Converted in Celsius to Fehranheit is  :" + CelsiustoFehranheit;
		} else if (choice == 2) {
			double FehranheitToCelsius = (temperature - 32) * 5 / 9;
			return "The temperature Converted In Fehranheit to Celsius is :" + FehranheitToCelsius;
		}
		return null;

	}

	/**********************************************************************************/
	// Purpose: to print the square root of a number

	public double Square(int c) {

		double t;
		t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;

		}
		return t;

	}

	/******************************************************************************/
	// Purpose: to find the elapsed time

	private final long start;

	public AlgorithmUtility() {
		start = System.currentTimeMillis();
	}

	// return the elapsed time
	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}

	/*****************************************************************************/
	// Purpose: to print the monthly payment

	public void Interest(double principal, double years, double rate) {
		double payment;
		double n = 12 * years;
		double r = rate / (12 * 100);

		payment = principal * r / 1 - Math.pow(1 - r, -n);

		System.out.println("Monthly payment you have to make is : " + payment);

	}

	/*****************************************************************************/
	// Purpose: to print the magic number

	public void magic(int li, int hi, int mi) {
		while (li < hi) {
			System.out.println("if your number is between " + li + " to " + mi + " Press 1 ");
			System.out.println("if your number is between " + (mi + 1) + " to " + hi + " Press 2");

			int uservalue = scanner.nextInt();
			if (uservalue == 1) {

				hi = mi;
				mi = (li + hi) / 2;

			} else if (uservalue == 2) {
				li = mi + 1;
				mi = (li + hi) / 2;
			} else {
				System.out.println("Wrong input ");
			}
		}

		System.out.println("Your number is :" + mi);
	}

	/************************************************************************************/
	// Purpose: to convert a decimal number into a binary number

	public void decimaltobinary(int num) {

		int rem[] = new int[num];

		int index = 0;

		while (num > 0) {
			rem[index] = num % 2;
			index++;
			num = num / 2;
		}

		for (int i = (index - 1); i >= 0; i--) {

			System.out.print(rem[i]);

		}

	}

	public int swapnibble(int x) {
		return (((x & 0x0F) << 4) | ((x & 0xF0) >> 4));
	}

	/************************************************************************************/
	// Purpose: to sort an integer array using merge sort

	public static void merge_sort(int a[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(a, start, mid); // dividing the first half
			merge_sort(a, mid + 1, end);// dividing the second half
			merge(a, start, mid, end);

		}

	}
	/************************************************************************************/
	// Purpose: to sort an integer array using merge sort
	
	
	public static void merge(int[] a, int start, int mid, int end) {
		int p = start, q = mid + 1;
		int arr[] = new int[end - start + 1];
		int k = 0;
		for (int i = start; i <= end; i++) {
			// checks if first part comes to an end or not .
			if (p > mid) {
				arr[k++] = a[q++];
				// checks if first part comes to an end or not .
			} else if (q > end) {
				arr[k++] = a[p++];
				// checks which part has smaller element.
			} else if (a[p] < a[q]) {
				arr[k++] = a[p++];
			} else {
				arr[k++] = a[q++];
			}
		}
		for (int m = 0; m < k; m++) {
			a[start++] = arr[m];
		}
	}

	/************************************************************************************/
	// Purpose: to print the array which has been sorted by merge sort
	
	
	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	/************************************************************************************/
	// Purpose: to sort an integer array using merge sort

	public static void merge_sort(String a[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			merge_sort(a, start, mid); // dividing the first half
			merge_sort(a, mid + 1, end);// dividing the second half
			merge(a, start, mid, end);

		}

	}
	/************************************************************************************/
	// Purpose: to sort an integer array using merge sort
	
	
	public static void merge(String[] a, int start, int mid, int end) {
		int p = start, q = mid + 1;
		String arr[] = new String[end - start + 1];
		int k = 0;
		for (int i = start; i <= end; i++) {
			// checks if first part comes to an end or not .
			if (p > mid) {
				arr[k++] = a[q++];
				// checks if first part comes to an end or not .
			} else if (q > end) {
				arr[k++] = a[p++];
				// checks which part has smaller element.
			} else if (a[q].compareTo(a[p])>0) {
				arr[k++] = a[p++];
			} else {
				arr[k++] = a[q++];
			}
		}
		for (int m = 0; m < k; m++) {
			a[start++] = arr[m];
		}
	}

	/************************************************************************************/
	// Purpose: to print the array which has been sorted by merge sort
	
	
	public static void print(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
