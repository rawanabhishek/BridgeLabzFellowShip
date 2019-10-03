/******************************************************************************
 
 *  Purpose: this is utility is class for oops
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   19-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class OopsUtility {

	/**
	 * @param str      taking string paragraph from main class
	 * @param fullname taking full name of the user
	 * @param contact  taking contact
	 * @return returing the replaced string
	 */
	public static String paragraph(String str, String fullname, String contact) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String firstname = fullname.substring(0, fullname.indexOf(' '));

		String replaceString = str.replaceAll("<<name>>", firstname);

		String replaceString2 = replaceString.replaceAll("<<full name>>", fullname);
		String replaceString3 = replaceString2.replaceAll("91­xxxxxxxxxx", contact);
		String replaceString4 = replaceString3.replaceAll("01/01/2016", format.format(date));

		return replaceString4;
	}

	/**
	 * @param one value of first variable
	 * @param two value of second variable
	 * @return multiplication of one and two
	 */
	public static int calculateValueOf(int one, int two) {
		return one * two;
	}

	/**
	 * purpose to shuffle deck of cards
	 * 
	 * @param arr array of cards
	 * @return random cards
	 */
	public static String[] shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = arr[f1];
				arr[f1] = arr[f2];
				arr[f2] = temp;
			}
		}
		return arr;

	}

	/**
	 * @param arr1 array of card type
	 * @param arr2 array of card number
	 * @param arr3 array of cards
	 * @return
	 */
	public static String[] CardInsertion(String[] arr1, String[] arr2, String[] arr3) {

		int j1 = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr3[j1] = arr2[j] + " " + arr1[i];
				j1++;
			}

		}

		return arr3;

	}

	public static String[] CardSorting(String[] arr1) {

		String temp;
		int j2 = 0;
		String[] arr = new String[9];
		int j1 = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {

				arr[j] = arr1[j1];
				j1++;

			}
			for (int k = 0; k < arr.length ; k++) {
				for (int j = 0; j < arr.length - i - 1; j++) {

					if (arr[j].compareTo(arr[j + 1]) > 0) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;

					}

				}

			}
		
				
					for (int j = 0; j < 9; j++) {
						arr1[j2] = arr[j];
						j2++;
					}
				

			}
		

		return arr1;
	}

}
