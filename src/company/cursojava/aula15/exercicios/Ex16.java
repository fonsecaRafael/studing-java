package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// Leia a, b, c de ax² + bx + c e calcule as raízes
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os valores de A, B, C para uma equação de segundo grau:");
		System.out.print("Informe o valor de A: ");
		double a = scan.nextDouble();
		if (a == 0) {
			System.out.println("Como A é zero, a equação não é de segundo grau... Encerrando o programa.");
			System.exit(0);
		}
		System.out.print("Informe o valor de B: ");
		double b = scan.nextDouble();
		System.out.print("Informe o valor de C: ");
		double c = scan.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			System.out.println("Delta negativo, a equação não possui raízes reais... Encerrando o programa.");
			System.exit(0);
		}else if(delta == 0) {
			double raiz = -b / 2 * a;
			System.out.println("Delta = 0, A equação só possui uma raiz. E ela é: " + raiz);
			
		}else {
			double r1 = (-b + Math.sqrt(delta)) / 2 * a;
			double r2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println("\nA equação possui duas raízes.\nDelta: " + delta + "\nRaiz 1: " + r1 + "\nRaiz 2: " + r2);
		}
		scan.close();
		
	}
}
