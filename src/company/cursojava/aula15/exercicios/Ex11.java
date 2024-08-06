package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// Leia salário, reajuste segundo
		// < 280 20%
		// 280 - 700 15%
		// 700 - 1500 10%
		// 1500 > 5%
		// exibir salario inicial - percentual de aumento - aumento - novo salario
		
		Scanner scan = new Scanner(System.in);
		double raiseTier0 = 0.2, raiseTier1 = 0.15, raiseTier2 = 0.1, raiseTier3 = 0.05, newSalary, used;
		
		System.out.print("Informe o valor do salário: ");
		double salary = newSalary = scan.nextDouble();
		
		if (salary < 280) {
			newSalary += salary * raiseTier0;
			used = raiseTier0;
		}else if (salary < 700) {
			newSalary += salary * raiseTier1;
			used = raiseTier1;
		}else if (salary < 1500) {
			newSalary += salary * raiseTier2;
			used = raiseTier2;
		}else {
			newSalary += salary * raiseTier3;
			used = raiseTier3;
		}
		
		System.out.println("Salário inicial: " + salary);
		System.out.println("Aumento de: " + used * 100 + "%");
		System.out.println("Aumento: " + salary * used);
		System.out.println("Novo salário: " + newSalary);
		scan.close();
		
	}
}
