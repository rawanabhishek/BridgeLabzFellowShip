package com.bridgelabz.loginpage.service;

import com.bridgelabz.loginpage.model.Student;

public interface ICrudPreparedStatement {

	Student checkUser(int id, String name) throws Exception;

	

	int createTable(Student student) throws Exception;

}
