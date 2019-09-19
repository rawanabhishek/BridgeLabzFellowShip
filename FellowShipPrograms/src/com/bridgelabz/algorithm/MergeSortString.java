/******************************************************************************
 
 *  Purpose: to sort an String array using merge sort 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class MergeSortString {

	public static void main(String[] args) {
		
		

		String a[] ={ "baudi","abhi","karan","akansh","viany","rishi"};
		int start = 0;
		int end = a.length - 1;
		AlgorithmUtility.merge_sort(a, start, end);
		AlgorithmUtility.print(a);
	}

}
