package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//Leia três números, exiba o maior e o menor
		Scanner scan = new Scanner(System.in);
		double smaller, bigger;
		
		System.out.println("Informe 3 números: ");
		double n1 = scan.nextDouble(), n2 = scan.nextDouble(), n3 = scan.nextDouble();
		
		smaller = bigger = n1;
		
		if (n2 > bigger) {
			bigger = n2;
		}else {
			smaller = n2;
		}
		
		if (n3 > bigger) {
			bigger = n3;
		}
		if (n3 < smaller) {
			smaller = n3;
		}
		
		System.out.println("Maior: " + bigger + "\rMenor: " + smaller);
		scan.close();
	}
}
