
/******************************************************************************
 
 *  Purpose:  program to ­prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.Utility.FunctionalUtility;

public class Distance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        FunctionalUtility utility = new FunctionalUtility();
        Double x ,y;
        
        System.out.println("Enter the value of x : ");
        x=scanner.nextDouble();
        
        System.out.println("Enter the value of y : ");
        y=scanner.nextDouble();
        
        System.out.println(" ");
        System.out.println("The Distance Between two point is "+utility.Distance(x, y));
        
        scanner.close();

	}

}
