/******************************************************************************
 
 *  Purpose:This is handler utility for stack using linkedlist
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.handler;

import java.util.List;

public class StackLinkedList<T> {
	Node<T> head;
	public int top = -1;

	@SuppressWarnings("hiding")
	class Node<T> {
		Object data;
		Node<T> next;

		public Node(Object newData) {
			data = newData;
			next = null;
		}
	}

	// pushing the element in the stack
	public void push(T t) {
		Node<T> node = new Node<T>(t);
		if (head == null) {
			head = node;
			top++;
		} else {
			Node<T> tempNode = head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = node;
			top++;
		}

	}

	// poping the element from the stack
	@SuppressWarnings("unchecked")
	public T pop() {
		Node<T> node = head;
		if (head == null) {
			return (T) "Nothing to be returned";
		} else {
			if (node.next == null) {
				head = null;
				top--;

				return (T) node.data;
			} else {
				for(int i=0;i<top-1;i++) {
					node=node.next;
				}
				Object temp = node.next.data;
				node.next = null;
				top--;

				return (T) temp;
			}
		}
	}

	// checking weather the stack is empty or not
	public boolean isEmpty() {
		return top == -1;
	}

	// showing the stack
	public String show() {
		if (isEmpty()) {
			System.out.println("Stack is Underflow ");
		} else {

			for (int i = top; i >= 0; i--) {

				
				System.out.println(top + " ");

			}

		}
		return null;

	}

	//returing the stack size
	public int sizeStack() {
		return top;
	}

	//returing the peek element 
	@SuppressWarnings("unchecked")
	public T peek() {
		if (!isEmpty()) {
			
			
			Node<T> n = head;
			while (n.next != null) {
				n = n.next;

			}
			return (T) n.data;
		}
		return null;
		
	}
	
	public  void PushAll(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			push(list.get(i));

		}

	}

}
