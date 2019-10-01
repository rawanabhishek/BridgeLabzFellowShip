package com.bridgelabz.statement.service;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;

import com.bridgelabz.statement.repository.Connectivity;

import com.bridgelabz.statement.model.Student;


public class ImplStatement implements ICrudStatement {
	
	static Connection connection = Connectivity.getConnection();
	static Statement st = null;

	@Override
	public void createTable(Object student) throws Exception {

		String query = "insert into student values(" + ((Student) student).getId() + ",'" + ((Student) student).getName() + "','"
				+ ((Student) student).getAddress() + "')";
		

		st = connection.createStatement();
		st.executeUpdate(query);

	}

	@Override
	public int update(int id, Object student) throws Exception {
		String query = "UPDATE student SET name='" + ((Student) student).getName() + "', address='"
				+ ((Student) student).getAddress() + "' WHERE id=" + id + "";

		st = connection.createStatement();

		return st.executeUpdate(query);

	}

	@Override
	public int delete(int id) throws Exception {
		String query = "delete from  student where id='" + id + "'";
		st = connection.createStatement();

		return st.executeUpdate(query);

	}

	@Override
	public void showTable() throws Exception {

		String query = "select * from  student";
		st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: " + rs.getString(3));
		}

	}

}
