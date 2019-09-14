/******************************************************************************
 
 *  Purpose: this is a handler utility class for stack implementation 
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Handler;

public class StackUtility<T> {

	 static Object stack[] =new  Object[20];
	 static int top=-1;
	 
	 //pushing the element in the stack
	 public void push(T data) {
			if (isFull()) {
				System.out.println("Stack is Full");
			} else {
				stack[++top] = (char) data;
			}

		}

	// checking weather the element is full or not
	public	 boolean isFull() {
			
			if (top == stack.length - 1) {
				return true;
			} else {
				return false;
			}
		}

		// poping the element from the top position
		public void  pop() {
			if (isEmpty()) {
			System.out.println("Stack is empty ");
			} else {
				stack[top]=top--;

			}

		}

		// seeking for the peak element
	@SuppressWarnings("unchecked")
	public	 T  peek() {
			if (isEmpty()) {
				return null ;
			} else {
				return (T) stack[top];
			}
		}
		
		//showing all the element from the stack
		public static void show() {
			if(isEmpty()) {
				System.out.println("Stack is Underflow ");
			}
			else {
				
				for(int i=top;i>=0;i--) {
					
						System.out.println(stack[i]);
						
					}
					
				
			}
		}

		// checking weather the stack is empty or not
		public static boolean isEmpty() {
			if (top == -1) {
				return true;
			} else {
				return false;
			}
		}

		
}


