/******************************************************************************

 *  Purpose: program to perform factory design pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.factory.serviceproviders;

public class FactoryMain {

	public static void main(String[] args) {
		
		InternetProviderFactory internet=new InternetProviderFactory();
		InternetProvider provider=internet.getInstance("mo");
		provider.name();
		provider.qualityService();
		provider.price();
		

		
	}

}
