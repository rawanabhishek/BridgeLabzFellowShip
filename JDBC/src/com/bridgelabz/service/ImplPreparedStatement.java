package com.bridgelabz.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.bridgelabz.model.Student;
import com.bridgelabz.repository.Connectivity;

public class ImplPreparedStatement implements ICrudPreparedStatement {
	
	static Connection connection = Connectivity.getConnection();
	static PreparedStatement ps = null;

	@Override
	public void createTable(Object student) throws Exception {

//		String query = "insert into student values(" + ((Student) student).getId() + ",'" + ((Student) student).getName() + "','"
//				+ ((Student) student).getAddress() + "')";
		

		String query = "insert into student values(?,?,?)";
		ps =  connection.prepareStatement(query);
		ps.setInt(1, ((Student) student).getId());
		ps.setString(2, ((Student) student).getName());
		ps.setString(3, ((Student) student).getAddress());

		
		ps.executeUpdate();
		
	

	}

	@Override
	public int update(int id, Object student) throws Exception {
		String query = "UPDATE student SET name='" + ((Student) student).getName() + "', address='"
				+ ((Student) student).getAddress() + "' WHERE id=" + id + "";

		ps = connection.prepareStatement(query);

		return ps.executeUpdate(query);

	}

	@Override
	public int delete(int id) throws Exception {
		String query = "delete from  student where id='" + id + "'";
		ps = connection.prepareStatement(query);

		return ps.executeUpdate(query);

	}

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
