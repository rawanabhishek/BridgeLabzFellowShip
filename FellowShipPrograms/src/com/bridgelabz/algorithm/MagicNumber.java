/******************************************************************************
 
 *  Purpose: to find the number which user is being thinking in this mind 
 *            within a given range
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class MagicNumber {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		Scanner scanner = new Scanner(System.in);
        
		//taking command line argument as input 
        int n =Integer.parseInt("8");
        int range=(int)Math.pow(2,n);
        System.out.println("Range is 0 to  "+range);
        
        int li=0;
        int hi=range-1;
        int mi=(li+hi)/2;
        
        System.out.println();
        System.out.println("Think of a number in your mind between 0 to "+(range-1));
        
        utility.magic(li, hi, mi);
       
        
        scanner.close();
	}

}
