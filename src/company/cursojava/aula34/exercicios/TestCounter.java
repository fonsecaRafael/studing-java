package company.cursojava.aula34.exercicios;

public class TestCounter {

	public static void main(String[] args) {
		System.out.println("Currently instances: " + Counter.instances);
		Counter counter = new Counter();
		System.out.println("Currently instances: " + Counter.getCounter());
		Counter.resetCounter();
		System.out.println("\nReset Counter called.");
		System.out.println("Value in counter: " + Counter.getCounter());
		Counter.incrementCounter(15);
		System.out.println("\nIncrement Counter called.");
		System.out.println("Value in counter: " + Counter.getCounter());

	}

}
