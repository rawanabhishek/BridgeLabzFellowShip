
/******************************************************************************
 
 *  Purpose: program Calendar.java that takes the month and year as command­line
             arguments and prints the Calendar of the month. Store the Calendar in an 2D Array,
             the first dimension the week of the month and the second dimension stores the day
of the week.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.dataStructure;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class Calander {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility2 = new FunctionalUtility();
		System.out.println("Enter the Month : ");
		int month = scanner.nextInt();

		System.out.println("Enter the year : ");
		int year = scanner.nextInt();
		String calender[][] = new String[6][7];

		//array of string to store months 
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		//array of integer  to store max limit of months 
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		//if the entered year is a leap year then the max limit of feb gets changed
		if (month == 2 && utility2.Leapyear(year))
			days[month] = 29;

		//get day value on which day the particular months start
		int day = AlgorithmUtility.DayValidate(1, month, year);

		int tempDay = 0;
	
		//storing the dates in a 2D Array of String
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				if (days[month] > tempDay) {
					tempDay++;

					if (tempDay < 10) {

						calender[i][j] = "  " + tempDay + " ";
					} else {

						calender[i][j] = " " + tempDay + " ";
					}
				} else {
					break;
				}
			}
		}
		
		System.out.println("    " + months[month] + " " + year);
		System.out.println(" Su  Mo  Tu  We  Th  Fi  Sa");

		for (int i = 0; i < day; i++) {
			System.out.print("    ");
		}
		tempDay = 0;

		//printing the 2D Array value
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				
				if (days[month] != tempDay) {
					tempDay++;
					//printing the array on next line if it reminder is 0 when dvivided by 7
					if ((j + day) % 7 == 0) {

						System.out.println();

					}

					if (tempDay < 10) {
						System.out.print(calender[i][j]);

					} else {
						System.out.print(calender[i][j]);

					}
				} else {
					break;
				}
			}
		}
		
		scanner.close();
		System.out.println();
	}

}
