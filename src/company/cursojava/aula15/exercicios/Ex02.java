package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Peça um valor, informe se é positivo ou negativo
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		double num = scan.nextDouble();
		scan.close();
		
		if(num > 0) {
			System.out.println("Positivo");
		}else if(num < 0) {
			System.out.println("Negativo");
		}
	}
}
