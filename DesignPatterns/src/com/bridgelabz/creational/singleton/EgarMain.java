/******************************************************************************

 *  Purpose: program to perform Egar Singleton Design Pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.singleton;

public class EgarMain {

	public static void main(String[] args) {
		Egar e1=Egar.getEgar();
		Egar e2=Egar.getEgar();
		System.out.println(e1);
		System.out.println(e2);

	}

}
