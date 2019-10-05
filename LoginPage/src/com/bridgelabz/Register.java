package com.bridgelabz;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.model.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		User user=new User();
		
		user.setFirstName(request.getParameter("fname"));
		user.setLastLast(request.getParameter("lname"));
		user.setEmail(request.getParameter("email"));
		user.setContact(request.getParameter("contact"));
		user.setPassword(request.getParameter("pass"));
		
		Dao dao=new Dao();
		
		try {
			if(dao.checkUserName(user.getEmail())){
				
			}
			else {

				HttpSession session = request.getSession();

				session.setAttribute("userName", user.getEmail());

				response.sendRedirect("Welcome.jsp");

				dao.registerUser(user);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
