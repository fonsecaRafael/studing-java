package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int resultado = scanner.nextInt();
		System.out.print("Informe o segundo número: ");
		resultado += scanner.nextInt();
		System.out.println("A soma destes números é: " + resultado);
		scanner.close();
	}
}
