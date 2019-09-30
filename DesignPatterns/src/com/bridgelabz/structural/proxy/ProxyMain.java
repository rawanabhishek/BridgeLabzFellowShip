package com.bridgelabz.structural.proxy;

public class ProxyMain {

	public static void main(String[] args) {
		Image image =new ProxyImage("testimage.jpg");
		
		image.display();
		System.out.println();
		image.display();

	}

}
