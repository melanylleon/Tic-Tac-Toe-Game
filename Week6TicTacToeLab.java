
package week6;

import java.util.Scanner;

public class Week6TicTacToeLab {
	
		static Scanner s = new Scanner(System.in);
	
		//Creates an object of the GameBoard class
		static GameBoard gameBoard = new GameBoard();
		
		static int i = 0;
		static int positionOnBoard = 0;

		public static void main(String[] args) {
			//Displays the game board with the numbers indicating the position on the board, the instructions on how to win the game and 
			//3 more game boards with the patterns needed to win the game
			gameBoard.display();
			System.out.println();
			
			char player;
				
			//Loops 10 times to represent the 9 turns in the game and once more to print that it's a draw if none of the players wins the game	
			while (i <= 9) {
				//If the players pick all of the positions on the board and neither gets one of the 8 patterns needed to win, it's a draw 
				if (i == 9) {
					System.out.println("It's a Draw.");
					i++;
				//Player X's turns
				} else if (i % 2 == 0) {
					player = 'X';
					playerTurns(player);
				//Player O's turns
				} else {
						player = 'O';
						playerTurns(player);
				} 	
			}
		}
	
	public static void playerTurns(char player) {
		System.out.println("Player " + player +", pick the position on the board: ");
		positionOnBoard = s.nextInt();
		//Initializes the gameBoard array with the letter of the player at the position chosen by the player
		gameBoard.initialize(player, positionOnBoard);
		//Starting at turn 5, it checks if the player playing on their turn is the winner. This is done by checking if the player got one of the 8 patterns.
		if (i >= 4) {
			i = gameBoard.checkWinStatus(player, i);
			if (i == 10) {
				System.out.println("Player " + player + " is the winner!");
			}
		}
		i++;
	}
}
