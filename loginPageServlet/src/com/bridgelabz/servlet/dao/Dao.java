/******************************************************************************
 
 *  Purpose: to spearate all the query from bussiness logic 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.servlet.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.bridgelabz.servlet.model.User;

public class Dao {

	static Connection con = null;
	static PreparedStatement st = null;

	String url = "jdbc:mysql://localhost:3306/users?verifyServerCertificate=false&useSSL=true";
	String uname = "root";
	String pass = "password";

	/**
	 * purpose : to check the user is present in the databse or not
	 * 
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
	 * 
	 * @param user registrating the user
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public void registerUser(User user) throws ClassNotFoundException, SQLException {

		String query = "insert into user (first_name ,last_name ,email,contact, password ,username ,dateupdated) values (?,?,?,?,?,?,?)";

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, uname, pass);
		st = con.prepareStatement(query);
		st.setString(1, user.getFirstName());
		st.setString(2, user.getLastName());
		st.setString(3, user.getEmail());
		st.setString(4, user.getContact());
		st.setString(5, user.getPassword());
		st.setString(6, user.getUserName());
		st.setString(7, user.getDateUpdate());

		st.execute();
		Close();

	}

	/**
	 * purpose : to check the user id present in the database or not
	 * 
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

	/**
	 * purpose : to return the paticular data of the user
	 * 
	 * @param username validating the user name
	 * @return boolean value
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public ResultSet userData(String username) throws ClassNotFoundException, SQLException {
		String sql = "select * from user where username=?";

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, uname, pass);
		st = con.prepareStatement(sql);
		st.setString(1, username);

		ResultSet rs = st.executeQuery();

		return rs;

	}

	/**
	 * purpose : to close the connection
	 * 
	 * @throws SQLException
	 */
	public void Close() throws SQLException {
		st.close();
		con.close();

	}
	
	/**
	 * purpose : to send email  to receipnt
	 * @param host server 
	 * @param port  server port to host
	 * @param toAddress recipent email address 
	 * @throws AddressException
	 * @throws MessagingException
	 */
	public static void sendEmail(String host, String port,
            final String toAddress) throws AddressException,
            MessagingException {
		
		String userName="forgotbridge70@gmail.com";
		String password="8855220088";
 
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
 
       
        msg.setText("http://localhost:8080/loginPageServlet/resetpassword.jsp?email="+toAddress);
 
        // sends the e-mail
        Transport.send(msg);
 
    }
	
	
	/**
	 * purpose : to change the password of the user 
	 * @param email user email to change password
	 * @param password user new password
	 * @return  true if the execution is perfromed else return false 
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean changePassword(String email, String password) throws SQLException, ClassNotFoundException {
		 Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, uname, pass);
		st = con.prepareStatement("UPDATE user SET password=? WHERE email=?");

		st.setString(1, password);
	  	st.setString(2, email);
		if (st.executeUpdate() == 1)
			return true;
		return false;
	}

	
}
