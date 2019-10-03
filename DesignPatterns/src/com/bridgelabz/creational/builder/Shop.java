/******************************************************************************

 *  Purpose: program to perform builder Design Pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.creational.builder;

public class Shop {

	public static void main(String[] args) {
		Bycycle cycle = new BycycleBuilder().setCompany("Trek").
				setFrameSize("29 inch").setFrameType("Carbonfiber")
				.setWheelSize("29 inch").setType("hybrid").getBycycle();
		System.out.println(cycle);

	}

}
