/******************************************************************************
 
 *  Purpose:This is handler utility for stack using linkedlist
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Handler;



public class StackLinkedList<T> {
	Node<T> head;
	int top = -1;

	@SuppressWarnings("hiding")
	class Node<T> {
		Object data;
		Node<T> next;

		public Node(Object newData) {
			data = newData;
			next = null;
		}
	}

	//pushing the element in the stack
	public void push(T data) {
		Node<T> node = new Node<T>(data);
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

	//poping the element from the stack
	@SuppressWarnings("unchecked")
	public T pop() {
		Node<T> node = head;
		if(head == null)
		{
			return (T) "Nothing to be returned";
		}
		else
		{
			if(node.next == null)
			{
				head = null;
				top--;
				
				return (T) node.data;
			}
			else 
			{
				while(node.next.next != null)
				{
					node = node.next;
				}
				Object temp = node.next.data;
				node.next =null;
				top--;
				
				return (T) temp;	
			}}
	}

	
	//checking weather the stack is empty or not 
	public boolean isEmpty() {
		return top == -1;
	}

}
