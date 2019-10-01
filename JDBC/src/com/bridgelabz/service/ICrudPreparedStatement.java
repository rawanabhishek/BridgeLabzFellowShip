package com.bridgelabz.service;

public interface ICrudPreparedStatement {

	int delete(int id) throws Exception;

	int update(int id, Object student) throws Exception;

	void createTable(Object student) throws Exception;

	void showTable() throws Exception;

}
