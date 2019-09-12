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
		

		StackUtility<Character> utility=new StackUtility<Character>();
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		char[] stack = str.toCharArray();

		for (int i = 0; i < stack.length; i++) {
			if (stack[i] == '(') {
				utility.push(stack[i]);
			}
		else if (stack[i] == ')') {
			 utility.pop();
			}
		}

		
		System.out.println("The expression is :");
		for (int i = 0; i < stack.length; i++) {
			System.out.print(stack[i] + "");
		}
		System.out.println();

		if (StackUtility.isEmpty()) {
			System.out.println("The given expression is balanced ");
		}
		else {
			System.out.println("The given expression is not balanced ");
		}
	}

}
