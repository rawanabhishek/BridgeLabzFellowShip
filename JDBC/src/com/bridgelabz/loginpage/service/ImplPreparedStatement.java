package com.bridgelabz.loginpage.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bridgelabz.loginpage.model.Student;
import com.bridgelabz.preparedstatement.repository.Connectivity;





public class ImplPreparedStatement implements ICrudPreparedStatement {
	
	static Connection connection = Connectivity.getConnection();
	static PreparedStatement ps = null;


	/**
	 *purpose : to insert value in the table
	 */
	@Override
	public int createTable(Student student) throws Exception {


		

		String query = "insert into student values(?,?,?)";
		ps =  connection.prepareStatement(query);
		ps.setInt(1, ((Student) student).getId());
		ps.setString(2, ((Student) student).getName());
		ps.setString(3, ((Student) student).getAddress());

		
		return ps.executeUpdate();
		
		
		
	

	}


	/**
	 *purpose : to check the user is present in the table or not 
	 */
	@Override
	public   Student  checkUser(int id , String name ) throws Exception {
		
		Student student =new Student();
		String query  ="select * from student where id=? and name=?";
		
		ps = connection.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2,name);
		
		ResultSet rs =ps.executeQuery();
		
		while(rs.next()) {
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setAddress(rs.getString(3));
			
		}
			
	
		return student;
		
	}



}
