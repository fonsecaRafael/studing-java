package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class MetrosParaCm {

	public static void main(String[] args) {
		// recebe um valor de metros e converte para centímetros
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor em metros: ");
		float metros = scan.nextFloat();
		System.out.println("Este valor corresponde a " + (metros * 100) + " centímetros.");
		scan.close();

	}

}
