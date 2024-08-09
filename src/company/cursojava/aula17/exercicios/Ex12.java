package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// Ask a number between 1 and 10, show the multiplication table
		// Multiplication table of i:
		// i x 2 = 2i
		
		Scanner scan =  new Scanner(System.in);
		int number = 0;
		while (number < 1 || number > 10) {
			System.out.print("Choose a number from 1 to 10: ");
			number = scan.nextInt();			
		}
		scan.close();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " x " + number + " = " + i * number);
		}
	}

}
