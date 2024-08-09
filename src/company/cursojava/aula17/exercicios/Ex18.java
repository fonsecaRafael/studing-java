package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// Ask for N numbers, and return the biggest, the smallest and the sum of all numbers
		int biggest, smallest, sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want to insert? ");
		int numbers = scan.nextInt();
		
		System.out.print("Please, insert a number: ");
		biggest = smallest = sum = scan.nextInt();
		for (int i = 1; i < numbers; i++) {
			System.out.print("Please, insert a number: ");
			int aux = scan.nextInt();
			biggest = biggest > aux ? biggest : aux;
			smallest = smallest < aux ? smallest : aux;
			sum += aux;
		}
		scan.close();
		System.out.println("\nThe biggest: " + biggest + "\nThe smallest: " + smallest + "\nSum: " + sum);
	}
}
