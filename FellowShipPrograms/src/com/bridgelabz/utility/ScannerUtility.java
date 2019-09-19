/******************************************************************************
 
 *  Purpose: this is utility class for scanner 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   19-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.util.Scanner;

public class ScannerUtility {
          static Scanner scanner=new Scanner(System.in);
          
          //scanner method  for integer
          public static int intScanner() {
        	int value=scanner.nextInt();
        	
        	return value;
        	
          }
          
          //scanner method for character
          public static char charScanner() {
          	char value=scanner.next().charAt(0);
          
          	return value;
          	
            }
          
          
          //scanner method for string
          public static String stringScanner() {
          	String value=scanner.nextLine();
          
          	return value;
          	
            }
          
          
          
          
}
