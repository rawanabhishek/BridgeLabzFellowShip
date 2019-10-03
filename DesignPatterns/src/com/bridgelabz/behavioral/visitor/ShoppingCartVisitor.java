/******************************************************************************

 *  Purpose: this is interface class for shopping casrt visitor
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.behavioral.visitor;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
