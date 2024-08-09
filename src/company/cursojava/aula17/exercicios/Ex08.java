package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// Read 5 numbers, show the sum and media.
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		for(int count = 0; count < 5; count++) {
			System.out.println("Insert a number: ");
			sum += scan.nextDouble();
		}
		scan.close();
		System.out.println("Sum: " + sum + "\nAverage number: " + sum / 5);

	}

}
