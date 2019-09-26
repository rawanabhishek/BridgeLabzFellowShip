/******************************************************************************
 
 *  Purpose: program to randomly shuffle decks of cards using queue
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;

import java.util.Arrays;

import com.bridgelabz.handler.QueueLinkedList;
import com.bridgelabz.utility.OopsUtility;

public class DeckOfCardQueue {

	public static void main(String[] args) {
		QueueLinkedList<String> queue=new QueueLinkedList<String>();
		
		String[] cardType = { "hearts", "clubs", "diamond", "spade" };
		String[] cardNumbers = { "101", "202", "303", "404", "505", "606", "707", "808", "909", "jack10", "king11", "queen12", "ace13" };
		String[] cardsArray = new String[52];
		
		int j1=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < cardNumbers.length; j++) {
				cardsArray[j1] = cardType[i] + " " + cardNumbers[j];
				j1++;
			}
			
		}
		
		OopsUtility.shuffleCardsDeck(cardsArray);
		
		String[] arr = new String[9];
		char[] last1 = new char[2];
		char[] last2 = new char[2];
	       int 	j2 = 0;
		String temp1, temp2, temp3, temp4;
		for (int p = 0; p < 4; p++) {
			for (int j = 0; j < 9; j++) {
				arr[j] = cardsArray[j2];
				j2++;

			}
		
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - i - 1; j++) {
					temp1 = arr[j];
					temp2 = arr[j + 1];

					last1[0] = temp1.charAt(temp1.length() - 2);
					last1[1] = temp1.charAt(temp1.length() - 1);
					last2[0] = temp2.charAt(temp2.length() - 2);
					last2[1] = temp2.charAt(temp2.length() - 1);
					if (Arrays.compare(last1, last2) > 0) {
						temp3 = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp3;

					}

				}

			}	
			queue.addRear("For Player " + p + " : \n");
			for (int j = 0; j < 9; j++) {
				temp4 = arr[j].substring(0, arr[j].length() - 2);
			
				queue.addRear(temp4 + "  ");
			}
			
			queue.addRear("\n");
		}
	
		queue.display();

	}


}
