/******************************************************************************

 *  Purpose: program to perform Refelction Destroy Singleton Design Pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.singleton;

import java.lang.reflect.Constructor;

public class Reflection {

	public static void main(String[] args) {
		Egar instanceOne = Egar.getEgar();
		Egar instanceTwo = null;
		try {
			@SuppressWarnings("rawtypes")
			Constructor[] constructors = Egar.class.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (Egar) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
