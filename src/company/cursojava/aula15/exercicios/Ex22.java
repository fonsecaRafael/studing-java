package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// Ask for an Integer and say it is odd or even
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert an integer:\t");
		int number = scan.nextInt();
		scan.close();
		
		if (number % 2 == 0) {
			System.out.println("This number is even.");
			System.exit(0);
		}
		System.out.println("This number is odd.");
		
	}
}
