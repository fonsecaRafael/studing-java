package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Inss {

	
	public static void main(String[] args) {
		// Colete salario por hora e qtd de horas trabalhadas no mês
		// Calcule e mostre salario bruto -- INSS 8% -- Sindicato 5% -- Líquido -- IR 11%
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe quanto você recebe por hora e quantas horas você trabalha no mês, separados por espaço: ");
		double salaryByHour = scan.nextDouble();
		int hours = scan.nextInt();
		
		double salaryBrute = salaryByHour * hours;
		double inss = salaryBrute * 0.08;
		double irpf = salaryBrute * 0.11;
		double sindicate = salaryBrute * 0.05;
		double salaryNet = salaryBrute - (inss + irpf + sindicate);
		String result = String.format("Bruto: %,.2f\rINSS: %,.2f\rIRPF: %,.2f\rSindicato: %,.2f\rLíquido: %,.2f\r", salaryBrute, inss, irpf, sindicate, salaryNet);
				
		System.out.println(result);
		scan.close();
	}
}
