package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// Ask a n-term, show Fibonacci sequence until the n-term.
		Scanner scan = new Scanner(System.in);
		System.out.print("Do you want to see Fibonacci sequence until which term? ");
		int term = scan.nextInt();
		scan.close();
		
		if (term == 1) {
			System.out.println("0");
		} else if (term == 2) {
			System.out.println("0, 1");
		} else if (term < 1) {
			System.out.println("The term must be positive.\n Closing the application...");
			System.exit(1);
		} else {
			int termMinus2 = 0;
			int termMinus1 = 1;
			int fibonacci;
			
			System.out.print("0, 1, ");			
			for (int i = 2; i < term; i++) {
				fibonacci = termMinus2 + termMinus1;
				System.out.print( fibonacci + ", ");
				termMinus2 = termMinus1;
				termMinus1 = fibonacci;
			}			
		}


	}

}
