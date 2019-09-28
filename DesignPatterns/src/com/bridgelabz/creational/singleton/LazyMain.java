package com.bridgelabz.creational.singleton;

public class LazyMain {

	public static void main(String[] args) {
		Lazy l1=Lazy.getLazy();
		Lazy l2=Lazy.getLazy();
		System.out.println(l1);
		System.out.println(l2);

	}

}
