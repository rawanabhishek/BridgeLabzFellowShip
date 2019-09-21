package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class AdressBookModel implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private  List<Adressbook> adressbook;

	public List<Adressbook> getAdressbook() {
		return adressbook;
	}

	public void setAdressbook(List<Adressbook> adressbook) {
		this.adressbook = adressbook;
	}
	
	@Override
	public String toString() {
		return "AdressBookModel [adressbook=" + adressbook + "]";
	}


    

	

}
