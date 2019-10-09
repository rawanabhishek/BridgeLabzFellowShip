/******************************************************************************
 
 *  Purpose: to filter the login page and then send it to the servlet
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
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/login")
public class AuthenticationFilter implements Filter {

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 * purpose : to filter the login page and then send it to the servlet
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");

		String username = request.getParameter("username");
		String pass = request.getParameter("pass");

		PrintWriter out = response.getWriter();

		if (username == null || username.length() < 3 || pass.length() < 3 || pass == null) {
			System.out.println("in user filter");

			out.println("<script>alert('worng username or password input')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);

		}

		else {
			System.out.println("infilter");
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
