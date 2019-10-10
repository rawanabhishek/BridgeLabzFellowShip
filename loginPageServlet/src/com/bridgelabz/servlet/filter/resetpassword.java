/******************************************************************************
 
 *  Purpose: to filter the reset password page  and send response to servlet
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-10-2019
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
 * Servlet Filter implementation class resetpassword
 */
@WebFilter("/reset")
public class resetpassword implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		String newpassword = request.getParameter("newpassword");
		String confrimnewpassword = request.getParameter("confirmnewpassword");
		
		System.out.println("in reset filter");

		PrintWriter out = response.getWriter();

		// filtering the data from the form
		if (newpassword.equals(confrimnewpassword)) {
			chain.doFilter(request, response);
		}else {
			System.out.println(""+newpassword);
			System.out.println(""+confrimnewpassword);
			out.println("<script>alert('password mismatch')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("resetpassword.jsp");
			rd.include(request, response);
		}

		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
