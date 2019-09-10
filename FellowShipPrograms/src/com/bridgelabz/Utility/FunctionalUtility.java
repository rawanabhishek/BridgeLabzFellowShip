/******************************************************************************
 
 *  Purpose:  this is utility class for functional Programs 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Utility;

public class FunctionalUtility {

	
	//to replace the name in the given string
	public void ReplaceName(String str, String name) {
		
		String RecString="";
	       
	       if(str.length()>3) {
	    	   RecString =str.replace("<<UserName>>", name);
	    	   
	       }
	       
	       System.out.println(RecString);
		}
	

}
