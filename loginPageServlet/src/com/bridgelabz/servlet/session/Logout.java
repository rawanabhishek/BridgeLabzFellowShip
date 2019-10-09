/******************************************************************************
 
 *  Purpose: to perform logout operation of user 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.servlet.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		session.removeAttribute("userName");
		session.invalidate();
		response.sendRedirect("login.jsp");
		

	}

}
