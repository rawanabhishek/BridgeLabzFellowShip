package com.bridgelabz.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.servlet.dao.Dao;

/**
 * Servlet implementation class ResetPassword
 */
@WebServlet("/reset")
public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		Dao dao=new Dao();

		String password = request.getParameter("newpassword");
		try {
			if (dao.changePassword(email, password)) {
				
				dao.Close();
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(30 * 60);
				session.setAttribute("emailId", email);
				response.sendRedirect("index.jsp");
			} else {
				System.out.println(""+email);
				System.out.println(""+password);
				dao.Close();
				out.print("<script>alert('input mismatch')</script>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
