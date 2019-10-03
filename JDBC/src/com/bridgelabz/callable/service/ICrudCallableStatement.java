/******************************************************************************

 *  Purpose: this is interface for Crud operation using  callable statement
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.callable.service;

public interface ICrudCallableStatement {
	int delete(int id) throws Exception;

	int update(int id, Object student) throws Exception;

	void createTable(Object student) throws Exception;

	void showTable() throws Exception;
}
