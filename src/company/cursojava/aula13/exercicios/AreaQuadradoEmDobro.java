package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class AreaQuadradoEmDobro {

	public static void main(String[] args) {
		// TODO Calule a area do quadradr e retorne o dobre dele
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a area do quadrado: ");
		float size = scan.nextFloat();
		float result = 2 * (size * size);
		System.out.println("O dobro da área deste quadrado é: " + String.format("%,.2f", result));
		scan.close();
		
	}

}
