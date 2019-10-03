/******************************************************************************

 *  Purpose: Sock class for adapter 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.adapter.socket;

public class Socket {
	public Volt getVolt(){
		return new Volt(120);
	}
}
