package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//Leia 3 preços informe o menor
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Preço primeiro produto: ");
		double smaller = scan.nextDouble();
		
		System.out.print("Preço primeiro produto: ");
		double price = scan.nextDouble();
		if (price < smaller) {
			smaller = price;
		}
		
		System.out.print("Preço primeiro produto: ");
		price = scan.nextDouble();
		if (price < smaller) {
			smaller = price;
		}
		
		System.out.println("Compre o produto com preço: " + smaller);
		scan.close();
	}
}
