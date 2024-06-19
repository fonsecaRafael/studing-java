package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class DoisIntUmFloat {

	public static void main(String[] args) {
		// Pede 2 inteiros e 1 float e calcule:
		// O produto do dobro do primeiro COM metade do segundo
		// A soma do triplo do primeiro com o terceiro
		// O terceiro ao cubo
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe dois números inteiros e um número real separados por espaço: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		double num3 = scan.nextDouble();
		System.out.println("2*primeiro * segundo/2 = " + (2*num1*num2/2));
		System.out.println("(3*primeiro) + terceiro = " + ((3*num1) + num3));
		System.out.println("terceiro³ = " + Math.pow(num3, 3));
		scan.close();

	}

}
