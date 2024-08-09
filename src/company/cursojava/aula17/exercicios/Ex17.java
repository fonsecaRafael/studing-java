package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// Ask a number, return its factorial
		int number, factorial = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insert a number: ");
		number = scan.nextInt();
		scan.close();
		
		if (number != 0) {
			for (int i = number; i > 0; i--) {
				factorial *= i;
			}
		}
		System.out.print("The factorial is: " + factorial);
	}
}
