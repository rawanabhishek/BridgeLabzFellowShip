package com.bridgelabz.creational.factory;

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
