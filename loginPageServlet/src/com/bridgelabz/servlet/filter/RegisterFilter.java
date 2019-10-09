/******************************************************************************
 
 *  Purpose: to filter the register page and then send it to the servlet
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class RegisterFilter
 */
@WebFilter("/register")
public class RegisterFilter implements Filter {

 

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 * purpose : to filter the register page and then send it to the servlet
	 */
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		
		
		//getting values using request.getparameter
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String email=request.getParameter("email");
        String contact=request.getParameter("contact");
      
		PrintWriter out = response.getWriter();
		
		
		//filtering the data from the form
		if(username == null || username.length() < 3) {
			out.println("<script>alert('worng username  input')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}else if( pass.length() < 3 || pass == null) {
			out.println("<script>alert('worng  password input')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}else if(fname == null || fname.length() < 3) {
			out.println("<script>alert('worng first name input')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}else if(lname == null || lname.length() < 3) {
			out.println("<script>alert('worng last name input')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}else if(email == null || email.length() < 5) {
			out.println("<script>alert('worng email input')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}else if(contact == null || contact.length() < 10) {
			out.println("<script>alert('worng contact input')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}else {
			chain.doFilter(request, response);
		}

		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
