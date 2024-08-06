package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//Peça uma letra, confirme se é F ou M, imprima a correspondência
		Scanner scan = new Scanner(System.in);
		char letter = scan.next().charAt(0);
		if (letter == 'F') {
			System.out.println("Feminino.");
		}else if(letter == 'M') {
			System.out.println("Masculino.");
		}
		else{
			System.out.println("Sexo inválido.");
		}
		
	}
}
