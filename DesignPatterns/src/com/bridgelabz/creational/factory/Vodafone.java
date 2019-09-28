package com.bridgelabz.creational.factory;

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
