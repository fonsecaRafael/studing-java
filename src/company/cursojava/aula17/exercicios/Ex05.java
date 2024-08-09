package company.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Ask size of two populations and two annual growth rates calc years until the lesser population exceeds or equal
		// the bigger population. Validate the inputs and permit repeat the operation.
		
		Scanner scan = new Scanner(System.in);
		double largestPopulation, smallestPopulation, largestPopGrowthRate, smallestPopGrowthRate;
		int years = 0;
		
		System.out.println("Calculate population growth");
		while(true) {
			
			System.out.print("\nLargest population: ");
			largestPopulation = scan.nextDouble();
			System.out.print("\nLargest population growth rate: ");
			largestPopGrowthRate = scan.nextDouble() / 100;
			System.out.print("\nSmallest population: ");
			smallestPopulation = scan.nextDouble();
			System.out.print("\nSmallest population growth rate: ");
			smallestPopGrowthRate = scan.nextDouble() / 100;
			
			if (largestPopulation <= smallestPopulation || largestPopGrowthRate >= smallestPopGrowthRate) {
				System.out.println("\nWrong data.\nLargest population growth rate should be lesser than the smallest population");
				continue;
			}
			
			while(smallestPopulation < largestPopulation) {
				years++;
				smallestPopulation += smallestPopulation * smallestPopGrowthRate;
				largestPopulation += largestPopulation * largestPopGrowthRate;
			}
			
			System.out.println("Years: " + years);
			
			System.out.println("\nDo you want to do another calculation? (s/n)");
			if (scan.next().equalsIgnoreCase("n")) {
				System.out.println("\nClossing the application...");
				scan.close();
				System.exit(0);
			}
		}

	}

}
