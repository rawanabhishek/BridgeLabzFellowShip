package com.bridgelabz.creational.singleton;

public class Lazy {
	private static  Lazy  lazy=null;
	private Lazy() {
		
		
	}
	public static Lazy getLazy() {
		if(lazy==null) {
			lazy=new Lazy();
		}
		return lazy;
	}

}
