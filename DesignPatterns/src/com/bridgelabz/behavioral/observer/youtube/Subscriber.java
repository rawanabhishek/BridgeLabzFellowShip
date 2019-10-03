/******************************************************************************

 *  Purpose: Subscriber class
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.behavioral.observer.youtube;

public class Subscriber {
	private String name;
	public void update() {
		System.out.println("Hey "+name+" ,video uploaded ");
	}

	public void subscribeChannel(Channel ch) {
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}
}
