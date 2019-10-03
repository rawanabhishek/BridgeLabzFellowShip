/******************************************************************************

 *  Purpose: program to perform proxy design pattern 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.proxy;

public class ProxyMain {

	public static void main(String[] args) {
		Image image =new ProxyImage("testimage.jpg");
		
		image.display();
		System.out.println();
		image.display();

	}

}
