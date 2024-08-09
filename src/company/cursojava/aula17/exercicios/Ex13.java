package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// Ask two numbers, calc n1**n2, without the language power function.
		Scanner scan = new Scanner(System.in);
		System.out.println("Inform the base number: ");
		int base = scan.nextInt();
		int result = base;
		System.out.println("Inform the exponent: ");
		int exponent = scan.nextInt();
		scan.close();
		
		if (exponent == 0) {
			System.out.print("\nThe result is: 1");
			System.exit(0);
		}
		for(int i = 1; i < exponent ; i++) {
			result *= base;   
		}
		System.out.print("The result is: " + result + "\n\n");
	}

}
