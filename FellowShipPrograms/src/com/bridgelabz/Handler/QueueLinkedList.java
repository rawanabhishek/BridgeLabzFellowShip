/******************************************************************************
 
 *  Purpose:this is handler utility class for queue in which queue is implemented using 
 *          linked list 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Handler;

public class QueueLinkedList<T> {
	Node<T> head;
	int size = 0;
	
	@SuppressWarnings("hiding")
	class Node<T>
	{
		Object data;
		Node<T> next;
		
		public Node(Object newData) 
		{
			data = newData;
			next = null;
		}
	}
	
	/**
	 * @param item to be added at the rear
	 */
	public void addRear(Object item)
	{
		Node<T> node = new Node<T>(item);
		if(head == null)
		{
			head = node;
			size++;
		}
		else 
		{
			Node<T> tempNode = head;
			while (tempNode.next != null) 
			{
				tempNode = tempNode.next;
			}
			tempNode.next = node;
			size++;
		}
	}
	
	/**
	 * @param item to be added at the front
	 */
	public void addFront(Object item) 
	{
		Node<T> node = new Node<T>(item);
		if(head == null)
		{
			head = node;
			size++;
		}
		else
		{
			node.next = head;
			head = node;
			size++;
		}
	}
	
	/**
	 * @return item to be removed from front
	 */
	public Object removeFront()
	{
		Node<T> node = head;
		if(isEmpty())
		{
			return "Nothing to be returned";
		}
		else 
		{
			if(node.next == null)
			{
				Object temp = head.data;
				head = null;
				size--;
				return temp;
			}
			else 
			{
				Object temp = head.data;
				head = head.next;
				size--;
				return temp;
			}
		}
	}
	
	/**
	 * return item to be removed from rear
	 */
	@SuppressWarnings("unchecked")
	public T removeRear()
	{
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
				size--;
				
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
				size--;
				
				return (T) temp;	
			}
		}
	}
	
	/**
	* @returns true if list is empty
	*/
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	/**
	* @return size of the linked list
	*/
	public int size()
	{
		return size;
	}
	
	/**
	*  Displays the data present in the list. 
	*/
	public void display() 
	{
		Node<T> node = head;
		if(head == null)
		{
			System.out.println("Nothing to display");
		}
		else
		{
			while(node != null)
			{
				System.out.print(node.data+" ");
				node = node.next;
			}
		}
		System.out.println();
	}

}
