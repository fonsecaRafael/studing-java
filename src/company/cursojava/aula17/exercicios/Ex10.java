package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Ask two numbers, print the integers between them.
		int start, end;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insert the start number: ");
		start = scan.nextInt();
		System.out.print("Insert the end number: ");
		end = scan.nextInt();
		scan.close();
		
		if (start < end) {
			for (int i = start + 1; i < end; i++) {
				System.out.print(i + " ");
			}
		} else if (start > end) {
			for (int i = start; i > end; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Start and end numbers must be different.\nClosing app...");
		}
	}
}
