package com.bridgelabz.services;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface addressbookinterface {
	public  void addPerson() throws JsonParseException, JsonMappingException, IOException;
	public void editPerson()throws JsonParseException, JsonMappingException, IOException;
	public void sortName() throws JsonParseException, JsonMappingException, IOException;
	public void sortzip()  throws JsonParseException, JsonMappingException, IOException;
	public void printEntries() throws JsonParseException, JsonMappingException, IOException;
	public void deletePerson() throws JsonParseException, JsonMappingException, IOException, InterruptedException;
	public void savedAs() throws JsonGenerationException, JsonMappingException, IOException;
	public void readJson() throws JsonParseException, JsonMappingException, IOException;
	
	public void saveAddressBook() throws JsonParseException, JsonMappingException, IOException;
	
	

}
