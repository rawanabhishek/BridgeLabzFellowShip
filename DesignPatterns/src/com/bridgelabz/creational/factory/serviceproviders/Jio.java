/******************************************************************************

 *  Purpose: Jio class implementing InternetProvider
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.factory.serviceproviders;

public class Jio implements InternetProvider{

	@Override
	public void name() {
		System.out.println("Jio");
		
	}

	@Override
	public void qualityService() {
		System.out.println("Superb");
		
	}

	@Override
	public void price() {
		System.out.println("Cheapest!");
		
	}

}
