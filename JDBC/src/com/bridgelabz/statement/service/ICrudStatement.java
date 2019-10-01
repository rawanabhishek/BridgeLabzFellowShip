package com.bridgelabz.statement.service;

public interface ICrudStatement {

	int delete(int id) throws Exception;

	int update(int id, Object student) throws Exception;

	void createTable(Object student) throws Exception;

	void showTable() throws Exception;

}
