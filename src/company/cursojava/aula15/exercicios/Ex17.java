package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// Leia um ano e diga se é bissexto ou não.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o ano: ");
		int year = scan.nextInt();
		scan.close();
		
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("O ano é bissexto.");
			System.exit(0);
		}
		System.out.println("O ano não é bissexto.");
	}
}
