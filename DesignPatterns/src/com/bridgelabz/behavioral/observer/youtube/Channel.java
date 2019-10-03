/******************************************************************************

 *  Purpose: program to perform Observer Design Pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.behavioral.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	private  List<Subscriber> subs=new ArrayList<>();
	public void subscriber(Subscriber sub) {
		subs.add(sub);
		
	}
	
	public void unSubscribe(Subscriber sub) {
		subs.remove(sub);
	}
	
	public void notifySubscribe() {
		for(Subscriber sub : subs) {
			sub.update();
			
		}
	}
	
	public void upload(String title) {
		notifySubscribe();
		
	}
	
}
