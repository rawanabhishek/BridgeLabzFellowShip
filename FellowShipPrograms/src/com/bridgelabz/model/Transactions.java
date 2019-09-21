package com.bridgelabz.model;

import java.io.Serializable;

public class Transactions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String transactionid;
	private String buyer;
	private String seller;
	private int amount;
	private String date;
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
