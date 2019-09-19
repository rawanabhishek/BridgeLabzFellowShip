/******************************************************************************
	 
	 *  Purpose: To print elapsed time 
	 *
	 *  @author  Abhishek Rawat
	 *  @version 1.0
	 *  @since   10-09-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.FunctionalUtility;

public class StopWatch {

	public static void main(String[] args) {

		FunctionalUtility utility = new FunctionalUtility();
		int n = Integer.parseInt("10");
		
		int sum1=0;
		int sum2=0;
		for(int i=0;i<n;i++) {
			sum1=sum1+(int)Math.sqrt(i);
		}
		
		//storing the time of first operation in time1
		double time1=utility.elapsedTime();

		//printing the time taken by first operation by calling the utility class
		System.out.println(sum1+" is and time is "+time1+" milliseconds");
		
		for(int i=0;i<n;i++) {
			sum2=sum2+utility.random(i);
		}
		//storing the time of first operation in time2 by calling the utilityclass
		double time2=utility.elapsedTime();
		
		//printing the time taken by second operation
		System.out.println(sum2+" is and time is "+time2+" milliseconds");
	}

}
