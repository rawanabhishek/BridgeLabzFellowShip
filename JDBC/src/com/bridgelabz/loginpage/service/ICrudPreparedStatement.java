/******************************************************************************

 *  Purpose: this is interface for login page  operation using  prepared statement
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.loginpage.service;

import com.bridgelabz.loginpage.model.Student;

public interface ICrudPreparedStatement {

	Student checkUser(int id, String name) throws Exception;

	

	int createTable(Student student) throws Exception;

}
