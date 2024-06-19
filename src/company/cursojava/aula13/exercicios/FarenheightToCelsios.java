package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class FarenheightToCelsios {

	public static void main(String[] args) {
		//Receba um valor em Farenheit informe em Celsius
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a temperatura em Farenheit: ");
		int farenheit = scan.nextInt();
		System.out.println("Em Celsius são " + (farenheit -32)/1.8);
		scan.close();
		
	}

}
