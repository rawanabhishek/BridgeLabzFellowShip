/******************************************************************************
 
 *  Purpose: to print on which day the particular day falls 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Algorithm;

import java.util.Scanner;

import com.bridgelabz.Utility.AlgorithmUtility;

public class DayOFWeeks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        AlgorithmUtility utility = new AlgorithmUtility();
        
        
        int date =Integer.parseInt(args[0]);
        
        
        int month =Integer.parseInt(args[0]);
        
        
        int year=Integer.parseInt(args[0]);
        
        boolean leapyear =utility.LeapyearChecker(year);
        boolean ValidateDate =utility.DaysWeek(date, month, leapyear);
        
        
        if(ValidateDate) {
      	  int d1=AlgorithmUtility.DayValidate(date, month, year);
      	  
      	  switch(d1) {
      	       case 0:
      	    	   System.out.println(" Day is Sunday ");
      	    	   break;
      	    	   
      	       case 1:
      	    	   System.out.println("Day is Monday ");
      	    	   
      	       case 2:
      	    	   System.out.println("Day is Tuesday ");
      	    	   break;
      	       case 3:
      	    	   System.out.println("Day is Wednesday ");
      	    	   break;
      	       case 4:
      	    	   System.out.println("Day is thursday ");
      	    	   break;
      	       case 5:
      	    	   System.out.println(" Day is Friday ");
      	    	   break;
      	       case 6:
      	    	   System.out.println("Day is Saturday ");
      	    	   break;
      		  
      	  }
      	  
      	  
        }
        else {
      	  System.out.println("invalid date");
        }
        scanner.close();

	}

}
