package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		// Leia 3 nums mostre o maior
		Scanner scan = new Scanner(System.in);
		int aux;
		System.out.println("Informe o 1° número: ");
		int bigger = scan.nextInt();
		
		System.out.println("Informe o 2° número: ");
		aux = scan.nextInt();
		if (aux > bigger) {
			bigger = aux;
		}
		
		System.out.println("Informe o 3° número: ");
		aux = scan.nextInt();
		if (aux > bigger) {
			bigger = aux;
		}
		
		System.out.println("O maior é: " + bigger);
		scan.close();
	}

}
