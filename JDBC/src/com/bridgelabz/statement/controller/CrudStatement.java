/******************************************************************************
 
 *  Purpose: program to perform CURD operation using  statement
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   01-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.statement.controller;

import java.util.Scanner;

import com.bridgelabz.statement.model.Student;
import com.bridgelabz.statement.service.ImplStatement;



public class CrudStatement {

	public static void main(String[] args) throws Exception {
		ImplStatement util = new ImplStatement();
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		boolean exit = true;
		while (exit) {
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println("Press 1 to Insert  into table \nPress 2 to read table \nPress 3 to update "
					+ "table \nPress 4 to delete \nPress 5 to exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter student id  : ");
				student.setId(scanner.nextInt());
				System.out.println("Enter student name : ");
				student.setName(scanner.next());
				System.out.println("Enter student address  : ");
				student.setAddress(scanner.next());
				util.createTable(student);
				System.out.println("value inserted  succesfully ");
				break;

			case 2:

				util.showTable();
				break;

			case 3:
				util.showTable();
				System.out.println("Enter id which you want to perform updation ");
				int id = scanner.nextInt();
				System.out.println("Enter name to change: ");
				student.setName(scanner.next());
				System.out.println("Enter address to change: ");
				student.setAddress(scanner.next());

				util.update(id, student);

				util.showTable();
				break;

			case 4:
				util.showTable();
				System.out.println("Enter id which you want to delete ");
				int deleteId = scanner.nextInt();
				if(util.delete(deleteId)!=0) {
				
				util.showTable();
				}else {
					System.out.println(" no such user found ");
				}
				break;
			case 5:
				exit = false;

			}

		}
		scanner.close();
	}

}
