package company.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("1 AND 2: " + resultado1);

		resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("1 OR 2: " + resultado1);
		
		boolean verdade = true;
		boolean falso = false;
		System.out.println(verdade && falso);
		System.out.println(verdade || falso);
		System.out.println(verdade ^ falso);
		System.out.println(verdade && !falso);
	}

}
