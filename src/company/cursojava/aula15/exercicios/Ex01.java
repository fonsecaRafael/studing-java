package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Peça dois números imprima o maior
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe dois números: ");
		double num1 = scan.nextDouble(), num2 = scan.nextDouble();
		scan.close();
		
		if(num1 > num2) {
			System.out.println(num1);
		}else if(num2 > num1) {
			System.out.println(num2);
		}

	}

}
