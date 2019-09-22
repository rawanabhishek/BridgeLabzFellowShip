package com.bridgelabz.model;

import java.util.List;

public class Adressbook {

	
	private String statecode;
	private List<Person> state;
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	public List<Person> getState() {
		return state;
	}
	public void setState(List<Person> state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Adressbook [statecode=" + statecode + ", state=" + state + "]";
	}

	

	
	

}
