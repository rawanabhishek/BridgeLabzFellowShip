package com.bridgelabz.transactionsavepoint.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.Savepoint;

import com.bridgelabz.preparedstatement.repository.Connectivity;

public class ImplSavePoint implements ISavePoint {
	Connection connection = Connectivity.getConnection();

	/**
	 *  purpose : to perfrom save point using prepared statement
	 */
	@Override
	public void savePoint() throws Exception {

		PreparedStatement ps = null;

		String query = "insert into student values(?,?,?)";
		connection.setAutoCommit(false);

		ps = (PreparedStatement) connection.prepareStatement(query);

		ps.setInt(1, 8);
		ps.setString(2, "abhishek");
		ps.setString(3, "bhandup");
		ps.executeUpdate();

		ps.setInt(1, 9);
		ps.setString(2, "rishi");
		ps.setString(3, "panvel");
		ps.executeUpdate();

		ps.setInt(1, 10);
		ps.setString(2, "vishnu");
		ps.setString(3, "khandeshwar");
		ps.executeUpdate();

		Savepoint savepoint = connection.setSavepoint();

		ps.setInt(1, 11);
		ps.setString(2, "mark");
		ps.setString(3, "chembur");
		ps.executeUpdate();

		ps.setInt(1, 12);
		ps.setString(2, "priya");
		ps.setString(3, "latur");
		ps.executeUpdate();

		connection.rollback(savepoint);

		connection.commit();
		
		connection.setAutoCommit(true);

	}

}
