/******************************************************************************
 
 *  Purpose:To  Take an Arithmetic Expression such as
            (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
             performance of operations. Ensure parentheses must appear in a balanced
             fashion.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.DataStructure;

import com.bridgelabz.DatastructureUtility.StackUtility;

public class ParenthesesStack {
	
	

	

	public static void main(String[] args) {
		
        //creating a generic type object of StackUtility
		StackUtility<Character> utility=new StackUtility<Character>();
		
		
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		char[] stack = str.toCharArray();

		
		//pusing the '(' from the string to the stack
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] == '(') {
				utility.push(stack[i]);
			}
		//poping the '(' from stack if  string element is ')'
		else if (stack[i] == ')') {
			 utility.pop();
			}
		}

		
		System.out.println("The expression is :");
		for (int i = 0; i < stack.length; i++) {
			System.out.print(stack[i] + "");
		}
		System.out.println();

		
		//if stack is empty printing expression is balanced
		if (StackUtility.isEmpty()) {
			System.out.println("The given expression is balanced ");
		}
		
		else {
			System.out.println("The given expression is not balanced ");
		}
	}

}
