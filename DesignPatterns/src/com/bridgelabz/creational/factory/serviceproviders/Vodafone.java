/******************************************************************************

 *  Purpose: Vodafone class implementing InternetProvider
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.factory.serviceproviders;

public class Vodafone implements InternetProvider{

	@Override
	public void name() {
		System.out.println("Vodafone");
		
		
	}

	@Override
	public void qualityService() {
		System.out.println("Below Average");
		
	}

	@Override
	public void price() {
		System.out.println("Expensive ");
	
		
	}

}
