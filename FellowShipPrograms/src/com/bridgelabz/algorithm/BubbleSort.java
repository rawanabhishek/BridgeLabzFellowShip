/******************************************************************************
 
 *  Purpose: to perform bubble sort on integer array 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;



import com.bridgelabz.utility.AlgorithmUtility;

public class BubbleSort {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		
		
		//unsorted integer array
		int arr[] = { 5,6,4,1,2,8,9};
		utility.bubbleSortInteger(arr);
	}

}
