package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class CustomerModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Customer> customer = null;
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

}
