/******************************************************************************
 
 *  Purpose: to spearate all the query from bussiness logic 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.servlet.model.User;

public class Dao {

	static Connection con = null;
	static PreparedStatement st = null;

	String url = "jdbc:mysql://localhost:3306/college?verifyServerCertificate=false&useSSL=true";
	String uname = "root";
	String pass = "password";

	

	/**
	 * purpose : to check the user is present in the databse or not
	 * @param username validating the user name
	 * @param password validating the password
	 * @return
	 */
	public boolean check(String username, String password) {

		String sql = "select * from user where username=? and password=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pass);
			st = con.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);

			ResultSet rs = st.executeQuery();
			

			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
		

	}

	/**
	 * purpose : to insert the user data in the database
	 * @param user  registrating the user
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void registerUser(User user) throws ClassNotFoundException, SQLException {

		String query = "insert into user (first_name ,last_name ,email,contact, password ,username) values (?,?,?,?,?,?)";

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, uname, pass);
		st = con.prepareStatement(query);
		st.setString(1, user.getFirstName());
		st.setString(2, user.getLastLast());
		st.setString(3, user.getEmail());
		st.setString(4, user.getContact());
		st.setString(5, user.getPassword());
		st.setString(6, user.getUserName());

		st.execute();
		Close();

	}

	/**
	 * purpose : to check the user id present in the database or not
	 * @param username validating the user name
	 * @return boolean value
	 */
	public boolean checkUserName(String username) {
		String sql = "select * from user where username=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pass);
			st = con.prepareStatement(sql);
			st.setString(1, username);

			ResultSet rs = st.executeQuery();
			
			
			if (rs.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public void Close() throws SQLException {
		st.close();
		con.close();

	}

}
