/******************************************************************************
 
 *  Purpose: to print the primeAnagram number between 0 to 1000 in a 2D Array
 *              using stack linkedlist
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.dataStructure;

import com.bridgelabz.handler.StackLinkedList;
import com.bridgelabz.utility.DataStructureUtility;

public class PrimeAnagramStack {

	public static void main(String[] args) {

		DataStructureUtility utility = new DataStructureUtility();
		StackLinkedList<Integer> stack = new StackLinkedList<Integer>();
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
							stack.push(j);
							stack.push(k);
						}
					}
				}

			}

		}

		System.out.println("The prime anagram are ");

		System.out.println();
		// printing the stack  of prime and anagram
		int size = stack.sizeStack();
		for (int i = 0; i < size; i++) {
			System.out.print(stack.peek() + "  ");
			if (!stack.isEmpty()) {
				stack.pop();
			}

		}
	}

}
