package com.bridgelabz.preparedstatement.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bridgelabz.preparedstatement.repository.Connectivity;

import com.bridgelabz.preparedstatement.model.Student;

public class ImplPreparedStatement implements ICrudPreparedStatement {

	static Connection connection = Connectivity.getConnection();
	static PreparedStatement ps = null;

	/**
	 * purpose : to insert value in the table
	 */
	@Override
	public void createTable(Object student) throws Exception {

		String query = "insert into student values(?,?,?)";
		ps = connection.prepareStatement(query);
		ps.setInt(1, ((Student) student).getId());
		ps.setString(2, ((Student) student).getName());
		ps.setString(3, ((Student) student).getAddress());

		ps.executeUpdate();

	}

	/**
	 * purpose : to update values in the table
	 */
	@Override
	public int update( Object student) throws Exception {


		String query = "UPDATE student SET name=?, address=? WHERE id=?";
		ps = connection.prepareStatement(query);
		ps.setString(1, ((Student) student).getName());
		ps.setString(2, ((Student) student).getAddress());
		ps.setInt(3, ((Student) student).getId());
		

		return ps.executeUpdate();

	}

	/**
	 * purpose : to delete a particular row in the table
	 */
	@Override
	public int delete(int id) throws Exception {
		String query = "delete from  student where id=?";
		ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		

		return ps.executeUpdate();

	}

	/**
	 * purpose : to print the whole table
	 */
	@Override
	public void showTable() throws Exception {

		String query = "select * from  student";
		ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery(query);

		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: " + rs.getString(3));
		}

	}

}
