/******************************************************************************

 *  Purpose: program to perform Enum Singleton Design Pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.singleton;

public class EnumMain {

	public static void main(String[] args) {
		

		Enum enum1=Enum.instance;
		Enum enum2=Enum.instance;
		System.out.println(enum1.hashCode());
		System.out.println(enum2.hashCode());
	}

}
