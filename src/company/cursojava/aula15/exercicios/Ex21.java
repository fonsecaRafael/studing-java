package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex21 {
	
	public static void main (String[] args) {
		// Make an ATM that receive a integer value and return some money notes
		// Value of notes 100, 50, 10, 5, 1 -- Always minimum amount of notes.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How much do you want to withdraw?\t");
		int withdraw = scan.nextInt();
		scan.close();
		System.out.print("\n");
		if (withdraw < 10 || withdraw > 600) {
			System.out.println("Not possible, the value must be between 10 and 600.");
			System.exit(1);
		}
		
		int notes100, notes50, notes10, notes5, notes1, remaining;
		notes100 = withdraw / 100;
		remaining = withdraw - notes100 * 100;
		
		notes50 = remaining / 50;
		remaining = remaining - notes50 * 50;
		
		notes10 = remaining / 10;
		remaining = remaining - notes10 * 10;
		
		notes5 = remaining / 5;
		notes1 = remaining - notes5 * 5;
		
		String result = "Notes of 100:\t" + notes100 + "\nNotes of 50:\t" + notes50 
				+ "\nNotes of 10:\t" + notes10 + "\nNotes of 5:\t" + notes5 + "\nNotes of 1:\t" + notes1;
	
		System.out.println(result);
	}
}
