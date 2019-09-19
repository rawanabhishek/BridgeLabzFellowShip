
/******************************************************************************
 
 *  Purpose:  to replace the name in the string 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class NameReplace {

	public static void main(String[] args) {
		FunctionalUtility utility = new FunctionalUtility();
		Scanner scanner = new Scanner(System.in);
		String str = ("Hello <<UserName>>, How are You ?");
		System.out.println("Enter your name : ");
		String name = scanner.nextLine();

		utility.ReplaceName(str, name);
		
		scanner.close();
	}

}
