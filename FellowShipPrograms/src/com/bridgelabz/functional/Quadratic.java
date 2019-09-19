
/******************************************************************************
 
 *  Purpose: to find the roots of the equation a*x*x + b*x + c.
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class Quadratic {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
           FunctionalUtility utility = new FunctionalUtility();
           Double a , b, c;
           
           
           System.out.println("Enter the value of a : ");
         //scanning the value of a
           a=scanner.nextDouble();
           
           System.out.println("Enter the value of b : ");
         //scanning the value of b
           b=scanner.nextDouble();
           
           System.out.println("Enter the value of c : ");
         //scanning the value of c
           c=scanner.nextDouble();
           
           System.out.println(" ");
           //calling the utility function
           System.out.println(utility.Quadratic(a, b, c));
           
           
           scanner.close();
	}

}
