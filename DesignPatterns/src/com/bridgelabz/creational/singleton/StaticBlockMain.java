package com.bridgelabz.creational.singleton;

public class StaticBlockMain {

	public static void main(String[] args) {
		StaticBlock sb1=StaticBlock.getinstance();
		StaticBlock sb2=StaticBlock.getinstance();
		System.out.println(sb1);
		System.out.println(sb2);

	}

}
