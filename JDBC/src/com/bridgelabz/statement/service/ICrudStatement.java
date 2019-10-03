/******************************************************************************

 *  Purpose: this is interface for Crud operation using statement
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.statement.service;

public interface ICrudStatement {

	int delete(int id) throws Exception;

	int update(int id, Object student) throws Exception;

	void createTable(Object student) throws Exception;

	void showTable() throws Exception;

}
