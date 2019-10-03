package com.bridgelabz.batchprocessstatement.controller;

/******************************************************************************

 *  Purpose: program to perform batch processing using statement
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
import java.sql.Connection;

import java.sql.Statement;

import com.bridgelabz.batchprocessstatement.repository.Connectivity;



public class BatchProcessStatement {
	
	
    public static int[]  executeQuery() throws Exception {
    	Connection connection = Connectivity.getConnection();
		 Statement st = null;
		 
		 st = connection.createStatement();
		 String delete="delete from student ";
		 String query1="insert into student values(1,'rehman' ,'mumbai')";
		 String query2="insert into student values(2,'arjit' ,'mumbai')";
		 String query3="insert into student values(3,'honey' ,'mumbai')";
		 String query4="insert into student values(4,'malik' ,'mumbai')";
		 String query5="insert into student values(6,'ajay' ,'mumbai')";
		 st.addBatch(delete);
		 st.addBatch(query1);
		 st.addBatch(query2);
		 st.addBatch(query3);
		 st.addBatch(query4);
		 st.addBatch(query5);
		
		 return st.executeBatch();
    	
    	
    }
	public static void main(String[] args) throws Exception {
		 
		System.out.println("Batch process for  prepared statement ");
		int arr[]=executeQuery();
		for(int i : arr) {
			System.out.print(i +" ");
		}
		
	}

}
