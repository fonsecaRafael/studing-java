package company.cursojava.aula17.exercicios;

public class Ex04 {

	public static void main(String[] args) {
		// Country		Population	 Annual growth rate
		//	  A			  80.000	   	   3%
		//	  B			 200.000	   	   1.5%
		// How many years will it take until the population of country A exceeds or equal the population of country B?
		
		double POPULATION_A = 80000, POPULATION_B = 200000, GROWTH_RATE_A = 0.03, GROWTH_RATE_B = 0.015;
		int years = 0;
		
		while (POPULATION_B > POPULATION_A) {
			years++;
			POPULATION_A += POPULATION_A * GROWTH_RATE_A;
			POPULATION_B += POPULATION_B * GROWTH_RATE_B;
		}
		System.out.println("Years: " + years);
	}
}
