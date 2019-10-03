/******************************************************************************

 *  Purpose: Fcatory class for internet provider 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.factory.serviceproviders;

public class InternetProviderFactory {
	
	public InternetProvider getInstance(String str) {
		if(str.equals("best")) {
			return new Jio();
		}
		else if(str.equals("moderate")){
			return new Airtel();
		}
		else {
			return new Vodafone();
		}
		
	}



}
