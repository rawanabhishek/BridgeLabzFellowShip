package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class AdressBookModel implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private  List<Person> person;

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "AdressBookModel [person=" + person + "]";
	}

	
	


    

	

}
