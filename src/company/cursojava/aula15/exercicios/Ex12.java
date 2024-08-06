package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		//Enunciado gigante, não vou transcrever.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor da hora trabalhada: ");
		double workedHour = scan.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		int hours = scan.nextInt();
		
		double brute = workedHour * hours;
		double inss = brute * 0.1;
		double sindicate = brute * 0.03;
		double fgts = brute * 0.11;
		double irpfRate;
		if (brute <= 900) {
			irpfRate = 0;
		}else if (brute <= 1500) {
			irpfRate = 0.05;
		}else if (brute <= 2500) {
			irpfRate = 0.1;
		}else {
			irpfRate = 0.2;
		}
		double irpf = brute * irpfRate;
		double discounts = inss + sindicate + irpf;
		double netSalary = brute - discounts;
		
		String strBrute = String.format("Salário Bruto: (%,.2f * %d)\t: R$%,.2f\r", workedHour, hours, brute);
		String strIr = String.format("(-) IR (%,.2f%%) \t\t\t:  R$ %,.2f\r", irpfRate * 100, irpf);
		String strInss = String.format("(-) INSS ( 10%%) \t\t: R$ %,.2f\r", inss);
		String strSindicate = String.format("(-) Sindicato ( 3%%) \t\t: R$%,.2f\r", sindicate);
		String strFgts = String.format("FGTS (11%%) \t\t\t: R$%,.2f\r", fgts);
		String strDiscounts = String.format("Total de descontos \t\t: R$%,.2f\r", discounts);
		String strNetSalary = String.format("Salário Líquido: \t\t: R$%,.2f\r", netSalary);
		String result = strBrute + strIr + strInss + strSindicate + strFgts + strDiscounts + strNetSalary;
		
		System.out.println(result);
		scan.close();
	}
}
