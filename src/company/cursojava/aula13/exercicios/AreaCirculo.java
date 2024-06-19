package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// pede o raio, calcula e mostra a area
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor do raio: ");
		double radius = scan.nextDouble();
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("A area é: " + String.format("%,.2f", area));
		scan.close();
		
	}

}
