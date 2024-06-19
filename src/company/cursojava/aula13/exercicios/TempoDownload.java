package company.cursojava.aula13.exercicios;

import java.util.Scanner;

public class TempoDownload {

	public static void main(String[] args) {
		// Colete Tamanho do arquivo(mb) e Velocidade de Download(mb/s)
		// Informe o tempo de download em minutos
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o tamanho do arquivo em Mb e a Velocidade de download em mb/s: ");
		double size = scan.nextDouble(), speedByMinute = scan.nextDouble()*60;
		double time = size / speedByMinute;
		System.out.println("Este download levará " + time + " minutos.");
		scan.close();
		
	}

}
