package company.cursojava.aula34.exercicios;

public class TestCalculator {
	public static void main(String[] args) {
		System.out.println(Calculator.sum(0, 15));
		System.out.println(Calculator.sum(0.5, 4));
		System.out.println(Calculator.sum(0.1, 0.3));
		System.out.println();
		System.out.println(Calculator.sub(0, 2));
		System.out.println(Calculator.sub(10, 0.6));
		System.out.println(Calculator.sub(0.8, 0.2));
		System.out.println();
		System.out.println(Calculator.mult(10, 2));
		System.out.println(Calculator.mult(2.5, 4));
		System.out.println(Calculator.mult(2.5, 2.5));
		System.out.println();
		System.out.println(Calculator.div(10, 2));
		System.out.println(Calculator.div(15, 2.5));
		System.out.println(Calculator.div(18.4, 2.2));
	}
}
