package com.bridgelabz.oops;


import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.handler.QueueLinkedList;
import com.bridgelabz.handler.StackLinkedList;
import com.bridgelabz.model.Transactions;
import com.bridgelabz.model.TransactionsModel;
import com.bridgelabz.utility.ScannerUtility;
import com.bridgelabz.utility.jsonutility;

public class StockStack {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String sourceTransaction = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/transaction.json";
		

		TransactionsModel transaction = new TransactionsModel();

		transaction = (TransactionsModel) jsonutility.readMapper(sourceTransaction, transaction);
		StackLinkedList<Transactions> stack = new StackLinkedList<Transactions>();

		stack.PushAll(transaction.getTransactions());

		System.out.println("Enter company symbol to see transaction :");
		String cmpsym = ScannerUtility.stringScanner();

		int size = stack.sizeStack();

		for (int i = 0; i < size; i++) {
			if (cmpsym.equals(stack.peek().getSeller())) {
				if (i == 0) {
					System.out.print("Transaction_id\t\t");
					System.out.print("Buyer \t\t");
					System.out.print("Seller \t\t");
					System.out.print("Transaction amount\t\t");
					System.out.print("Date time \t\t");
				}
				
				System.out.println();
				System.out.print(stack.peek().getTransactionid()+"\t");
				System.out.print(stack.peek().getBuyer()+"\t");
				System.out.print(stack.peek().getSeller()+"\t\t");
				System.out.print(stack.peek().getAmount()+"\t\t\t");
				System.out.print(stack.peek().getDate()+"\t\t");
				
			}
			stack.pop();
		}

	}

}
