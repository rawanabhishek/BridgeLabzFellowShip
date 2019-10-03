/******************************************************************************

 *  Purpose: Customer class for facade design pattern 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.facade;

public class Customer {

	public static void main(String[] args) {

		System.out.println("Facade ");
		System.out.println(Waiter.deliverFood(FoodType.PIZZA));
		System.out.println(Waiter.deliverFood(FoodType.PASTA));

	}

}
