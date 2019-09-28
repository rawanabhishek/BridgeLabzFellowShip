package com.bridgelabz.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		InternetProviderFactory internet=new InternetProviderFactory();
		InternetProvider provider=internet.getInstance("best");
		provider.name();
		provider.qualityService();
		provider.price();
		

		
	}

}
