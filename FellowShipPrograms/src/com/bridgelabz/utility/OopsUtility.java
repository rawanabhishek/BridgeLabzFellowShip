/******************************************************************************
 
 *  Purpose: this is utility is class for oops
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   19-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OopsUtility {
	
	
	  /**
	 * @param str      taking string paragraph from main class
	 * @param fullname taking full name of the user
	 * @param contact  taking contact 
	 * @return         returing the replaced string 
	 */
	public  static String paragraph(String str , String fullname , String contact ) { DateFormat format =new SimpleDateFormat( "dd/MM/yyyy"); Date date = new Date();
		String firstname=fullname.substring(0,fullname.indexOf(' '));
		
		
		String replaceString=str.replaceAll("<<name>>", firstname);
		
		String replaceString2=replaceString.replaceAll("<<full name>>", fullname);
		String replaceString3=replaceString2.replaceAll("91­xxxxxxxxxx", contact);
		String replaceString4=replaceString3.replaceAll("01/01/2016",format.format(date));
		
		return replaceString4;
	}
	
	
	public static int calculateValueOf(int  share,int price) {
		return share*price;
	}
}
