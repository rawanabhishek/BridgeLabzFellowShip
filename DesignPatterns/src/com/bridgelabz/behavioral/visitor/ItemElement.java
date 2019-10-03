/******************************************************************************

 *  Purpose: this is interface for shopping cart
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.behavioral.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
