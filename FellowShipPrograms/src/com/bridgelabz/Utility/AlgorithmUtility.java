/******************************************************************************
 
 *  Purpose:  this is utility class for Algorithm Programs 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

import java.util.Arrays;

public class AlgorithmUtility {
	
	/********************************************************************************************************

	
	 * @param one  take the value of first string from user
	 * @param two  take the value of second string from user
	 * @return  boolean true if the strings are anagram else false
	 */
	public boolean Anagram(String one , String two ) {
		 
		//converting the string one to char array
		 char arr1[]=one.toCharArray();
		 
		 //converting the string two to char array
		 char arr2[]=two.toCharArray();
		 
		 //soting the char arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		boolean result =Arrays.equals(arr1, arr2);
		//returning the boolean value
		return result;
		
	 }

}
