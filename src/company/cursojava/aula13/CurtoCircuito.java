package company.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		boolean verdade = true;
		boolean falso = false;
		
		// && nem checa o lado direito da equação caso o lado esquerdo seja falso, possível detectar depurando
		boolean resultado1 = falso & verdade;
		boolean resultado2 = falso && verdade;
		
		System.out.println(resultado1);
		System.out.println(resultado2);

		// Exercícios https://pt.slideshare.net/slideshow/curso-java-bsico-exerccios-aulas-11-12-13/43425024
	}

}
