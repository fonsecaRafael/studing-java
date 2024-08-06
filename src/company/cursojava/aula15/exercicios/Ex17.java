package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// Leia um ano e diga se é bissexto ou não.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o ano: ");
		int year = scan.nextInt();
		scan.close();
		boolean bissexto = false;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					bissexto = true;
				}
			}else {
				bissexto = true;
			}
		}
		
		if (bissexto) {
			System.out.println("O ano é bissexto.");
		} else {
			System.out.println("O ano não é bissexto.");
		}
	}
}
