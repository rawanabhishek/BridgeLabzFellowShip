package com.bridgelabz.oops;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.handler.QueueLinkedList;

import com.bridgelabz.model.Transactions;
import com.bridgelabz.model.TransactionsModel;
import com.bridgelabz.utility.jsonutility;

public class StockQueue {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
String sourceTransaction = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/transaction.json";
		

		TransactionsModel transaction = new TransactionsModel();

		transaction = (TransactionsModel) jsonutility.readMapper(sourceTransaction, transaction);
		QueueLinkedList<Transactions> queue = new QueueLinkedList<Transactions>();

		queue.enqueueAll(transaction.getTransactions());
		
		
		System.out.println("Trnasactions  are  :");
		
		for(int i=0;i<queue.size();i++) {
			System.out.println("Transaction date and time is : "+queue.getData(i).getDate());
			
		}
		
		
		

	}

}
