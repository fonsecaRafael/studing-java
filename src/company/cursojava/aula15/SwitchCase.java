package company.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um número de 1 a 7");
		int day = in.nextInt();
		in.close();
		
		switch (day) {
		case 1: System.out.println("Segunda"); break;
		case 2: System.out.println("Terça"); break;
		case 3: System.out.println("Quarta"); break;
		case 4: System.out.println("Quinta"); break;
		case 5: System.out.println("Sexta"); break;
		case 6: System.out.println("Sábado"); break;
		case 7: System.out.println("Domingo"); break;
		default:System.out.println("Não é um dia da semana válido.");
		}

	}

}
