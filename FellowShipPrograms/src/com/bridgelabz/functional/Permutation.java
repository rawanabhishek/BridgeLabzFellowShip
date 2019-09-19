/******************************************************************************
 
 *  Purpose:  Program  to print all permutations of given string. 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class Permutation {

	public static void main(String[] args) {
		
		FunctionalUtility utility = new FunctionalUtility();
		
		String str="AAC";
		int size=(str.length()-1);
		utility.permute(str,0,size);
		

	}

}
