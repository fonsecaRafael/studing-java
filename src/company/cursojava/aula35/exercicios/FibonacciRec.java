package company.cursojava.aula35.exercicios;

public class FibonacciRec{
	// Make a recursive function that given a term calculate the Fibonacci number
	final static int FIRST_TERM = 0, SECOND_TERM = 1;
	int termMinus1, termMinus2;
	public static int fibonacciTerm(int term) {
		if (term <= 1) {
			return FIRST_TERM;
		} else if (term == 2) {
			return SECOND_TERM;
		}

		return fibonacciTerm(term - 2) + fibonacciTerm(--term);
	}
}
