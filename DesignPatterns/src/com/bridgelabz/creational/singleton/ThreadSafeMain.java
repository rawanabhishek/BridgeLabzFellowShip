/******************************************************************************

 *  Purpose: program to perform ThreadSafe Singleton Design Pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.singleton;

public class ThreadSafeMain {

	public static void main(String[] args) {
		ThreadSafe ts1=ThreadSafe.getinstance();
		ThreadSafe ts2=ThreadSafe.getinstance();
		System.out.println(ts1);
		System.out.println(ts2);


	}

}
