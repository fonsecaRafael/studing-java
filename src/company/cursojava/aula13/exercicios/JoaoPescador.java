package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class JoaoPescador {

	public static void main(String[] args) {
		// Colete kilos de peixe pescados se acima de 50 multa de 4 por kilo
		// mostre a qtd em excesso e o valor da multa
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos kilos foram pescados? ");
		int kilos = scan.nextInt();
		int excesso = 0, multa = 0;
		
		if (kilos > 50) {
			excesso = kilos - 50;
			multa = excesso * 4;
		}
		
		System.out.println(String.format("Excesso: %d\rMulta: %d", excesso, multa));
		scan.close();

	}
	
}
