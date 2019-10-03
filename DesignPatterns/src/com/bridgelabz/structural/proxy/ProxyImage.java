/******************************************************************************

 *  Purpose: Proxy image class implementing Image for proxy design pattern
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.structural.proxy;

public class ProxyImage  implements Image{
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName=fileName;
	}

	@Override
	public void display() {
		if(realImage==null) {
			realImage=new RealImage(fileName);
		}
		realImage.display();
		
		
	}

}
