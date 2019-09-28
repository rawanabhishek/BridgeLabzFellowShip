package com.bridgelabz.creational.singleton;

public class BillPughMain {

	public static void main(String[] args) {
		
		BillPugh bill1=BillPugh.getinstance();
		BillPugh bill2=BillPugh.getinstance();
		System.out.println(bill1);
		System.out.println(bill2);
	}

}
