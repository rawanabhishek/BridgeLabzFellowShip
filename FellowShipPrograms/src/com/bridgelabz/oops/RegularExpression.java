/******************************************************************************
 
 *  Purpose: Use Regex to replace name, full name, Mobile#, and Date with proper 
 *           value.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   19-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;

import com.bridgelabz.utility.OopsUtility;
import com.bridgelabz.utility.ScannerUtility;

public class RegularExpression {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your full name ");
		String fullname=ScannerUtility.stringScanner();
		System.out.println("Enter your contact : ");
        String contact=ScannerUtility.stringScanner();
		
		String str =("Hello <<name>>, We have your full name\n" + 
				"as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\n" + 
				"know in case of any clarification Thank you BridgeLabz 01/01/2016. ");
		
		System.out.println();
		

		System.out.println(OopsUtility.paragraph(str, fullname, contact));

	}

}
