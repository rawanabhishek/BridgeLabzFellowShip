/******************************************************************************
 
 *  Purpose: Create the Week Object having a list of WeekDay objects each 
 *           storing the day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . 
 *           The WeekDay objects are stored in a Queue implemented using 
 *           Linked List. Further maintain also a Week Object in a Queue to
             finally display the Calendar 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.dataStructure.copy;

import java.util.Scanner;


import com.bridgelabz.handler.QueueLinkedList;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

public class CalanderQueue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QueueLinkedList<Integer> utility = new QueueLinkedList<Integer>();
		FunctionalUtility utility2 = new FunctionalUtility();
		System.out.println("Enter the Month : ");
		int month = scanner.nextInt();

		System.out.println("Enter the year : ");
		int year = scanner.nextInt();
		int calender[][] = new int[6][7];

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
		System.out.println("    " + months[month] + " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		
		int count = 1;
		//storing the dates in a 2D Array of String
		for (int i = 0; i < calender.length; i++) {
			for (int j = day; j < calender[i].length; j++) {

				if (count <= days[month]) {
					calender[i][j] = count;
					//inserting the values in the queue 
					utility.addRear(calender[i][j]);
					count++;
				} else {
					break;
				}
			}
			day = 0;
		}

		//printing the 2D Array value
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {

				if (calender[i][j] == 0) {
					System.out.print("    ");
				} else if (calender[i][j] < 10) {
					//dequeuing the value from queue and storing it
					int dayss = (int) utility.removeFront();
					System.out.print("  " + dayss + " ");
				} else {
					//dequeuing the value from queue and storing it
					int dayss = (int) utility.removeFront();
					System.out.print(" " + dayss + " ");
				}

			}
			System.out.println();
		}

		scanner.close();
	}

}
