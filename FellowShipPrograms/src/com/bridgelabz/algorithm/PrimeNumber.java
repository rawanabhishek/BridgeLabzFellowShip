
/******************************************************************************
 
 *  Purpose: to print the prime number from 0 to 1000
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/ 
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class PrimeNumber {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		int start =0;
		int end=1000;
		
		//returing the output from the utilty class
		utility.primeRange(start,end);

	}

}




