package com.bridgelabz.callable.service;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.ResultSet;

import com.bridgelabz.callable.repository.Connectivity;

import com.bridgelabz.callable.model.Student;

public class ImplCallableStatement implements ICrudCallableStatement {
	static Connection connection = Connectivity.getConnection();
	static CallableStatement callable = null;

	/**
	 *purpose : to insert value in the table 
	 */
	@Override
	public void createTable(Object student) throws Exception {



	
		callable =   (CallableStatement)  connection.prepareCall(" call Inser_Into(?,?,?)");
		callable.setInt(1, ((Student) student).getId());
		callable.setString(2, ((Student) student).getName());
		callable.setString(3, ((Student) student).getAddress());

		
		callable.executeUpdate();
		
	

	}

	/**
	 *purpose : to update values in the table 
	 */
	@Override
	public int update( Object student) throws Exception {
//		String query = "UPDATE student SET name='" + ((Student) student).getName() + "', address='"
//				+ ((Student) student).getAddress() + "' WHERE id=" + id + "";

		callable = connection.prepareCall("call update_call(?,?,?)");
		callable.setInt(1, ((Student) student).getId());
		callable.setString(2, ((Student) student).getName());
		callable.setString(3, ((Student) student).getAddress());
		return callable.executeUpdate();

	}

	/**
	 *purpose : to delete a specific row in the table 
	 */
	@Override
	public int delete(int id) throws Exception {
		String query = "delete from  student where id='" + id + "'";
	  callable = connection.prepareCall(query);

		return callable.executeUpdate(query);

	}

	/**
	 *purpose : to print the whole table 
	 */
	@Override
	public void showTable() throws Exception {

		String query = "select * from  student";
		callable = connection.prepareCall(query);
		ResultSet rs = callable.executeQuery(query);

		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: " + rs.getString(3));
		}

	}

}
