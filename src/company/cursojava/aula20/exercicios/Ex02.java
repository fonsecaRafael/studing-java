package company.cursojava.aula20.exercicios;

public class Ex02 {

	public static void main(String[] args) {
		// Create a matrix 10x10 with random values from 0-9, then find out biggest and lowest numbers 
		// from line 5 and column 7
		int[][] matrix = new int[10][10];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)Math.floor(Math.random()*9);
			}
		}
		
		int LINE = 5, biggest = -1, lowest = 10;
		for (int j = 0; j < matrix[LINE].length; j++) {
			if (biggest < matrix[LINE][j]) {
				biggest = matrix[LINE][j];
			}
			if (lowest > matrix[LINE][j]) {
				lowest = matrix[LINE][j];
			}
		}
		System.out.println("Line 5:\nBiggest: " + biggest + "\nLowest: " + lowest + "\n");
		
		int COLUMN = 7;
		biggest = -1; lowest = 10;
		for (int i = 0; i < matrix.length; i++) {
			if (biggest < matrix[i][COLUMN]) {
				biggest = matrix[i][COLUMN];
			}
			if (lowest > matrix[i][COLUMN]) {
				lowest = matrix[i][COLUMN];
			}
		}
		System.out.println("Line 7:\nBiggest: " + biggest + "\nLowest: " + lowest);
	}
}