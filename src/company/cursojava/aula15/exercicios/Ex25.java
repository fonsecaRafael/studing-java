package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// Make five questions, classify based in quantity of true.

		int counter = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Answer all the questions with y for yes or any other character for no.");
		System.out.print("Did you call the victim?\t");
		if (scan.next().charAt(0) == 'y') {
			counter++;
		}
		
		System.out.print("Were you at the crime scene?\t");
		if (scan.next().charAt(0) == 'y') {
			counter++;
		}
		
		System.out.print("Do you live near the victim?\t");
		if (scan.next().charAt(0) == 'y') {
			counter++;
		}
		
		System.out.print("Did you owe the victim money?\t");
		if (scan.next().charAt(0) == 'y') {
			counter++;
		}
		
		System.out.print("Have you ever worked with the victim?\t");
		if (scan.next().charAt(0) == 'y') {
			counter++;
		}
		scan.close();
		
		switch (counter) {
			case 0, 1: {
				System.out.println("\nInnocent");
				break;
			}
			case 2: {
				System.out.println("\nSuspect");
				break;
			}
			case 3, 4: {
				System.out.println("\nAccomplice");
				break;
			}
			case 5: {
				System.out.println("\nMurderer");
				break;
			}
		}

	}

}
