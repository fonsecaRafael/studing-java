package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class CalculaSalario {

	public static void main(String[] args) {
		//pede o valor da hora e a qtd de horas trabalhadas, calcula o valor do saláro
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor da hora trabalhada e a quantidade de horas trabalhadas separadas por espaço: ");
		float horaTrabalhada = scan.nextFloat();
		int horas = scan.nextInt();
		System.out.println("O salário será: " + (horaTrabalhada * horas));
		scan.close();
		
	}

}
