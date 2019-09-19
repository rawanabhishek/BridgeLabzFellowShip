/******************************************************************************
 
 *  Purpose: to sort an integer array using merge sort 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class MergeSort {

	public static void main(String[] args) {
		
		int a[] = {8,3,5,1,6,7,2 };
		int start = 0;
		int end = a.length - 1;
		AlgorithmUtility.merge_sort(a, start, end);
		AlgorithmUtility.print(a);
	}

}
