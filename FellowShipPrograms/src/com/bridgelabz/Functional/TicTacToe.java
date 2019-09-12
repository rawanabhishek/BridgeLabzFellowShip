/******************************************************************************
 
 *  Purpose:  ­> Program to play a Cross Game or Tic­Tac­Toe Game. Player 1 is
                the Computer and the Player 2 is the user. Player 1 take Random Cell 
                that is the Column and Row.
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.Utility.FunctionalUtility;

public class TicTacToe {

	static Scanner scanner = new Scanner(System.in);
	static String[][] board = new String[3][3];
	static int count = 1;
	static String win = "";
	static int winner=0;
	static String move = "c";
	static int isCollect[]=new int[9];
	static int value = 0;

	// main method
	public static void main(String[] args) {

		System.out.println("the board is : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = " - ";
			}

		}

		// printing the empty board
		FunctionalUtility.printboard(board);

		// calling the move method recursively
		if (move == "c") {

			movemethod(move);

		} else {

			movemethod(move);

		}

	}

	// move method to to take move in the board
	public static void movemethod(String move) {
		/*
		 * running the while loop till the count is less than or equal to nine to play
		 * every move till winner is optined
		 */
		
		
		//int collect = 0;
		while (count <= 9 && winner==0) {
			
			if (move == "c") {
				
				
				if (!won()) {

					if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
						 value = FunctionalUtility.Random9();
						
						
								
								if (value == 0 && board[0][0] == " - " && isCollect[value]==0) {
									System.out.println("Computer move  ");
									board[0][0] = " X ";
									
									
								

								} else if (value == 1 && board[0][1] == " - " && isCollect[value]==0) {
									System.out.println("Computer move ");
									board[0][1] = " X ";
									
								

								} else if (value == 2 && board[0][2] == " - " && isCollect[value]==0) {
									System.out.println("Computer move ");
									board[0][2] = " X ";
								
									

								} else if (value == 3 && board[1][0] == " - " && isCollect[value]==0) {
									System.out.println("Computer move ");
									board[1][0] = " X ";
									

								} else if (value == 4 && board[1][1] == " - " && isCollect[value]==0) {
									System.out.println("Computer move ");
									board[1][1] = " X ";
									

								} else if (value == 5 && board[1][2] == " - " && isCollect[value]==0) {
									System.out.println("Computer move ");
									board[1][2] = " X ";
								

								} else if (value == 6 && board[2][0] == " - " && isCollect[value]==0) {
									System.out.println("Computer move ");
									board[2][0] = " X ";
									
								} else if (value == 7 && board[2][1] == " - " && isCollect[value]==0) {
									System.out.println("Computer move ");
									board[2][1] = " X ";
									

								} else if (value == 8 && board[2][2] == " - " && isCollect[value]==0) {
									System.out.println("Computer move ");
									board[2][2] = " X ";
									
								}
								else if(isCollect[value]!=0){
									movemethod(move);
								}

								count++;
								move = "h";
								
								FunctionalUtility.printboard(board);
							}
						

					
					// changing move to h as after computer move the move is of human

				} else {
					System.out.println("Winnner is " + win);
					winner=1;
					break;
				}
			}

	// if the move is of human
			else if(move=="h")

	{
		if (!won()) {
			if (count == 2 || count == 4 || count == 6 || count == 8) {
				System.out.println("Enter your move : ");
				int m1 = scanner.nextInt();

				if (m1 == 00 && board[0][0] == " - ") {
					board[0][0] = " O ";
					isCollect[0]=1;

				} else if (m1 == 01 && board[0][1] == " - ") {
					board[0][1] = " O ";
					isCollect[1]=1;

				} else if (m1 == 02 && board[0][2] == " - ") {
					board[0][2] = " O ";
					isCollect[2]=1;

				} else if (m1 == 10 && board[1][0] == " - ") {
					board[1][0] = " O ";
					isCollect[3]=1;

				} else if (m1 == 11 && board[1][1] == " - ") {
					board[1][1] = " O ";
					isCollect[4]=1;

				} else if (m1 == 12 && board[1][2] == " - ") {
					board[1][2] = " O ";
					isCollect[5]=1;

				} else if (m1 == 20 && board[2][0] == " - ") {
					board[2][0] = " O ";
					isCollect[6]=1;

				} else if (m1 == 21 && board[2][1] == " - ") {
					board[2][1] = " O ";
					isCollect[7]=1;

				} else if (m1 == 22 && board[2][2] == " - ") {
					board[2][2] = " O ";
					isCollect[8]=1;


				}

				// changing move to c as after human move the move is of computer
				move = "c";
				FunctionalUtility.printboard(board);
				count++;

			}
		} else {
			System.out.println("Winnner is " + win);
			winner=1;
			break;
		}
	}

	else if(count>9)
	{
		System.out.println("Its a draw ");
		break;
	}
	}}

//winning method to check the who is winner 
	public static boolean won() {
		boolean won = false;
//
		if (board[0][0] == " O " && board[0][1] == " O " && board[0][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][0] == " O " && board[1][0] == " O " && board[2][0] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][0] == " O " && board[1][1] == " O " && board[2][2] == " O ") {
			won = true;
			win = " O ";

		} else if (board[0][1] == " O " && board[1][1] == " O " && board[2][1] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][2] == " O " && board[1][1] == " O " && board[2][0] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][2] == " O " && board[1][2] == " O " && board[2][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[1][0] == " O " && board[1][1] == " O " && board[1][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[2][0] == " O " && board[2][1] == " O " && board[2][2] == " O ") {
			won = true;
			win = " O ";
		}

//
		if (board[0][0] == " X " && board[0][1] == " X " && board[0][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][0] == " X " && board[1][0] == " X " && board[2][0] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][0] == " X " && board[1][1] == " X " && board[2][2] == " X ") {
			won = true;
			win = " X ";

		} else if (board[0][1] == " X " && board[1][1] == " X " && board[2][1] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][2] == " X " && board[1][1] == " X " && board[2][0] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][2] == " X " && board[1][2] == " X " && board[2][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[1][0] == " X " && board[1][1] == " X " && board[1][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[2][0] == " X " && board[2][1] == " X " && board[2][2] == " X ") {
			won = true;
			win = " X ";
		}
		return won;
	}
}
