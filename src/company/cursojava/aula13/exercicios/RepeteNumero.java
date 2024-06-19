package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class RepeteNumero {

	public static void main(String[] args) {
		//Peça um número e informe, "O numero informado foi ... "
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = scan.nextInt();
		System.out.println("O numero informado foi: " + numero);
		scan.close();

	}

}
