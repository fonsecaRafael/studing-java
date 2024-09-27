package company.cursojava.aula34.exercicios;

public class Factorial extends Calculator{
	// Write a class to calculate factorial in the class Calculator.
	public static int calcFactorial(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result *= i;
		}
		return result;
	}
}
