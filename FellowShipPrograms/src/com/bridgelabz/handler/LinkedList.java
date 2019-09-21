/******************************************************************************
 
 *  Purpose:This is handler utility for linklist
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.handler;

import java.util.List;

public class LinkedList<T> {
	Node<T> head;

	public void insert(Object data) {

		Node<T> node = new Node<T>();
		node.data = (T) data;

		// node.data = (String) null;

		if (head == null) {
			head = node;
		} else {
			Node<T> n = head;

			while (n.next != null) {
				n = n.next;

			}
			n.next = node;
		}
	}

	public static String Write = " ";

	// printing the linked list
	public void show() {
		Node<T> node = head;
		while (node.next != null) {
			System.out.println(" " + node.data);

			node = node.next;

		}
		System.out.print(" " + node.data);

	}

	// saving the linked list to Write String
	public void SaveToFile() {
		Node<T> node = head;
		while (node.next != null) {

			Write += " " + node.data;
			node = node.next;

		}

		Write += " " + node.data;
	}

	// deleting data from list at a specific position
	@SuppressWarnings("unchecked")
	public T deleteAt(int index) {
		T temp = null;
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> n = head;
			Node<T> n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
				temp = (T) n.data;

			}
			n1 = n.next;
			n.next = n1.next;

		}
		return temp;
	}

	// deleting data from list at satrt
	public void deleteAtStart() {

		head = head.next;

	}

	// deleting data from list at satrt
	public <T> T deQueueFromStart() {
		if (!isEmpty()) {
			@SuppressWarnings("unchecked")
			T temp = (T) head.data;

			head = head.next;
			return (T) temp;
		}
		return null;
	}

	// deleting data from list at satrt
	@SuppressWarnings("unchecked")
	public <T> T deQueueFromEnd() {

		T temp = null;

		while (head.next == null) {
			head = head.next;
			temp = (T) head.data;

		}
		return (T) temp;
	}

	// checking the list is empty or not
	public boolean isEmpty() {

		if (head == null) {
			return true;
		}
		return false;
	}

	// inserting the element at the start of the list
	public void insertAtstart(T data) {
		Node<T> head = null;
		Node<T> node = new Node<T>();
		node.data = (T) data;
		node.next = null;
		node.next = head;
		head = node;

	}

	// inserting the element at a specific position
	public void insertAt(int index, T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;

		if (index == 0) {
			insertAtstart(data);
		} else {
			Node<T> n =  head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	// sorting the linked list from ascending to descending order
	public <Type extends Comparable<Type>> void Sort(int size) {

		@SuppressWarnings("unchecked")
		Node<Type> n = (Node<Type>) head;
		Node<Type> n1 = n.next;
		Type temp = null;

		for (int i = 0; i < size - 1; i++) {

			for (int j = 0; j <= (size - 1) - i - 1; j++) {

				if (n.data.compareTo(n1.data) > 0) {
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

	// searching the value in the list
	public int SearchByKey(T key, int size) {

		Node<T> n = head;
		boolean isFound = false;
		int count = -1;
		if (n.next == null) {

			count++;
			if (n.data == key) {
				isFound = true;

			}
		}

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

	// getting the data at specific position
	@SuppressWarnings("unchecked")
	public T getData(int index) {

		if (index == 0) {
			return head.data;
		} else {
			Node<T> n = head;
			for (int i = 0; i < index; i++) {
				if (n.next != null) {
					n = n.next;
				} else {
					return null;
				}
			}
			return n.data;
		}
	}

	// getting the size of the array
	public int getSize() {
		int size = 0;
		Node<T> n = head;
		if (head == null) {

			return size;

		} else {
			while (n.next != null) {
				size++;
				n = n.next;
			}

			return size + 1;
		}
	}

	public <T> void addAll(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			insert(list.get(i));

		}

	}

	public boolean Search(T statecode, int size) {
		Node<T> n = head;
		
		System.out.println("HSAJBHJASJDGJAS");
		if (n.next == null) {

			if (n.data == statecode) {
				System.out.println(n.data);
				return true;

			}
		}

		while (n.next != null) {

			if (n.data == statecode) {
				System.out.println(n.data);
				return true;

			}
			n = n.next;

		}
		return false;
	}

}
