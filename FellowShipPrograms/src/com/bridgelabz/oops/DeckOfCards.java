/******************************************************************************
 
 *  Purpose: program to randomly shuffle decks of cards 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   21-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;

import com.bridgelabz.utility.OopsUtility;

public class DeckOfCards {

	public static void main(String[] args) {

		String[] cardType = { "hearts", "tiles", "pikes", "clovers" };
		String[] cardNumbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
		String[] cardsArray = new String[52];
		int start = 0, end = 12, j1 = 0;

		// for combination of cardType and cardNumbers
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				cardsArray[j] = cardType[i] + " " + cardNumbers[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}

		OopsUtility.shuffleCardsDeck(cardsArray);

		int j2 = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print("For Player " + (i + 1) + ": \n");
			for (int j = 0; j < 9; j++) {

				System.out.print(cardsArray[j2] + " ");
				j2++;
			}
			System.out.println();
		}

	}

}
