package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// Ask 10 numbers, show quantity of even and odd numbers
		int odd = 0, even = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Insert an integer number: ");
			if (scan.nextInt() % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		scan.close();
		System.out.println("\nOdd: " + odd + "\nEven: " + even);
	}
}
