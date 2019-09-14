package com.bridgelabz.DataStructure;

import com.bridgelabz.Handler.QueueLinkedList;

import com.bridgelabz.Utility.DataStructureUtility;

public class PrimeAnagramQueue {

	public static void main(String[] args) {
		DataStructureUtility utility = new DataStructureUtility();
		QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
		int start = 0;
		int end = 1000;
		

		

		for (int j = start; j < end; j++) {
			// checking j is prime or not and returning true or flase
			if (utility.PrimeChecker(j)) {
				for (int k = j + 1; k < end; k++) {
					// checking k is prime or not and returning true or flase
					if (utility.PrimeChecker(k)) {
						// checking j & k is anagram or not and returning true or flase
						if (utility.Anagram(String.valueOf(j), String.valueOf(k))) {
							//pushing the element in the stack
							queue.addRear(j);
							queue.addRear(k);
							
						}
					}
				}

			}

		}

		System.out.println("The prime anagram are ");

		System.out.println();
		// printing the queue  of prime and anagram
		int size = queue.sizeQueue();
		for (int i = 0; i < size; i++) {
			
			System.out.print(queue.removeFront() + "  ");
		

		}

	}

}
