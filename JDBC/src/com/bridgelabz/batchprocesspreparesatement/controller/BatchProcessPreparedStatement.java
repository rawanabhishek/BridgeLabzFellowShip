/******************************************************************************
 
 *  Purpose: program to perform batch processing using prepared statement
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.batchprocesspreparesatement.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bridgelabz.batchprocesspreparesatement.repository.Connectivity;



public class BatchProcessPreparedStatement {

	public static int[] executeQuery() throws Exception {
		Connection connection = Connectivity.getConnection();
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		
		String query = "insert into student values(?,?,?)";
		String query1="delete from student";
		ps = (PreparedStatement) connection.prepareStatement(query);
		ps1 = (PreparedStatement) connection.prepareStatement(query1);
		
		ps1.addBatch();
		ps.setInt(1, 8);
		ps.setString(2, "abhishek");
		ps.setString(3, "bhandup");
		ps.addBatch();

		ps.setInt(1, 9);
		ps.setString(2, "rishi");
		ps.setString(3, "panvel");
		ps.addBatch();

		ps.setInt(1, 10);
		ps.setString(2, "vishnu");
		ps.setString(3, "khandeshwar");
		ps.addBatch();

		ps.setInt(1, 11);
		ps.setString(2, "mark");
		ps.setString(3, "chembur");
		ps.addBatch();

		ps.setInt(1, 12);
		ps.setString(2, "priya");
		ps.setString(3, "latur");
		ps.addBatch();

         ps1.execute();
		return ps.executeBatch();

	}

	public static void main(String[] args) throws Exception {

		System.out.println("Batch process for  prepared statement ");
		int arr[] = executeQuery();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
