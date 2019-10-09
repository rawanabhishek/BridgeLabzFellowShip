/******************************************************************************
 
 *  Purpose: to perform login operation for user
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.servlet.dao.Dao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");

		Dao dao = new Dao();

		if (dao.check(username, pass)) {
			try {
				dao.Close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			HttpSession session = request.getSession();

			session.setAttribute("userName", username);
			
			session.setMaxInactiveInterval(2*60);
			Cookie userName = new Cookie("user", username);
			userName.setMaxAge(30*60);
			response.addCookie(userName);

			response.sendRedirect("index.jsp");
			
			

		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
			PrintWriter out= response.getWriter();
			out.println("<font color=red > user name or password is wrong.</font>");
			rd.include(request, response);
			
		}

	}

}
