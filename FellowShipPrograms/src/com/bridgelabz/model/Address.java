package com.bridgelabz.model;

public class Address {
	private String zipcode;

	private String city;

	private String state;

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", city=" + city + ", state=" + state + "]";
	}
	

}
