/******************************************************************************

 *  Purpose: Socket Adapter Interface 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.adapter.socket;

public interface SocketAdapter {
	
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();

}
