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
        	
        	
        	return scanner.nextInt();
        	
          }
          
          //scanner method for character
          public static char charScanner() {
          	
          
          	return scanner.next().charAt(0);
          	
            }
          
          
          //scanner method for string
          public static String stringScanner() {
          	
          
          	return scanner.next();
          	
            }
          
          
          
          
}
