package com.bridgelabz.creational.factory;

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
