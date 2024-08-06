package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex20 {
	// Leia 3 notas de um aluno, calcule a media, mostre:
	// reprovado media < 7 // aprovado media > 7 // aprovado com distinção media = 10
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira a primeira nota:\t");
		float n1 = scanner.nextFloat();
		System.out.print("\nInsira a segunda nota:\t");
		float n2 = scanner.nextFloat();
		System.out.print("\nInsira a terceira nota:\t");
		float n3 = scanner.nextFloat();
		scanner.close();
		int media = (int) Math.floor((n1 + n2 + n3)/3);
		switch (media) {
		case 10: {
			System.out.println("\nAprovado com distinção.");
			break;
		}
		case 7, 8, 9:{
			System.out.println("\nAprovado.");
			break;
		}
		default:
			System.out.println("\nReprovado.");
			break;
		}
	}

}
