package company.cursojava.aula35.exercicios;

public class Sum {
	// Receive a number and return the sum of all the number from 1 till the number. Recursive and Static method
	
	public static int CalculateSum(int num) {
		if (num < 1) {
			System.out.println("The number must be greater than 1.");
			System.exit(-1);
		}
		if (num == 1) {
			return 1;
		}

		return num + CalculateSum(--num);
	}
}
