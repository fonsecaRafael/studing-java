package company.cursojava.aula17.exercicios;

public class Ex16 {

	public static void main(String[] args) {
		// Print Fibonacci terms, while the term is less than 500.
		int termMinus2 = 0, termMinus1 = 1, fibonacci = 0;
		
		System.out.print("0, 1, ");
		while(fibonacci < 500) {
			fibonacci = termMinus2 + termMinus1;
			System.out.print(fibonacci + ", ");
			termMinus2 = termMinus1;
			termMinus1 = fibonacci;
		}
	}
}
