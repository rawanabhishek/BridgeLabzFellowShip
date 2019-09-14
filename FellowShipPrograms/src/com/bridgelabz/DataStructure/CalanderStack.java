/******************************************************************************
 
 *  Purpose: program to store the Queue in two Stacks. Stack here is also
             implemented using Linked List
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.DataStructure;

import java.util.Scanner;

import com.bridgelabz.Handler.LinkedList;
import com.bridgelabz.Handler.StackLinkedList;
import com.bridgelabz.Utility.AlgorithmUtility;
import com.bridgelabz.Utility.FunctionalUtility;

public class CalanderStack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> utility = new LinkedList<Integer>();
		FunctionalUtility utility2 = new FunctionalUtility();
		StackLinkedList<Integer>stack1=new StackLinkedList<Integer>();
		StackLinkedList<Integer>stack2=new StackLinkedList<Integer>();
		System.out.println("Enter the Month : ");
		int month = scanner.nextInt();

		System.out.println("Enter the year : ");
		int year = scanner.nextInt();
		int calender[][] = new int[6][7];

		//array of string to store months 
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		//if the entered year is a leap year then the max limit of feb gets changed
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		//get day value on which day the particular months start
		if (month == 2 && utility2.Leapyear(year))
			days[month] = 29;
		
		//storing the dates in a 2D Array of String
		int day = AlgorithmUtility.DayValidate(1, month, year);
		
		
		System.out.println("    " + months[month] + " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		for (int i = 0; i < day; i++) {
			System.out.print("    ");
		}
		
		int count = 1;
		//storing the dates in a 2D Array of String
		for (int i = 0; i < calender.length; i++) {
			for (int j = day; j < calender[i].length; j++) {

				if (count <= days[month]) {
					calender[i][j] = count;
					//inserting the element in the queue
					utility.insert(calender[i][j]);
					count++;
				} else {
					break;
				}
			}
			day = 0;
		}
		for(int i=0;i<days[month];i++) {
			//removing the element from queue and pushing it to stack 1 
			stack1.push(utility.deQueueFromStart());
		}
		for(int i=0;i<days[month];i++) {
			//removing the elements from stack 1 and pushing it to stack 2
			stack2.push(stack1.pop());
		}
		
		


		
		for(int i=0 ; i<calender.length ; i++)
		{
			for(int j=0 ; j<calender[i].length ;  j++)
			{
				if(calender[i][j] == 0)
				{
					System.out.print("");
				}
				else if(calender[i][j] < 10)
				{
					//poping the element from the stack2
					int daysss =(int) stack2.pop();
				
					System.out.print("  "+daysss+" ");
				}
				else 
				{
					//poping the element from the stack2
					int daysss =(int) stack2.pop();
					System.out.print(" "+daysss+" ");
				}
			}
			System.out.println();
		}
		scanner.close();
		
	}

}
