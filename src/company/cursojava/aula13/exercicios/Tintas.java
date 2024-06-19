package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Tintas {

	public static void main(String[] args) {
		// Colete metros² a serem pintados -- cobertura 1L para 3m²
		// Latas 18L - 80 R$ -- Informe a qtd de latas a serem compradas e o valor
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos m² serão pintados: ");
		int coverageNeeded = scan.nextInt();
		
		final int COVERAGE_BY_CAN = 18 * 3;
		int cansNeeded = Math.ceilDiv(coverageNeeded, COVERAGE_BY_CAN);
		System.out.println("Você precisará comprar " + cansNeeded + " latas de tinta.\rTotalizando R$ " + cansNeeded*80 + ",00");
		scan.close();
		
	}

}
