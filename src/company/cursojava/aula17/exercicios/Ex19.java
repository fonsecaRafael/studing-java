package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// Ask for N numbers between 0 - 1000, return the biggest, the smallest and the sum of all of the numbers
		int biggest, smallest, sum;
		boolean invalid;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want to insert? ");
		int numbers = scan.nextInt();
		
		while(true) {
			System.out.print("Please, insert a number between 0 - 1000: ");
			biggest = smallest = sum = scan.nextInt();
			if (sum > -1 && sum < 1001) {
				break;
			}
		}
		
		for (int i = 1; i < numbers; i++) {
			int aux;
			invalid = true;
			while(invalid) {
				System.out.print("Please, insert a number between 0 - 1000: ");
				aux = scan.nextInt(); 
				if (aux > 0 && aux < 1000) {
					invalid = false;
					biggest = biggest > aux ? biggest : aux;
					smallest = smallest < aux ? smallest : aux;
					sum += aux;
				}
			}
		}
		scan.close();
		System.out.println("\nThe biggest: " + biggest + "\nThe smallest: " + smallest + "\nSum: " + sum);	}
}