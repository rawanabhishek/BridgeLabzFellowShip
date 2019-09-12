package com.bridgelabz.DatastructureUtility;

public class LinkedListUtility<T> {
	Node<T> head;

	public class Node<Type> {
		Type data;
		Node<Type> next;
	}

	public void insert(T arr) {

		Node<T> node = new Node<T>();
		node.data = (T) arr;
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

	public void show() {
		Node<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);

			node = node.next;

		}
		System.out.println(node.data);

	}

	public void SaveToFile() {
		Node<T> node = head;
		while (node.next != null) {

			Write += " " + node.data;
			node = node.next;

		}

		Write += " " + node.data;
	}

	public void deleteAt(int index) {

		if (index == 0) {
			head = head.next;
		} else {
			Node<T> n = head;
			Node<T> n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;

			}
			n1 = n.next;
			n.next = n1.next;
		}
	}

	public void insertAtstart(T data) {
		Node<T> head = null;
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;

	}

	//inserting the element at a specific position 
		public void insertAt(int index, T data) {
			Node<T> node = new Node<T>();
			node.data = data;
			node.next = null;

			if (index == 0) {
				insertAtstart(data);
			} else {
				LinkedListUtility<T>.Node<T> n = head;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				node.next = n.next;
				n.next = node;
			}
		}
	/****************************************************************************************************/

	
	public  void Sort(int size ) {
		
		
		Node<T> n = head;
		Node<T> n1 = n.next;
	    T temp;

		for (int i = 0; i < size-1 ; i++) {
			
			for (int j = 0; j <= (size - 1) - i - 1; j++) {
			
				if ((int)n.data >(int)n1.data) {
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
	public int SearchByKey(T key ,int size) {
     
		Node<T> n = head;
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
