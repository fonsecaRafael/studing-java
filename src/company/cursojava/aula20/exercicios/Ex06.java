package company.cursojava.aula20.exercicios;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// Tic tac toe, should block invalid plays, it should inform when game reach an end and who is the
		// winner, each play should renew the console output with the new board.
		Scanner scan = new Scanner(System.in);
		int[][] board = new int[3][3];
		int moves = 0;
		final String PLAYER1 = "Player 1", PLAYER2 = "Player 2";
		
		int[] move = new int[2];
		while(true) {
			move = askMove(PLAYER1, board, scan);
			setMove(PLAYER1, move, board);
			showBoard(board);
			if(checkEnd(board)) {
				break;
			}
			moves++;
			if (moves == 9) {
				System.out.println("The game ended in a tie");
				break;
			}
			move = askMove(PLAYER2, board, scan);
			setMove(PLAYER2, move, board);
			showBoard(board);
			if(checkEnd(board)) {
				break;
			}
			moves++;
		}
		scan.close();
	}

	public static int[] askMove(String player, int[][] board, Scanner scan){
		int[] result = new int [2];
		while(true) {
			System.out.print(player + " insert your desired position\nLine: ");
			result[0] = scan.nextInt() - 1;
			System.out.print("Column: ");
			result[1] = scan.nextInt() - 1;
			if(checkPlay(result, board)) {
				return result;
			}
			System.out.print("Invalid move!\n");
			showBoard(board);
		}		
	}
	
	public static void setMove(String player, int[] position, int[][]board) {
		board[position[0]] [position[1]] = Character.getNumericValue(player.charAt(player.length() - 1));
	}
	
	public static boolean checkPlay(int[] position, int[][] board) {
		if (position[0] < 0 || position[1] < 0 || position[0] > 2 || position[1] > 2
				|| board[position[0]] [position[1]] != 0) {
			return false;
		}
		return true;
	}
	
	public static void showBoard(int[][] board){
		for (int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
//				System.out.print(board[i][j] + " ");
				if(board[i][j] == 1) {
					System.out.print("X ");
				}else if (board[i][j] == 2) {
					System.out.print("O ");
				}else {
					System.out.print("- ");
				}
			}
			System.out.println("");
		}
	}
	
	public static boolean checkEnd(int[][] board){
		// This only will work in a quadratic matrix
		int counterFinish;
		for (int i = 0; i < board.length; i++) {
			int aux = board[i][i];
			if (aux == 0) {
				continue;
			}
			counterFinish = 0;
			for (int j = 0; j < board[i].length; j++) {
				if(aux == board[i][j]) {
					counterFinish++;
				}
				if(counterFinish == 3) {
					showWinner(aux);
					return true;
				}
			}
			counterFinish = 0;
			for (int j = 0; j < board[i].length; j++) {
				if(aux != board[j][i]) {
					counterFinish++;
				}
				if(counterFinish == 3) {
					showWinner(aux);
					return true;
				}
			}
			if((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != 0) 
					||(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != 0)) {
				showWinner(board[1][1]);
				return true;
			}
		}
		return false;
	}

	public static void showWinner(int winner) {
		System.out.println("The winner is Player " + winner);
	}

}