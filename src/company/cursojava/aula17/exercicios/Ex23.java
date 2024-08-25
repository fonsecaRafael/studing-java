package company.cursojava.aula17.exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// Ask a number, show all prime numbers between 1 and N, show the amount of divisions done to find the answer
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert a number bigger than 0: ");
		int number = scan.nextInt();
		scan.close();
		
		int divisions = 1;
		for (int i = 1; i < number+1; i++) {
			boolean divisor = number % i == 0; 
			divisions++;
			if (divisor) {
				System.out.println("The number: " + number + " can be divided by: " + i);
			}
		}
		System.out.println("It took " + divisions + " divisions to solve.");
	}

}
