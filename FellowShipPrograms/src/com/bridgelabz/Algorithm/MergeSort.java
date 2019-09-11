/******************************************************************************
 
 *  Purpose: to sort an integer array using merge sort 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import com.bridgelabz.Utility.AlgorithmUtility;

public class MergeSort {

	public static void main(String[] args) {
		
		int a[] = { 9, 7, 8, 3, 2, 1 };
		int start = 0;
		int end = a.length - 1;
		AlgorithmUtility.merge_sort(a, start, end);
		AlgorithmUtility.print(a);
	}

}
