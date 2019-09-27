/******************************************************************************
 
 *  Purpose: program to randomly shuffle decks of cards using queue
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;



import com.bridgelabz.handler.QueueLinkedList;
import com.bridgelabz.utility.OopsUtility;

public class DeckOfCardQueue {

	public static void main(String[] args) {
		QueueLinkedList<String> queue = new QueueLinkedList<String>();

		String[] cardType = { "hearts", "clubs", "diamond", "spade" };
		String[] cardNumbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "jack",
				"King", "Queen", "Ace" };
		String[] cardsArray = new String[52];
		
//		String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
//	               "7", "8", "9", "10", "Jack", "Queen", "King"};

		cardsArray = OopsUtility.CardInsertion(cardType, cardNumbers, cardsArray);

		cardsArray = OopsUtility.shuffleCardsDeck(cardsArray);

		cardsArray = OopsUtility.CardSorting(cardsArray);
		
		int j1=0;
		for(int i=0;i<4;i++) {
			System.out.println("\nFor player :"+(i+1));
			for(int j=0;j<9;j++) {
				System.out.print(" ->"+cardsArray[j1]);
				queue.addRear(cardsArray[j1]);
				j1++;
				
			}
		}
		
		
//		for (String i : cardsArray) {
//
//			System.out.println(i);
//		}

	}

}
