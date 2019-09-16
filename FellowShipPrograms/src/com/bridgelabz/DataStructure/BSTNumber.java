/******************************************************************************
 
 *  Purpose:program to find the probabitlity of bts numbers range
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   16-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.DataStructure;

public class BSTNumber {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
		     System.out.print(" posibility for "+i+" is : ");
			double sum = 1;
			if (i == 1 ) {
				sum = i;

			}
			else {
				sum=2;
			}
//			 else {
			//(2n C n) / (n+1)
//				for (int j=3; j<=i; j++) {
//					//sum = sum + (int) (Math.pow(j, 2));
//					//(1/7)*(12C6)
//					sum+=(1/7)*(12*sum*i);
//					//sum+=(j-1)*(i-j);
//				}
//			}
			System.out.println(sum);

		}

	}

}
