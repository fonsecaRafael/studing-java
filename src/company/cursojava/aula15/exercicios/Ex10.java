package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Solicite o turno e imprima um bom turno
		Scanner scan = new Scanner(System.in);
		System.out.println("Em que turno estamos? (m/v/n)");
		char turn = scan.next().charAt(0);
		scan.close();
		
		switch (turn) {
		case 'm': System.out.println("Bom dia!"); break;
		case 'v': System.out.println("Boa tarde!"); break;
		case 'n': System.out.println("Boa noite!"); break;
		default: System.out.println("Turno inválido!");
		}
	}
}
