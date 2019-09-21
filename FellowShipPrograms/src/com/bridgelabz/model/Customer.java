package com.bridgelabz.model;

public class Customer {
	private String id;
	private String name;
	private int shares;

	private int balance;

	public String getid() {
		return id;
	}

	public void setid(String symbol) {
		this.id = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int value) {
		this.balance = value;
	}

}
