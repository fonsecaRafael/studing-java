package company.cursojava.aula27.exercicios;

public class TestTicTacToe {
	TicTacToe game = new TicTacToe();
	
	public boolean testWin(String expectedWinner, int[][] movesPlayer1, int[][] movesPlayer2) {
		// test if a player can win a game.
		resetBoard(game.board);
		for(int move = 0; move < movesPlayer1.length; move++) {
			game.setMove(game.PLAYER1, movesPlayer1[move], game.board);
		}
		for(int move = 0; move < movesPlayer2.length; move++) {
			game.setMove(game.PLAYER2, movesPlayer2[move], game.board);
		}
		int expectedWinnerInt = Character.getNumericValue(expectedWinner.charAt(expectedWinner.length() - 1));
		return game.checkEnd(game.board) == expectedWinnerInt;
	}
	public boolean testTieMatch(boolean expected, int[][] movesPlayer1, int[][] movesPlayer2) {
		/**
		 * Returns true if the match end in a tie, and false if not.<p>
		 * The arguments must specify line and column of player's move, at total 9 moves should be provided,
		 * always 5 moves for player 1 and the rest for player 2.<p>
		 * If you fail in provide the right amount of moves or in fill all the board,
		 *  it will raise a RuntimeException.<p>
		 * 
		 * @param boolean that represents your expectation about is it a tie or not.
		 * @param movesPlayer1 lines and columns of player's 1 moves.
		 * @param movesPlayer2 lines and columns of player's 2 moves.
		 * @return a boolean that it is true if there are no winners.
		 */
		if(movesPlayer1.length != 5 || movesPlayer2.length != 4) {
			throw new RuntimeException("You must insert 5 moves for player 1 and 4 moves for player 2.");
		}
		resetBoard(game.board);
		for(int move = 0; move < movesPlayer1.length; move++) {
			game.setMove(game.PLAYER1, movesPlayer1[move], game.board);
		}
		for(int move = 0; move < movesPlayer2.length; move++) {
			game.setMove(game.PLAYER2, movesPlayer2[move], game.board);
		}
		for (int line = 0; line < game.board.length; line++) {
			for (int column = 0; column < game.board[line].length; column++) {
				if (game.board[line][column] == 0) {
					String msg = "You didn't fill all the board line: " + line + " column: " + column + " = 0";
					throw new RuntimeException(msg);
				}
			}
		}
		return expected == (game.checkEnd(game.board) == 0);
	}
	public boolean testSetMove(boolean expected, String player, int[] move) {
		// test if a valid move is inserted in the board
		resetBoard(game.board);
		game.setMove(player, move, game.board);
		boolean playerSet = game.board[move[0]][move[1]] != 0;
		return expected == playerSet;
	}
	public boolean testCheckPlay(boolean expected, int[] move) {
		// test if a move is correctly categorized as valid or invalid
		resetBoard(game.board);
		return expected == game.checkPlay(move, game.board);
		
	}
	public boolean testCheckPlay(boolean expected, int[] move, int[][] board) {
		// test if a move is correctly categorized as valid or invalid
		game.board = board;
		return expected == game.checkPlay(move, board);
	}
	
	private void resetBoard(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		TestTicTacToe tester = new TestTicTacToe();

		// Test if a valid move is accepted
		if (tester.testCheckPlay(true, new int[] {1,2})) {
			System.out.println("Test 1: Passing");
		} else {
			System.out.println("Test 1: Failing");
		}

		// Test if an invalid move isn't accepted
		if (tester.testCheckPlay(false, new int[] {6,6})) {
			System.out.println("Test 2: Passing");
		} else {
			System.out.println("Test 2: Failing");
		}
		
		// Test if a valid move isn't accepted when the spot at the board is occupied
		if (tester.testCheckPlay(false, new int[] {1,2}, new int[][] {{0,0,0},{0,0,1},{0,0,0}})) {
			System.out.println("Test 3: Passing");
		} else {
			System.out.println("Test 3: Failing");
		}
		

		// Test if a valid move is set
		if (tester.testSetMove(true, tester.game.PLAYER1, new int[] {1,2})) {
			System.out.println("Test 4: Passing");
		} else {
			System.out.println("Test 4: Failing");
		}
		
		// Test if a match can end without a winner
		int [][] movesPlayer1 = {{1,1},{0,2},{2,1},{1,0},{0,0}};
		int [][] movesPlayer2 = {{2,2},{2,0},{0,1},{1,2}};
		if (tester.testTieMatch(true, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 5: Passing");
		} else {
			System.out.println("Test 5: Failing");
		}
		
		// Test win at first horizontal line player 1
		movesPlayer1 = new int [][] {{0,0}, {0,1}, {2,2}, {0,2}};
		movesPlayer2 = new int [][] {{1,0}, {1,1}, {2,1}};
		if (tester.testWin(tester.game.PLAYER1, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 6: Passing");
		} else {
			System.out.println("Test 6: Failing");
		}
		
		// Test win at first horizontal line player 2
		int [][] aux = movesPlayer2;
		movesPlayer2 = movesPlayer1;
		movesPlayer1 = aux;
		if (tester.testWin(tester.game.PLAYER2, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 14: Passing");
		} else {
			System.out.println("Test 14: Failing");
		}
		
		// Test win at second horizontal line player 1
		movesPlayer1 = new int [][] {{1,0}, {1,1}, {2,2}, {1,2}};
		movesPlayer2 = new int [][] {{0,0}, {0,1}, {2,1}};
		if (tester.testWin(tester.game.PLAYER1, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 7: Passing");
		} else {
			System.out.println("Test 7: Failing");
		}		
		// Test win at second horizontal line player 2
		aux = movesPlayer2;
		movesPlayer2 = movesPlayer1;
		movesPlayer1 = aux;
		if (tester.testWin(tester.game.PLAYER2, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 15: Passing");
		} else {
			System.out.println("Test 15: Failing");
		}
		
		// Test win at third horizontal line player 1
		movesPlayer1 = new int [][] {{2,0}, {2,1}, {0,0}, {2,2}};
		movesPlayer2 = new int [][] {{0,2}, {0,1}, {1,1}};
		if (tester.testWin(tester.game.PLAYER1, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 8: Passing");
		} else {
			System.out.println("Test 8: Failing");
		}
		// Test win at third horizontal line player 2
		aux = movesPlayer2;
		movesPlayer2 = movesPlayer1;
		movesPlayer1 = aux;
		if (tester.testWin(tester.game.PLAYER2, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 16: Passing");
		} else {
			System.out.println("Test 16: Failing");
		}
		
		// Test win at first vertical line player 1
		movesPlayer1 = new int [][] {{0,0}, {1,0}, {1,1}, {2,0}};
		movesPlayer2 = new int [][] {{0,1}, {2,1}, {2,2}};
		if (tester.testWin(tester.game.PLAYER1, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 9: Passing");
		} else {
			System.out.println("Test 9: Failing");
		}
		// Test win at first vertical line player 2
		aux = movesPlayer2;
		movesPlayer2 = movesPlayer1;
		movesPlayer1 = aux;
		if (tester.testWin(tester.game.PLAYER2, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 17: Passing");
		} else {
			System.out.println("Test 17: Failing");
		}
		
		// Test win at second vertical line player 1
		movesPlayer1 = new int [][] {{0,1}, {1,1}, {0,0}, {2,1}};
		movesPlayer2 = new int [][] {{0,2}, {2,0}, {2,2}};
		if (tester.testWin(tester.game.PLAYER1, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 10: Passing");
		} else {
			System.out.println("Test 10: Failing");
		}
		// Test win at second vertical line player 2
		aux = movesPlayer2;
		movesPlayer2 = movesPlayer1;
		movesPlayer1 = aux;
		if (tester.testWin(tester.game.PLAYER2, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 18: Passing");
		} else {
			System.out.println("Test 18: Failing");
		}
		
		// Test win at third vertical line player 1
		movesPlayer1 = new int [][] {{0,2}, {1,2}, {1,1}, {2,2}};
		movesPlayer2 = new int [][] {{0,0}, {2,1}, {2,0}};
		if (tester.testWin(tester.game.PLAYER1, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 11: Passing");
		} else {
			System.out.println("Test 11: Failing");
		}
		// Test win at third vertical line player 2
		aux = movesPlayer2;
		movesPlayer2 = movesPlayer1;
		movesPlayer1 = aux;
		if (tester.testWin(tester.game.PLAYER2, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 19: Passing");
		} else {
			System.out.println("Test 19: Failing");
		}
		
		// Test first diagonal win player 1
		movesPlayer1 = new int [][] {{0,0}, {1,0}, {1,1}, {2,2}};
		movesPlayer2 = new int [][] {{0,1}, {2,1}, {0,2}};
		if (tester.testWin(tester.game.PLAYER1, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 12: Passing");
		} else {
			System.out.println("Test 12: Failing");
		}
		// Test first diagonal win player 2
		aux = movesPlayer2;
		movesPlayer2 = movesPlayer1;
		movesPlayer1 = aux;
		if (tester.testWin(tester.game.PLAYER2, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 20: Passing");
		} else {
			System.out.println("Test 20: Failing");
		}
		
		// Test second diagonal win player 1
		movesPlayer1 = new int [][] {{0,2}, {1,0}, {1,1}, {2,0}};
		movesPlayer2 = new int [][] {{0,1}, {2,1}, {2,2}};
		if (tester.testWin(tester.game.PLAYER1, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 13: Passing");
		} else {
			System.out.println("Test 13: Failing");
		}
		// Test second diagonal win player 2
		aux = movesPlayer2;
		movesPlayer2 = movesPlayer1;
		movesPlayer1 = aux;
		if (tester.testWin(tester.game.PLAYER2, movesPlayer1, movesPlayer2)) {
			System.out.println("Test 21: Passing");
		} else {
			System.out.println("Test 21: Failing");
		}
	}
}