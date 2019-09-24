package com.bridgelabz.model;

import java.io.Serializable;
import java.util.List;

public class TransactionsModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String transaction;
	private List<Transactions> transactions;
	
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public List<Transactions> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "TransactionsModel [transaction=" + transaction + ", transactions=" + transactions + "]";
	}
	

}
