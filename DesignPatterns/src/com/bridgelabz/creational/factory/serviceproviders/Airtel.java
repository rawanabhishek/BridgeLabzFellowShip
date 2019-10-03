/******************************************************************************

 *  Purpose: Aitel class implementing InternetProvider
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.factory.serviceproviders;

public  class Airtel implements InternetProvider {

	@Override
	public void name() {
		System.out.println("Airtel");
		
	}

	@Override
	public void qualityService() {
		System.out.println("Moderate");
		
	}

	@Override
	public void price() {
		System.out.println("Expensive");
		
	}

}
