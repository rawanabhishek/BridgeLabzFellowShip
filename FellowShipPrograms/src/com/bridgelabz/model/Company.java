package com.bridgelabz.model;

public class Company {
	private String symbol;
	private String name;
	private int shares;
	private int sharesprice;
	private int totalvalue;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
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

	public int getSharesprice() {
		return sharesprice;
	}

	public void setSharesprice(int sharesprice) {
		this.sharesprice = sharesprice;
	}

	public int getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(int totalvalue) {
		this.totalvalue = totalvalue;
	}

}
