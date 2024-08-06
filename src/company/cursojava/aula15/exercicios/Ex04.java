package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Colete uma letra, informe se é vogal ou consoante
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma letra: ");
		char letra = scan.next().charAt(0);
		scan.close();
		
		switch (letra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Vogal"); break;
		default:
			System.out.println("Consoante");break;
		}
		
	}
}
