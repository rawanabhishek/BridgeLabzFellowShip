package com.bridgelabz.preparedstatement.service;



public interface ICrudPreparedStatement {

	int delete(int id) throws Exception;

	int update( Object student) throws Exception;

	void createTable(Object student) throws Exception;

	void showTable() throws Exception;



}
