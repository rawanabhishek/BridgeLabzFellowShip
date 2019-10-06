package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.model.User;

public class Dao {

	String url = "jdbc:mysql://localhost:3306/college?verifyServerCertificate=false&useSSL=true";
	String uname = "root";
	String pass = "password";

	String sql = "select * from user where username=? and password=?";

	public boolean check(String username, String password) {

		String sql = "select * from user where username=? and password=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = con.prepareStatement(sql);
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

	public void registerUser(User user) throws ClassNotFoundException, SQLException {

		String query = "insert into user (first_name ,last_name ,email,contact, password ,username) values (?,?,?,?,?,?)";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, user.getFirstName());
		st.setString(2, user.getLastLast());
		st.setString(3, user.getEmail());
		st.setString(4, user.getContact());
		st.setString(5, user.getPassword());
		st.setString(6, user.getUserName());

		st.execute();

	}
	
	public boolean checkUserName(String username) {
		String sql = "select * from user where username=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = con.prepareStatement(sql);
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

}
