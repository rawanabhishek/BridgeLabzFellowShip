/******************************************************************************
 
 *  Purpose: to perform insertion sort on a string
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;



import com.bridgelabz.Utility.AlgorithmUtility;

public class InsertionSort {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		
		
		
		
		//unsorted String array
		String str[] = { "baudi","abhi","karan","akansh","viany","rishi"};
		utility.insertionSortString(str);
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}

	}

}
