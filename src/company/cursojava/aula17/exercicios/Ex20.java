package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// Ask for positive integers less than 16, return its factorial, 
		// the operation must be capable of being repeated indefinitely. 
		
		Scanner scan = new Scanner(System.in);
		int number, factorial = 1;

		boolean proceed = true;
		while(proceed) {
			while(true) {
				System.out.print("Insert a positive interger less than 16: ");
				number = scan.nextInt();
				if (number > 0 && number < 16) {
					break;
				}
			}
			for (int i = number; i > 0 ; i--) {
				factorial *= i;
			}
			System.out.println("Factorial of " + number + ": " + factorial);
			factorial = 1;
			
			System.out.println("Do you want to continue? (s/n)");
			if(scan.next().equalsIgnoreCase("n")) {
				scan.close();
				proceed = false;
			}
		}
	}
}