package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// Ask a number, if not between 1 and 10, show an error message and continue asking
		Scanner scan = new Scanner(System.in);
		boolean end = false;
		int number;
		
		while(!end){
			System.out.print("Insert a number between 1 and 10: ");
			number = scan.nextInt();
			if (number > 0 && number < 11) {
				System.out.print("Thank you! See you next time!");
				end = true;
				scan.close();
				break;
			}
			System.out.println("The number must be between 1 and 10!\n");
		}
	}

}
