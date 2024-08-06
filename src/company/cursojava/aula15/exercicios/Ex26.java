package company.cursojava.aula15.exercicios;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// An auto post is on sale
		// E - Ethanol $1,90/L discount <= 20L 3% -- > 20L 5% 
		// B - Benzina $2,50/L discount <= 20L 4% -- > 20L 6%
		// Ask liters sold and type. Calc and print the price.
		Scanner scan = new Scanner(System.in);
		System.out.print("What kind of fuel do you want (E/B)?\t");
		char auxiliary = scan.next().charAt(0); 
		boolean ethanol = auxiliary == 'E';
		boolean benzina = auxiliary == 'B';
		if (!ethanol && !benzina) {
			System.out.println("\nWe only have Ethanol and Benzina at this moment.\nPlease choose between E and B.");
			System.exit(1);
		}
		System.out.print("How many liters of fuel were sold?\t");
		double liters = scan.nextDouble();
		scan.close();
		
		double priceLiter = ethanol ? 1.9 : 2.5;
		double discount;
		if (ethanol) {
			if (liters > 20) {
				discount = 0.95;
			} else {
				discount = 0.97;
			}
		} else {
			if (liters > 20) {
				discount = 0.94;
			} else {
				discount = 0.96;
			}
		}
		double price = priceLiter * liters * discount;
		System.out.println("Total a pagar: \t" + price);

	}

}
