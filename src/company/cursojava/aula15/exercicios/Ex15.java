package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		//Leia 3 lados de um triangulo, informe se pode ser um triangulo e qual tipo
		int iguais = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe os 3 lados do possível triangulo: ");
		double l1 = scan.nextDouble();
		double l2 = scan.nextDouble();
		if (l1 == l2) {
			iguais++;
		}
		double l3 = scan.nextDouble();
		if (l3 == l1){
			iguais++;
		}
		if (l3 == l2){
			iguais++;
		}
		
		boolean triangulo = ((l1 + l2) > l3) && ((l1 + l3) > l2) && ((l2 + l3) > l1);
		
		if (triangulo) {
			System.out.print("Os valores podem formar um triangulo ");
			switch (iguais) {
			case 3: System.out.println("equilátero."); break;
			case 1: System.out.println("isóceles."); break;
			default:
				System.out.println("escaleno."); 
			}
		}else {
			System.out.println("Não é um triangulo");
		}
		scan.close();
		
	}

}
