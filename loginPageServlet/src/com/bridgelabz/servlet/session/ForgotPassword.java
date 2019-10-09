package com.bridgelabz.servlet.session;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/forgot")
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Properties properties = null;
	 private String to = "";
	 private String from = "forgotbridge70@gmail.com";
	private String password = "";
	private Session session = null;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("in");
		

		String email = request.getParameter("email");
		to += email;
		properties = new Properties();

		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		session = Session.getDefaultInstance(properties, new Authenticator() {
	
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);

			}
		});
		Message message = prepareMessage(session, from, to);
		try {
			Transport.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
		System.out.println("Mail send");

	}

	private Message prepareMessage(Session session, String from, String to) {
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(from));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Password change email");
			message.setText("http://localhost:8080/LoginPageApplication/changepassword.jsp?email=" + to + "");

		} catch (MessagingException e) {

			e.printStackTrace();
		}
		return message;
	}

}
