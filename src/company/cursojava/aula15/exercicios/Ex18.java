package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// Leia dd/mm/aaaa e determine se ela é válida.
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe uma data: ");
		
		String date = scan.next();
		int day = Integer.parseInt(date.substring(0, 2));
		int month = Integer.parseInt(date.substring(3, 5));
		int year = Integer.parseInt(date.substring(6));
		
		if (day > 0 && day < 32) {
			if (month > 0 && month < 13) {
				System.out.println("Data válida.");
				System.exit(0);
			}
		}
		System.out.println("Data inválida");
		scan.close();
	}
}
