package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class NotasBimestrais {
	
	public static void main(String[] args) {
		//Peça 4 notas e devolva a média.... No console use virgula para as casas decimais.
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe 4 notas bimestrais separadas por espaço: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		double n4 = scan.nextDouble();
		double media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("A média das notas é: " + media);
		scan.close();
		
	}

}
