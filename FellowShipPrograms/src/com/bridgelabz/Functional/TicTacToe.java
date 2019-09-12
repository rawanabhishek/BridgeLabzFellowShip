package com.bridgelabz.Functional;

import java.util.Scanner;

import com.bridgelabz.Utility.FunctionalUtility;

public class TicTacToe {
	static String[][] board = new String[3][3];
	static int count = 1;
	static String win = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FunctionalUtility utility = new FunctionalUtility();

		System.out.println("the board is : ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = " - ";
			}

		}

		utility.printboard(board);

		String move = "c";
		while (count <= 9) {
			if (count == 1) {
				int value = FunctionalUtility.Random();
				System.out.println("Computer move first ");

				if (value == 0 && board[0][0] == " - ") {
					board[0][0] = " X ";

				} else if (value == 1 && board[0][2] == " - ") {
					board[0][2] = " X ";

				} else if (value == 2 && board[2][0] == " - ") {
					board[2][0] = " X ";

				} else if (value == 3 && board[2][2] == " - ") {
					board[2][2] = " X ";

				} else if (value == 4 && board[1][1] == " - ") {
					board[1][1] = " X ";

				}
				FunctionalUtility.printboard(board);
				count++;

			}
			if (count == 2 || count == 4 || count == 6 || count == 8) {
				System.out.println("Enter your move : ");
				int m1 = scanner.nextInt();

				if (m1 == 00 && board[0][0] == " - ") {
					board[0][0] = " O ";

				} else if (m1 == 01 && board[0][1] == " - ") {
					board[0][1] = " O ";
				} else if (m1 == 02 && board[0][2] == " - ") {
					board[0][2] = " O ";
				} else if (m1 == 10 && board[1][0] == " - ") {
					board[1][0] = " O ";
				} else if (m1 == 11 && board[1][1] == " - ") {
					board[1][1] = " O ";
				} else if (m1 == 12 && board[1][2] == " - ") {
					board[1][2] = " O ";
				} else if (m1 == 20 && board[2][0] == " - ") {
					board[2][0] = " O ";
				} else if (m1 == 21 && board[2][1] == " - ") {
					board[2][1] = " O ";
				} else if (m1 == 22 && board[2][2] == " - ") {
					board[2][2] = " O ";

				}

				utility.printboard(board);
				count++;

			}

			if (count == 3) {
				System.out.println("Computer has taken the move ");
				if (board[1][1] == " - ") {
					board[1][1] = " X ";
				} else {
					if (board[0][0] == " O ") {
						board[0][2] = " X ";
					} else if (board[0][2] == " O ") {
						board[2][2] = " X ";
					} else if (board[2][0] == " O ") {
						board[2][2] = " X ";
					} else if (board[2][2] == " O ") {
						board[0][2] = " X ";
					}
				}
				utility.printboard(board);
				count++;

			}

			if (count == 2 || count == 4 || count == 6 || count == 8) {
				System.out.println("Enter your move : ");
				int m1 = scanner.nextInt();

				if (m1 == 00 && board[0][0] == " - ") {
					board[0][0] = " O ";

				} else if (m1 == 01 && board[0][1] == " - ") {
					board[0][1] = " O ";
				} else if (m1 == 02 && board[0][2] == " - ") {
					board[0][2] = " O ";
				} else if (m1 == 10 && board[1][0] == " - ") {
					board[1][0] = " O ";
				} else if (m1 == 11 && board[1][1] == " - ") {
					board[1][1] = " O ";
				} else if (m1 == 12 && board[1][2] == " - ") {
					board[1][2] = " O ";
				} else if (m1 == 20 && board[2][0] == " - ") {
					board[2][0] = " O ";
				} else if (m1 == 21 && board[2][1] == " - ") {
					board[2][1] = " O ";
				} else if (m1 == 22 && board[2][2] == " - ") {
					board[2][2] = " O ";

				}

				utility.printboard(board);
				count++;

			}

			if (count == 5) {
				if (!won()) {
					System.out.println("Computer has taken the move ");
					if (board[0][0] == " O " && board[0][1] == " O " && board[0][2] == " - ") {
						board[0][2] = " X ";

					} else if (board[0][0] == " O " && board[1][0] == " O " && board[2][0] == " - ") {
						board[2][0] = " X ";

					} else if (board[0][0] == " O " && board[1][1] == " O " && board[2][2] == " - ") {
						board[2][2] = " X ";

					} else if (board[0][1] == " O " && board[0][2] == " O " && board[0][0] == " - ") {
						board[0][0] = " X ";

					} else if (board[0][1] == " O " && board[1][1] == " O " && board[2][1] == " - ") {
						board[2][1] = " X ";

					} else if (board[0][2] == " O " && board[1][1] == " O " && board[2][0] == " - ") {
						board[2][0] = " X ";

					} else if (board[0][2] == " O " && board[1][2] == " O " && board[2][2] == " - ") {
						board[2][2] = " X ";

					} else if (board[1][0] == " O " && board[1][1] == " O " && board[1][2] == " - ") {
						board[1][2] = " X ";

					} else if (board[1][0] == " O " && board[2][0] == " O " && board[0][0] == " - ") {
						board[0][0] = " X ";

					} else if (board[2][0] == " O " && board[1][1] == " O " && board[0][2] == " - ") {
						board[0][2] = " X ";

					} else if (board[2][1] == " O " && board[1][1] == " O " && board[0][1] == " - ") {
						board[0][0] = " X ";

					} else if (board[2][2] == " O " && board[1][1] == " O " && board[0][0] == " - ") {
						board[0][0] = " X ";

					} else if (board[1][1] == " O " && board[1][2] == " O " && board[1][0] == " - ") {
						board[1][0] = " X ";

					} else if (board[2][2] == " O " && board[1][2] == " O " && board[0][2] == " - ") {
						board[0][2] = " X ";

					} else if (board[2][0] == " O " && board[2][1] == " O " && board[2][2] == " - ") {
						board[2][2] = " X ";

					} else if (board[2][1] == " O " && board[2][2] == " O " && board[2][0] == " - ") {
						board[2][0] = " X ";

					} else if (board[0][0] == " O " && board[0][2] == " O " && board[0][1] == " - ") {
						board[0][1] = " X ";

					} else if (board[0][0] == " O " && board[2][0] == " O " && board[1][0] == " - ") {
						board[1][0] = " X ";

					} else if (board[0][2] == " O " && board[2][2] == " O " && board[1][2] == " - ") {
						board[1][2] = " X ";

					} else if (board[2][0] == " O " && board[2][2] == " O " && board[2][1] == " - ") {
						board[2][1] = " X ";

					} else if (board[0][0] == " O " && board[2][2] == " O " && board[1][1] == " - ") {
						board[1][1] = " X ";

					} else if (board[0][2] == " O " && board[2][0] == " O " && board[1][1] == " - ") {
						board[1][1] = " X ";

					} else if (board[0][1] == " O " && board[2][1] == " O " && board[1][1] == " - ") {
						board[1][1] = " X ";

					} else if (board[1][0] == " O " && board[1][2] == " O " && board[1][1] == " - ") {
						board[1][1] = " X ";

					}
					FunctionalUtility.printboard(board);
					count++;

				} else {

					System.out.println("winner is " + win);
					break;
				}
			}

			if (count == 6 || count == 8) {
				if (!won()) {
					System.out.println("Enter your move : ");
					int m1 = scanner.nextInt();

					if (m1 == 00 && board[0][0] == " - ") {
						board[0][0] = " O ";

					} else if (m1 == 01 && board[0][1] == " - ") {
						board[0][1] = " O ";
					} else if (m1 == 02 && board[0][2] == " - ") {
						board[0][2] = " O ";
					} else if (m1 == 10 && board[1][0] == " - ") {
						board[1][0] = " O ";
					} else if (m1 == 11 && board[1][1] == " - ") {
						board[1][1] = " O ";
					} else if (m1 == 12 && board[1][2] == " - ") {
						board[1][2] = " O ";
					} else if (m1 == 20 && board[2][0] == " - ") {
						board[2][0] = " O ";
					} else if (m1 == 21 && board[2][1] == " - ") {
						board[2][1] = " O ";
					} else if (m1 == 22 && board[2][2] == " - ") {
						board[2][2] = " O ";

					}

					utility.printboard(board);
					count++;
				} else {
					System.out.println("winner is " + win);
					break;
				}
			}

			if (count == 7) {
				if(!won()) {
				if (board[0][0] == " X " && board[0][1] == " X " && board[0][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[1][0] == " X " && board[2][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[1][1] == " X " && board[2][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][1] == " X " && board[0][2] == " X " && board[0][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][1] == " X " && board[1][1] == " X " && board[2][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][2] == " X " && board[1][1] == " X " && board[2][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][2] == " X " && board[1][2] == " X " && board[2][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[1][0] == " X " && board[1][1] == " X " && board[1][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[1][0] == " X " && board[2][0] == " X " && board[0][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][0] == " X " && board[1][1] == " X " && board[0][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][1] == " X " && board[1][1] == " X " && board[0][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][2] == " X " && board[1][1] == " X " && board[0][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[1][1] == " X " && board[1][2] == " X " && board[1][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][2] == " X " && board[1][2] == " X " && board[0][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][0] == " X " && board[2][1] == " X " && board[2][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][1] == " X " && board[2][2] == " X " && board[2][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[0][2] == " X " && board[0][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[2][0] == " X " && board[1][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][2] == " X " && board[2][2] == " X " && board[1][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][0] == " X " && board[2][2] == " X " && board[2][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[2][2] == " X " && board[1][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][2] == " X " && board[2][0] == " X " && board[1][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][1] == " X " && board[2][1] == " X " && board[1][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[1][0] == " X " && board[1][2] == " X " && board[1][1] == " - ") {
					board[1][0] = " X ";

				}
				utility.printboard(board);
				count++;
				}else {
					System.out.println("winner is "+win);
				}
			}
			if (count == 6 || count == 8) {
				if (!won()) {
					System.out.println("Enter your move : ");
					int m1 = scanner.nextInt();

					if (m1 == 00 && board[0][0] == " - ") {
						board[0][0] = " O ";

					} else if (m1 == 01 && board[0][1] == " - ") {
						board[0][1] = " O ";
					} else if (m1 == 02 && board[0][2] == " - ") {
						board[0][2] = " O ";
					} else if (m1 == 10 && board[1][0] == " - ") {
						board[1][0] = " O ";
					} else if (m1 == 11 && board[1][1] == " - ") {
						board[1][1] = " O ";
					} else if (m1 == 12 && board[1][2] == " - ") {
						board[1][2] = " O ";
					} else if (m1 == 20 && board[2][0] == " - ") {
						board[2][0] = " O ";
					} else if (m1 == 21 && board[2][1] == " - ") {
						board[2][1] = " O ";
					} else if (m1 == 22 && board[2][2] == " - ") {
						board[2][2] = " O ";

					}

					utility.printboard(board);
					count++;
				} else {
					System.out.println("winner is " + win);
					break;
				}
			}
			if (count == 9) {
				if(!won()) {
				if (board[0][0] == " X " && board[0][1] == " X " && board[0][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[1][0] == " X " && board[2][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[1][1] == " X " && board[2][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][1] == " X " && board[0][2] == " X " && board[0][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][1] == " X " && board[1][1] == " X " && board[2][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][2] == " X " && board[1][1] == " X " && board[2][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][2] == " X " && board[1][2] == " X " && board[2][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[1][0] == " X " && board[1][1] == " X " && board[1][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[1][0] == " X " && board[2][0] == " X " && board[0][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][0] == " X " && board[1][1] == " X " && board[0][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][1] == " X " && board[1][1] == " X " && board[0][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][2] == " X " && board[1][1] == " X " && board[0][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[1][1] == " X " && board[1][2] == " X " && board[1][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][2] == " X " && board[1][2] == " X " && board[0][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][0] == " X " && board[2][1] == " X " && board[2][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][1] == " X " && board[2][2] == " X " && board[2][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[0][2] == " X " && board[0][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[2][0] == " X " && board[1][0] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][2] == " X " && board[2][2] == " X " && board[1][2] == " - ") {
					board[1][0] = " X ";

				} else if (board[2][0] == " X " && board[2][2] == " X " && board[2][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][0] == " X " && board[2][2] == " X " && board[1][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][2] == " X " && board[2][0] == " X " && board[1][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[0][1] == " X " && board[2][1] == " X " && board[1][1] == " - ") {
					board[1][0] = " X ";

				} else if (board[1][0] == " X " && board[1][2] == " X " && board[1][1] == " - ") {
					board[1][0] = " X ";

				}
				utility.printboard(board);
				count++;
				}else {
					System.out.println("winner is "+win);
				}
			}
			else {
				System.out.println("Its a draw ");
			}
		}
	}

	public static boolean won() {
		boolean won = false;

		if (board[0][0] == " O " && board[0][1] == " O " && board[0][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][0] == " O " && board[1][0] == " O " && board[2][0] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][0] == " O " && board[1][1] == " O " && board[2][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][1] == " O " && board[0][2] == " O " && board[0][0] == " O ") {
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
		} else if (board[1][0] == " O " && board[2][0] == " O " && board[0][0] == " O ") {
			won = true;
			win = " O ";
		} else if (board[2][0] == " O " && board[1][1] == " O " && board[0][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[2][1] == " O " && board[1][1] == " O " && board[0][1] == " O ") {
			won = true;
			win = " O ";
		} else if (board[2][2] == " O " && board[1][1] == " O " && board[0][0] == " O ") {
			won = true;
			win = " O ";
		} else if (board[1][1] == " O " && board[1][2] == " O " && board[1][0] == " O ") {
			won = true;
			win = " O ";
		} else if (board[2][2] == " O " && board[1][2] == " O " && board[0][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[2][0] == " O " && board[2][1] == " O " && board[2][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[2][1] == " O " && board[2][2] == " O " && board[2][0] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][0] == " O " && board[0][2] == " O " && board[0][1] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][0] == " O " && board[2][0] == " O " && board[1][0] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][2] == " O " && board[2][2] == " O " && board[1][2] == " O ") {
			won = true;
			win = " O ";
		} else if (board[2][0] == " O " && board[2][2] == " O " && board[2][1] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][0] == " O " && board[2][2] == " O " && board[1][1] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][2] == " O " && board[2][0] == " O " && board[1][1] == " O ") {
			won = true;
			win = " O ";
		} else if (board[0][1] == " O " && board[2][1] == " O " && board[1][1] == " O ") {
			won = true;
			win = " O ";
		} else if (board[1][0] == " O " && board[1][2] == " O " && board[1][1] == " O ") {
			won = true;
			win = " O ";
		}

		if (board[0][0] == " X " && board[0][1] == " X " && board[0][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][0] == " X " && board[1][0] == " X " && board[2][0] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][0] == " X " && board[1][1] == " X " && board[2][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][1] == " X " && board[0][2] == " X " && board[0][0] == " X ") {
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
		} else if (board[1][0] == " X " && board[2][0] == " X " && board[0][0] == " X ") {
			won = true;
			win = " X ";
		} else if (board[2][0] == " X " && board[1][1] == " X " && board[0][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[2][1] == " X " && board[1][1] == " X " && board[0][1] == " X ") {
			won = true;
			win = " X ";
		} else if (board[2][2] == " X " && board[1][1] == " X " && board[0][0] == " X ") {
			won = true;
			win = " X ";
		} else if (board[1][1] == " X " && board[1][2] == " X " && board[1][0] == " X ") {
			won = true;
			win = " X ";
		} else if (board[2][2] == " X " && board[1][2] == " X " && board[0][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[2][0] == " X " && board[2][1] == " X " && board[2][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[2][1] == " X " && board[2][2] == " X " && board[2][0] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][0] == " X " && board[0][2] == " X " && board[0][1] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][0] == " X " && board[2][0] == " X " && board[1][0] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][2] == " X " && board[2][2] == " X " && board[1][2] == " X ") {
			won = true;
			win = " X ";
		} else if (board[2][0] == " X " && board[2][2] == " X " && board[2][1] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][0] == " X " && board[2][2] == " X " && board[1][1] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][2] == " X " && board[2][0] == " X " && board[1][1] == " X ") {
			won = true;
			win = " X ";
		} else if (board[0][1] == " X " && board[2][1] == " X " && board[1][1] == " X ") {
			won = true;
			win = " X ";
		} else if (board[1][0] == " X " && board[1][2] == " X " && board[1][1] == " X ") {
			won = true;
			win = " X ";
		}
		return won;
	}
}
