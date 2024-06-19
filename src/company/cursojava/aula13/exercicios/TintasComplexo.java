package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class TintasComplexo {

	public static void main(String[] args) {
		// Colete metros² a serem pintados -- cobertura 1L para 6m²
		// Latas 18L - 80 R$ OU 3.6L - R$ 25 
		// Informe a qtd de latas a serem compradas e o valor
		// Comprando apenas latas pequenas
		// Apenas latas grandes
		// Menor preço, Acrescente 10% de folga e considere apenas latas cheias
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos m² serão pintados: ");
		int coverageNeeded = scan.nextInt();
		
		final int COVERAGE_BIG_CAN = 18 * 6; // 108 m
		final double COST_BIG_CAN = 80.00;
		
		final double COVERAGE_SMALL_CAN = 18 * 3.6; // 64,8 m
		final double COST_SMALL_CAN = 25.00;
		
		int qtdSmallCans = (int) Math.ceil(coverageNeeded / COVERAGE_SMALL_CAN);
		int qtdBigCans = Math.ceilDiv(coverageNeeded, COVERAGE_BIG_CAN);
		
		String qtdCans = "Você precisará comprar %d latas de tinta %s. ";
		String costCans = "Totalizando R$ %,.2f";
		
		String onlySmallCans = String.format(qtdCans + costCans, qtdSmallCans, "pequenas", qtdSmallCans * COST_SMALL_CAN);
		String onlyBigCans = String.format(qtdCans + costCans, qtdBigCans, "grandes", qtdBigCans * COST_BIG_CAN);
		
		double newNeeded = coverageNeeded * 1.1;
		qtdBigCans = (int) Math.floor(newNeeded / COVERAGE_BIG_CAN);
		double remainder = newNeeded - (qtdBigCans * COVERAGE_BIG_CAN);
		qtdSmallCans =  (int) Math.ceil(remainder / COVERAGE_SMALL_CAN);
		double costTotal = ((qtdBigCans * COST_BIG_CAN) + (qtdSmallCans * COST_SMALL_CAN));
		System.out.println(costTotal);
		String mixingCans = String.format(qtdCans + qtdCans + costCans, 
				qtdBigCans, "grandes", qtdSmallCans, "pequenas", costTotal);
		
		System.out.println(onlySmallCans);
		System.out.println(onlyBigCans);
		System.out.println(mixingCans);
		scan.close();

	}

}
