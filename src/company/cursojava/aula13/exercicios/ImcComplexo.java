package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class ImcComplexo {

	
	public static void main(String[] args) {
		
		// Colete altura e sexo, calcule o imc segundo:
		// Homens (72,7 * altura) - 58
		// mulheres (62,1 * altura) - 44,7
		// peça o peso e informe se esta acima, abaixo ou dentro do peso ideal

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe a sua altura em metros: ");
		double h = scanner.nextDouble();
		
		System.out.println("Informe o sexo como h/m: ");
		char gender = scanner.next().charAt(0);
		
		double Imc;
		
		if (gender == 'h') {
			Imc = 72.7 * h - 58;
		}
		else {
			Imc = 62.1 * h - 44.7;
		}
		System.out.println("IMC = " + String.format("%,.2f", Imc));
		scanner.close();
		
	}
}