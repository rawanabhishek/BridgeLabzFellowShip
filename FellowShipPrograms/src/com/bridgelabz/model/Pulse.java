package com.bridgelabz.model;

public class Pulse {
	private String name;
	private int weight;
	private int priceperkg;
	private int totalvalue;

	public int getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(int totalvalue) {
		this.totalvalue = totalvalue;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public int getWeight() {
	return weight;
	}

	public void setWeight(int weight) {
	this.weight = weight;
	}

	public int getPriceperkg() {
	return priceperkg;
	}

	public void setPriceperkg(int priceperkg) {
	this.priceperkg = priceperkg;
	}

}
