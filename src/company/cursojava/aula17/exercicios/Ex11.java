package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// Ask two numbers, show the sum of all integers between them.
		
		Scanner scan = new Scanner(System.in);
		int n1, n2, sum = 0;
		
		System.out.print("Insert the first number: ");
		n1 = scan.nextInt();
		System.out.print("Insert the second number: ");
		n2 = scan.nextInt();
		scan.close();
		
		if(n1 > n2) {
			for(int i = n1 - 1; i > n2; i--) {
				sum += i;
			}
		}else if (n1 < n2) {
			for(int i = n1 + 1; i < n2; i++) {
				sum += i;
			}
		}else {
			System.out.println("\nThe numbers must to be different.\nClosing the application...");
			System.exit(1);
		}
		System.out.println("\nThe sum is: " + sum);
	}

}
