package com.bridgelabz.oops;

import com.bridgelabz.utility.OopsUtility;

public class DeckOfCardQueue {

	public static void main(String[] args) {
		String[] cardType = { "hearts", "tiles", "pikes", "clovers" };
		String[] cardNumbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
		String[] cardsArray = new String[52];
		
		int j1=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= cardNumbers.length; j++) {
				cardsArray[j1] = cardType[i] + " " + cardNumbers[j1];
				j1++;
			}
			
		}
		
		OopsUtility.shuffleCardsDeck(cardsArray);
		
		

	}

}
