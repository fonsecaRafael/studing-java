package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// Ask a number, return if it's Prime number
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert an integer number: ");
		int number = scan.nextInt();
		scan.close();
		
		if((number % 2 == 0 && number != 2) || (number > -2 && number < 2)) {
			System.out.println("The number " + number + " isn't prime.");
			System.exit(0);
		} else if (number == 2 || number == -2) {
			System.out.println("The number " + number + " is prime.");
			System.exit(0);
		}
		
		for(int i = 2; i <= number/3.0; i++) {
			if (number % i == 0){
				System.out.println("The number " + number + " isn't prime.");
				System.exit(0);
			}
		}
		System.out.println("The number " + number + " is prime.");
	}
}