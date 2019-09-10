
/******************************************************************************
 
 *  Purpose:  ­> A program with cubic running time. Read in N integers and counts the
                number of triples that sum to exactly 0.
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import com.bridgelabz.Utility.FunctionalUtility;

public class SumOfThreeIntegers {

	public static void main(String[] args) {
		FunctionalUtility utility = new FunctionalUtility();
		
		int arr[]= {0, -1, 2, -3, 1};
		
		int n=arr.length;
		
		utility.triplets(arr,n);
		
		
	}

}
