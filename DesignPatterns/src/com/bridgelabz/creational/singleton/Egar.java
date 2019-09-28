package com.bridgelabz.creational.singleton;

public class Egar {
	private static Egar egar=new Egar();
	private Egar() {
		
	}
	public static Egar getEgar() {
		return egar;
	}

}
