package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// Ask a number, if it's not a prime number, inform and show by which numbers it can be divided
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert a positive number: ");
		int number = scan.nextInt();
		scan.close();
		
		int divisors = 0;
		for(int counter = 2; counter < number/2 + 1; counter++) {
			if(number % counter == 0) {
				divisors++;
				System.out.println("The number " + number + " isn't prime, it can be divided by " + counter);
			}
		}
		if (number < 2) {
			System.out.println("The " + number + " isn't prime.");
			System.exit(0);
		}
		if(divisors == 0) {
			System.out.println("The " + number + " is prime.");
			System.exit(0);
		}
	}
}