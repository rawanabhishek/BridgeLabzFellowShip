
/******************************************************************************
 
 *  Purpose: to takes two double command­line arguments t
             and v and prints the wind chill.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class WindChill {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		
		FunctionalUtility utility = new FunctionalUtility();
		
		double temperature, windspeed;
		
		//taking value of temperature from command line argument
		temperature=Double.parseDouble(args[0]);
		

		//taking value of windspeed from command line argument
		windspeed = Double.parseDouble(args[0]);


		System.out.println();
		
		//calling the utility function 
		System.out.println(utility.wind(temperature, windspeed));

		scanner.close();

	}

}
