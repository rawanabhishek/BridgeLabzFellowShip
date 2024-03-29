/******************************************************************************

 *  Purpose: program to perform registration  of user 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   06-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.servlet.session;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.servlet.dao.Dao;
import com.bridgelabz.servlet.model.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();

		user.setFirstName(request.getParameter("fname"));
		user.setLastName(request.getParameter("lname"));
		user.setEmail(request.getParameter("email"));
		user.setUserName(request.getParameter("username"));
		user.setContact(request.getParameter("contact"));
		user.setPassword(request.getParameter("pass"));

		LocalDateTime date =LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		user.setDateUpdate(format.format(date));
		
		
		Dao dao = new Dao();

		try {
			if (dao.checkUserName(user.getUserName())) {
				dao.Close();

			} else {

				HttpSession session = request.getSession();

				session.setAttribute("userName", user.getUserName());

				dao.registerUser(user);
				response.sendRedirect("index.jsp");

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
