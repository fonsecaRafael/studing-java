package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Imc {

	
	public static void main(String[] args) {
		// Calcule o IMC segundo (72.7 * h) - 58
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a sua altura em metros: ");
		double h = scan.nextDouble();
		double Imc = 72.7 * h - 58;
		System.out.println("IMC = " + String.format("%,.2f", Imc));
		scan.close();
		
	}
}
