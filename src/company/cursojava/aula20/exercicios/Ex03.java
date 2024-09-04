package company.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Create a matrix 3x3 fill out that with numbers captured from the keyboard.
		// Show the matrix and inform the quantity of odd and even numbers.
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		int even = 0, odd = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Insert an integer for the position ["+i+"] ["+j+"]: ");
				matrix[i][j] = scan.nextInt();
				if (matrix[i][j] % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
		}
		scan.close();
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + matrix[i][j] + "] ");
			}
			System.out.print("|\n");
		}
		System.out.println("\nEven: " + even + "\nOdd: " + odd);

	}

}