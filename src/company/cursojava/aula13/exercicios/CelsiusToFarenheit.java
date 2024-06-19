package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		//Receber um valor em Celsius e transformar e farenheit
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a temperatura em Celsius: ");
		float celsius = scan.nextFloat();
		System.out.println("Em Farenheit são: " + (celsius * 1.8 + 32));
		scan.close();
		
	}

}
