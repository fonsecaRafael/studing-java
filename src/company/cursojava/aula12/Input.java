package company.cursojava.aula12;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite seu nome completo: ");
//		String fullName = scan.nextLine();
//		System.out.println("Seu nome completo é " + fullName);
//		
//		System.out.println("Digite seu primeiro nome: ");
//		String firstName = scan.next();
//		System.out.println("Seu idade é " + fullName);		
//		
//		System.out.println("Digite a sua idade: " );
//		int age = scan.nextInt();
//		System.out.println("Sua idade é: ");
//		
//		System.out.println("Digite a sua altura: " );
//		double heigth = scan.nextDouble();
//		System.out.println("Sua altura é: ");
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pet: " );
		String name = scan.next();
		int age = scan.nextInt();
		byte qttSons = scan.nextByte();
		float height = scan.nextFloat();
		boolean pet = scan.nextBoolean();
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro nome " + name);
		System.out.println("Idade " + age );
		System.out.println("Qtd de filhos " + qttSons);
		System.out.println("Altura: " + height);
		System.out.println("Possui pet: " + pet);
	}

}
