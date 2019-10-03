/******************************************************************************

 *  Purpose: program to perform BillPugh Singleton Design Pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.singleton;

public class BillPughMain {

	public static void main(String[] args) {
		
		BillPugh bill1=BillPugh.getinstance();
		BillPugh bill2=BillPugh.getinstance();
		System.out.println(bill1);
		System.out.println(bill2);
	}

}
