/******************************************************************************
 
 *  Purpose:Program which creates Banking Cash Counter where people
            come in to deposit Cash and withdraw Cash. Have an input panel to add people
            to Queue to either deposit or withdraw money and dequeue the people. Maintain
            the Cash Balance.
 *  @author  Abhishek Rawat
 *  @version 1.1
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.dataStructure.copy;

import java.util.Scanner;

import com.bridgelabz.handler.LinkedList;


public class CashCounter {
	
	public static void main(String[] args) {
		LinkedList<Integer> utility=new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
	
        //opening balance of the bank
		int balance = 50000;
		
		//equeueing the people in the queue
		utility.insert(1);
		utility.insert(2);
		utility.insert(3);
		utility.insert(4);
		utility.insert(5);
		

		//showing the queue by calling show method from utility class
		utility.show();
		
		
		System.out.println();
		int i=0;
		
		//continuing the loop till queue is empty
		while(!(utility.isEmpty())) {
			
			System.out.println();
			System.out.println("Hello  "+(i+1));
			System.out.println("Enter 1 for widrawal\nEnter 2 for deposit ");
			int userinput = scanner.nextInt();
			switch (userinput) {
			//if person wants to widraw money 
			case 1:
				
				System.out.println("Enter the amount you want to widraw ");
				int widAmount = scanner.nextInt();
				if (widAmount <= balance) {
					balance = balance - widAmount;
					utility.deleteAtStart();
					break;

				} else {
					System.out.println("bank does not have that much amount ");
					utility.deleteAtStart();
					break;
				}

				
			//if the person wants to deposit money	
			case 2:
				
				System.out.println("Enter the amount you want to widraw ");
				int depAmount = scanner.nextInt();
				balance = balance + depAmount;
				utility.deleteAtStart();
				break;

			}
			System.out.println("The balance is "+balance);
			
			if(!utility.isEmpty()) {
			utility.show();
			}
			
			//if the queue is empty
			else {
				System.out.println("Queue is empty ");
			}
			i++;
		}
		scanner.close();
		
	
	}
}
