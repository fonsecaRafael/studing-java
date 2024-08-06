package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// Leia 3 números, os apresente em ordem decrescente
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, big, medium, small;
		
		System.out.println("Informe os 3 números:");
		n1 = scan.nextDouble(); n2 = scan.nextDouble(); n3 = scan.nextDouble();
		
		if (n1 > n2) {
			big = n1;
			small = n2;
		}else {
			big = n2;
			small = n1;
		}
		
		if (big < n3) {
			medium = big;
			big = n3;
		} else if (n3 > small) {
			medium = n3;
		}else {
			medium = small;
			small = n3;
		}
		
		System.out.println(String.format("Ordem decrescente: %f %f %f", big, medium, small));
		scan.close();
	}
}
