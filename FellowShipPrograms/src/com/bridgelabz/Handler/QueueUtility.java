/******************************************************************************
 
 *  Purpose:This is handler utility class for Queue
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Handler;

public class QueueUtility<T> {
	public Object q[] = new Object[5];
	public int size = 0;
	public int front;
	public  int rear;
	
	
	//checking weather the queue is full or not
	public boolean isFull() {
		return size==5;
	}
	
	//checking weather the queue is empty or not
	public boolean isEmpty() {
		return size==0;
		
	}
	
	//enquing the values in the queue
	public T  enQueue(T data) {
		
		if(!isFull()) {
			q[rear]=data;
			rear=(rear+1)%5;
			size=size+1;
		}
		else {
			System.out.println("Queue is full  ");
		}
		return data;
	}
	
	
	//dequeing the values from the queue
	public T deQueue() {
		@SuppressWarnings("unchecked")
		T data=(T) q[front];
		if(!isEmpty()) {
			front=(front+1)%5;
			size=size-1;
		}else {
			System.out.println("Queue is Empty ");
		}
		return data;
	}
	
	

	//printing the whole queue
	public void show() {
		System.out.print("Element : ");
		for(int i=0;i<size;i++) {
			System.out.print(q[(front+i)%5]+" ");
		}
	}
}
