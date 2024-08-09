package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// Read five numbers, show the biggest.
		Scanner scan = new Scanner(System.in);
		int aux;
		
		System.out.print("Insert a number: ");
		int biggest = scan.nextInt();
		
		for(int i = 0; i < 4; i++) {
			System.out.print("Insert a number: ");
			aux = scan.nextInt();
			biggest = biggest > aux ? biggest : aux;
		}
		scan.close();
		System.out.println("The biggest number is: " + biggest);
	}
}
