package com.bridgelabz.servlet.session;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.servlet.dao.Dao;

/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/forgot")
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String recipient = request.getParameter("email");

		String resultMessage = "Hie";

		try {
			Dao.sendEmail("smtp.gmail.com", "587", recipient );
			resultMessage = "The e-mail was sent successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			resultMessage = "There were an error: " + ex.getMessage();
		} finally {
			request.setAttribute("Message", resultMessage);
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}
}
