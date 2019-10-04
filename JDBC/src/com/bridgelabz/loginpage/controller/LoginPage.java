/******************************************************************************
 
 *  Purpose: program to perform login page operation using jdbc
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.loginpage.controller;

import java.util.Scanner;

import com.bridgelabz.loginpage.model.Student;
import com.bridgelabz.loginpage.service.ImplPreparedStatement;

public class LoginPage {

	public static void main(String[] args) throws Exception {
		ImplPreparedStatement util = new ImplPreparedStatement();
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();

		boolean exit = true;
		while (exit) {
			System.out.println("---------------------------------");
			System.out.println("Press 1 login \nPress 2 to register \nPress 3 to exit ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter your id :");
				int id = scanner.nextInt();
				System.out.println("Enter your name :");
				String name = scanner.next();
				student = util.checkUser(id, name);
				if (student != null) {
					if (student.getId() > 0) {
						System.out.println(student.getId());
						System.out.println(student.getName());
						System.out.println(student.getAddress());
					} else {
						System.out.println("No such user found ");
					}
				}

				break;

			case 2:

				System.out.println("Enter student id  : ");
				int regid = scanner.nextInt();
				student.setId(regid);
				System.out.println("Enter student name : ");
				String regname = scanner.next();
				student.setName(regname);
				System.out.println("Enter student address  : ");
				student.setAddress(scanner.next());

				if (util.checkUser(regid, regname).getName() == null) {

					util.createTable(student);
					System.out.println(" you have been register succesfully ");
				} else {

					System.out.println("User already present ");

				}
				break;

			case 3:
				System.out.println("Thank you for your time ");
				exit = false;
				break;

			}

		}
		scanner.close();

	}
}
