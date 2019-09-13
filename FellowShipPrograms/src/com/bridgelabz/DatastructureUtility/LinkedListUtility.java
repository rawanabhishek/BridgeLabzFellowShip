/******************************************************************************
 
 *  Purpose:This is utility class for linked list
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.DatastructureUtility;

public class LinkedListUtility<Type> {
	Node<Type> head;

	@SuppressWarnings("hiding")
	public class Node<Type> {
		Type data;
		Node<Type> next;
	}

	//inserting the element at the start
	public void insert(Type arr) {

		Node<Type> node = new Node<Type>();
		node.data = (Type) arr;
		// node.data = (String) null;

		if (head == null) {
			head = node;
		} else {
			Node<Type> n = head;

			while (n.next != null) {
				n = n.next;

			}
			n.next = node;
		}
	}

	public static String Write = " ";

	
	//printing the linked list
	public void show() {
		Node<Type> node = head;
		while (node.next != null) {
			System.out.println(node.data);

			node = node.next;

		}
		System.out.println(node.data);

	}

	
	//saving the linked list to Write String
	public void SaveToFile() {
		Node<Type> node = head;
		while (node.next != null) {

			Write += " " + node.data;
			node = node.next;

		}

		Write += " " + node.data;
	}

	//deleting data from list at a specific position
	public void deleteAt(int index) {

		if (index == 0) {
			head = head.next;
		} else {
			Node<Type> n = head;
			Node<Type> n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;

			}
			n1 = n.next;
			n.next = n1.next;
		}
	}

	
	//inserting the element at the start of the list
	public void insertAtstart(Type data) {
		Node<Type> head = null;
		Node<Type> node = new Node<Type>();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;

	}

	//inserting the element at a specific position 
		public void insertAt(int index, Type data) {
			Node<Type> node = new Node<Type>();
			node.data = data;
			node.next = null;

			if (index == 0) {
				insertAtstart(data);
			} else {
				LinkedListUtility<Type>.Node<Type> n = head;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				node.next = n.next;
				n.next = node;
			}
		}
	

	//sorting the linked list from ascending to descending order
	public     <T extends Comparable<T>>  void Sort(int size ) {
		
		
		@SuppressWarnings("unchecked")
		Node<T> n =  (Node<T>) head;
		Node<T> n1 = n.next;
	    T temp = null;

		for (int i = 0; i < size-1 ; i++) {
			
			for (int j = 0; j <= (size - 1) - i - 1; j++) {
			
				if (n.data.compareTo(n1.data)>0 ) {
					temp = n.data;
					n.data = n1.data;
					n1.data = temp;
					

				}
				n1 = n1.next;
			}

			n = n.next;
			n1 = n.next;

		}
		
		

	}

	
	//searching the value in the list
	public int SearchByKey(Type key ,int size) {
     
		Node<Type> n = head;
		boolean isFound = false;

		int count = -1;
		while (n.next != null) {
			count++;

			if (n.data == key) {
				isFound = true;
				break;
			}
			n = n.next;

		}

		if (isFound) {
			System.out.println("Num Found And is Being deleted");
			size--;
			deleteAt(count);
		}

		else if (n.data == key) {
			System.out.println("Num Found And is Being deleted");
			size--;
			deleteAt(++count);
		} else {
			System.out.println("Key not found hence inserting the value ");
			size++;
			insertAt(count, key);
		}
		return size;
	}

}
