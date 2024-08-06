package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// Leia um número inteiro menor que mil e descreva a qtd de cents,dezenas, e unidades corretamente
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira um inteiro positivo < 1000: ");
		int unidades = scan.nextInt();
		scan.close();
		
		int centenas = unidades / 100;
		unidades -= centenas * 100;
		int dezenas = unidades / 10;
		unidades -= dezenas * 10;
		
		String strCentenas, strDezenas, strUnidades, strResult;
		
		strCentenas = centenas + " centena";
		if (centenas > 1) {
			strCentenas += "s, ";
		}else {
			strCentenas += ", ";
		}
		
		strDezenas = dezenas + " dezena";
		if (dezenas != 1) {
			strDezenas += "s e ";
		}else {
			strDezenas += " e ";
		}
		
		strUnidades = unidades + " unidade";
		if (unidades != 1) {
			strUnidades += "s";
		}
		
		if (centenas > 0) {
			strResult = strCentenas + strDezenas + strUnidades;
		}else {
			if (dezenas > 0) {
				strResult = strDezenas + strUnidades;
			}else {
				strResult = strUnidades;				
			}
		}
		System.out.println(strResult);
		
	}
}
