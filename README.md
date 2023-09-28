# Tic Tac Toe Game
![GitHub contributors](https://img.shields.io/github/contributors/melanylleon/Tic-Tac-Toe-Game)
![GitHub commit activity (branch)](https://img.shields.io/github/commit-activity/t/melanylleon/Tic-Tac-Toe-Game)
![GitHub issues](https://img.shields.io/github/issues/melanylleon/Tic-Tac-Toe-Game)
![GitHub](https://img.shields.io/github/license/melanylleon/Tic-Tac-Toe-Game)
[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-2.1-4baaaa.svg)](CODE_OF_CONDUCT.md)

##  :star2: About the Project
This project is an implementation of the Tic Tac Toe game. Two players pick a position on the game board until either one picks three positions either in a diagonal, vertical, or horizontal row. The first player to pick 3 positions in a row wins the game.

### :space_invader: Tech Stack
- Java

### :dart: Features
- Displays the game board and 3 more boards with possible ways to win the game
- Starts to check who won the game after the 5th turn because it is only possible for a player to win the game after that turn

## :running: Run Locally
Clone the project

``` 
git clone https://github.com/melanylleon/Tic-Tac-Toe-Game.git
```
Run on IDE

## :eyes: Usage
This is a program that implements the tic tac toe game. The game board is a 3x3 grid and there are two players, player X, and player O. The program displays the game board and the 8 different ways a player can win the game. It then allows a player to pick a position on the board. From the 5th turn to the 9th turn, it checks if the player playing for that turn won the game. It checks that the player picked 3 positions in a vertical, horizontal, or diagonal row. If after the 9th turn neither player wins the game, it is declared a tie. 

**Checks if a player won in a vertical, horizontal, or diagonal row. If a player wins or there is a tie, the game ends.**
```java
public int checkWinStatus(char player, int turnNumber) {
		
    int j = 0;
		boolean win = false;
		
		for (int i = 0; i < gameBoard[0].length; i++) {
			if (gameBoard[i][j] == player && gameBoard[i][j + 1] == player && gameBoard[i][j + 2] == player) {
				win = true;
				i = gameBoard[i].length;
			} else if (gameBoard[j][i] == player && gameBoard[j + 1][i] == player && gameBoard[j + 2][i] == player) {
				win = true;
				i = gameBoard[i].length;
			} 				
		}
		
		if (win) {
			return 10;
		
		} else if (gameBoard[j][j] == player && gameBoard[j + 1][j + 1] == player && gameBoard[j + 2][j + 2] == player) {
			return 10;
		
		} else if (gameBoard[j + 2][j] == player && gameBoard[j + 1][j + 1] == player && gameBoard[j][j + 2] == player) {
			return 10;
	
		} else {
			return turnNumber;
		}
	}

```

</br>

**Allows the player to choose a position and then compares the positions chosen by each player to declare the winner.**
```java
public static void playerTurns(char player) {
		System.out.println("Player " + player +", pick the position on the board: ");
		positionOnBoard = s.nextInt();
		gameBoard.initialize(player, positionOnBoard);

		if (i >= 4) {
			i = gameBoard.checkWinStatus(player, i);
			if (i == 10) {
				System.out.println("Player " + player + " is the winner!");
			}
		}
		i++;
	}
```


## :compass: Roadmap

* [ ] Check that a player does not pick a position that was already chosen by another player. Display a message saying that the position was already chosen.
 * [ ] On every turn, display the X’s and O’s on the game board to show the players what positions have already been chosen. 

## :wave: Contributing
Please feel free to contribute to the project!  

Please see the `CONTRIBUTING.md` file for more information.

## :warning: License
Please see the `LICENSE.txt` file for more information.

# :handshake: Contact

Melany Landaverde Leon - melany.leon0199@gmail.com

Project Link: [https://github.com/melanylleon/Tic-Tac-Toe-Game.git](https://github.com/melanylleon/Tic-Tac-Toe-Game.git)

