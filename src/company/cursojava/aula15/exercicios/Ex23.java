package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// Ask for a number, inform if it is a real or integer
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number:\t");
		double number = scan.nextDouble();
		scan.close();
		
		if (number == (int) Math.floor(number) && number == (int) Math.ceil(number)) {
			System.out.println("This number is an Integer.");
		} else {
			System.out.println("The number is decimal.");
		}
	}
}
