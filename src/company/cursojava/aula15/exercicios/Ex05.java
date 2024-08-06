package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Receba duas notas e calcule a média e apresente aprovado se > 7 else reprovado e se 10 aprovado com distinção
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe duas notas: ");
		double grade1 = scan.nextDouble(), grade2 = scan.nextDouble();
		double media = (grade1 + grade2) / 2;
		
		if (media < 7) {
			System.out.println("Reprovado");
		}else if(media < 10) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Aprovado com distinção");
		}
		
		scan.close();
	}
}
