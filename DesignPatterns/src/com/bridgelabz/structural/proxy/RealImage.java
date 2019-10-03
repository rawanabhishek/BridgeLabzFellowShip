/******************************************************************************

 *  Purpose: real image clas implements image for proxy design pattern 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.proxy;

public class RealImage implements Image {
	
	private String fileName;
	public RealImage(String fileName) {
		this.fileName=fileName;
		loadFromDisk(fileName);
	}
	

	@Override
	public void display() {
		System.out.println("Displaying "+fileName);
		
	}
	
	private  void loadFromDisk(String fileName) {
		System.out.println("Load "+fileName);
	}

}
