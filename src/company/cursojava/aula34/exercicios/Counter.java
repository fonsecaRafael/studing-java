package company.cursojava.aula34.exercicios;

public class Counter {
	// This class should have an static attribute that is incremented every time this class 
	// will be instanced. This class must have methods for reset, increment and return counter value
	// Make a class to test the class.
	static int instances = 0;
	
	Counter(){
		Counter.instances++;
		System.out.println("Constructor called!");
	};
	
	public static void resetCounter() {
		Counter.instances = 0;
	}
	public static void incrementCounter(int increment) {
		Counter.instances += increment;
	}
	public static int getCounter() {
		return Counter.instances;
	}
		
}
