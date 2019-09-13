/******************************************************************************
 
 *  Purpose:Program which creates Banking Cash Counter where people
            come in to deposit Cash and withdraw Cash. Have an input panel to add people
            to Queue to either deposit or withdraw money and dequeue the people. Maintain
            the Cash Balance.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.DataStructure;

import java.util.Scanner;

import com.bridgelabz.DatastructureUtility.QueueUtility;

public class CashCounter {
	
	public static void main(String[] args) {
		QueueUtility<Integer> utility=new QueueUtility<Integer>();
		Scanner scanner = new Scanner(System.in);
	
        //opening balance of the bank
		int balance = 50000;
		
		//equeueing the people in the queue
		utility.enQueue(1);
		utility.enQueue(2);
		utility.enQueue(3);
		utility.enQueue(4);
		utility.enQueue(5);
		

		//showing the queue by calling show method from utility class
		utility.show();
		
		
		System.out.println();
		int i=0;
		
		//continuing the loop till queue is empty
		while(utility.size!=0) {
			
			System.out.println();
			System.out.println("Hello  "+utility.q[i]);
			System.out.println("Enter 1 for widrawal\nEnter 2 for deposit ");
			int userinput = scanner.nextInt();
			switch (userinput) {
			//if person wants to widraw money 
			case 1:
				
				System.out.println("Enter the amount you want to widraw ");
				int widAmount = scanner.nextInt();
				if (widAmount <= balance) {
					balance = balance - widAmount;
					utility.deQueue();
					break;

				} else {
					System.out.println("bank does not have that much amount ");
					utility.deQueue();
					break;
				}

				
			//if the person wants to deposit money	
			case 2:
				
				System.out.println("Enter the amount you want to widraw ");
				int depAmount = scanner.nextInt();
				balance = balance + depAmount;
				utility.deQueue();
				break;

			}
			System.out.println("The balance is "+balance);
			
			if(utility.size!=0) {
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
