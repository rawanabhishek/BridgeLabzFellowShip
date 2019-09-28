package com.bridgelabz.creational.factory;

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
