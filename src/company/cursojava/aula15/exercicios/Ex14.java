package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//leia duas notas, calcule a média, atribua o conceito
		// informe as notas, a media, o conceito e se aprovado ou reprovado
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe as notas: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double media = (n1 + n2) / 2;
		
		char concept;
		if (media <= 4) {
			concept = 'E';
		}else if (media <= 6) {
			concept = 'D';
		}else if (media <= 7.5) {
			concept = 'C';
		}else if (media <= 9) {
			concept = 'B';
		}else {
			concept = 'A';
		}
		
		System.out.println("Primeira nota: " + n1);
		System.out.println("Segunda nota: " + n2);
		System.out.println("Media: " + media);
		System.out.println("Conceito: " + concept);
		
		switch (concept) {
		case 'A':
		case 'B':
		case 'C': System.out.println("APROVADO"); break;
		case 'D':
		case 'E': System.out.println("REPROVADO"); break;
		}
	}
}
